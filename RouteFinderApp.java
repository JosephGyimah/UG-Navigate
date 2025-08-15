import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.util.List;

public class RouteFinderApp extends JFrame {
    // UI Components
    private JTextField startLocationField;
    private JTextField destinationField;
    private JTextField landmarkField;
    private JButton findRoutesButton;
    private JButton sortByDistanceButton;
    private JButton sortByTimeButton;
    private JButton clearButton;
    private JTable routesTable;
    private DefaultTableModel tableModel;
    private JTextArea mapDisplay;
    private JLabel statusLabel;
    
    // Sample data for demonstration
    private List<Route> sampleRoutes = new ArrayList<>();
    
    public RouteFinderApp() {
        setTitle("University of Ghana - Campus Route Finder");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 700);
        setLocationRelativeTo(null);
        
        initializeComponents();
        setupLayout();
        setupEventHandlers();
        loadSampleData();
        
        setVisible(true);
    }
    
    private void initializeComponents() {
        // Input fields
        startLocationField = new JTextField(20);
        destinationField = new JTextField(20);
        landmarkField = new JTextField(20);
        
        // Buttons
        findRoutesButton = new JButton("Find Routes");
        findRoutesButton.setBackground(new Color(70, 130, 180));
        findRoutesButton.setForeground(Color.WHITE);
        findRoutesButton.setFont(new Font("Arial", Font.BOLD, 14));
        
        sortByDistanceButton = new JButton("Sort by Distance");
        sortByDistanceButton.setBackground(new Color(34, 139, 34));
        sortByDistanceButton.setForeground(Color.WHITE);
        
        sortByTimeButton = new JButton("Sort by Time");
        sortByTimeButton.setBackground(new Color(218, 165, 32));
        sortByTimeButton.setForeground(Color.WHITE);
        
        clearButton = new JButton("Clear All");
        clearButton.setBackground(new Color(220, 20, 60));
        clearButton.setForeground(Color.WHITE);
        
        // Table for routes
        String[] columnNames = {"Route #", "Distance (km)", "Time (min)", "Landmarks", "Route Path"};
        tableModel = new DefaultTableModel(columnNames, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        routesTable = new JTable(tableModel);
        routesTable.setRowHeight(60);
        routesTable.getColumnModel().getColumn(0).setPreferredWidth(60);
        routesTable.getColumnModel().getColumn(1).setPreferredWidth(80);
        routesTable.getColumnModel().getColumn(2).setPreferredWidth(80);
        routesTable.getColumnModel().getColumn(3).setPreferredWidth(150);
        routesTable.getColumnModel().getColumn(4).setPreferredWidth(200);
        
        // Map display
        mapDisplay = new JTextArea();
        mapDisplay.setEditable(false);
        mapDisplay.setFont(new Font("Monospaced", Font.PLAIN, 12));
        mapDisplay.setBackground(new Color(245, 245, 245));
        mapDisplay.setBorder(BorderFactory.createTitledBorder("Route Map"));
        
        // Status label
        statusLabel = new JLabel("Ready to find routes on University of Ghana campus");
        statusLabel.setForeground(new Color(70, 130, 180));
        statusLabel.setFont(new Font("Arial", Font.BOLD, 12));
    }
    
    private void setupLayout() {
        setLayout(new BorderLayout());
        
        // Input Panel (North)
        JPanel inputPanel = new JPanel(new GridBagLayout());
        inputPanel.setBorder(BorderFactory.createTitledBorder("University of Ghana Route Information"));
        inputPanel.setBackground(new Color(240, 248, 255));
        
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        
        // Row 1: Start Location
        gbc.gridx = 0; gbc.gridy = 0;
        inputPanel.add(new JLabel("Start Location:"), gbc);
        gbc.gridx = 1;
        inputPanel.add(startLocationField, gbc);
        
        // Row 2: Destination
        gbc.gridx = 0; gbc.gridy = 1;
        inputPanel.add(new JLabel("Destination:"), gbc);
        gbc.gridx = 1;
        inputPanel.add(destinationField, gbc);
        
        // Row 3: Landmarks
        gbc.gridx = 0; gbc.gridy = 2;
        inputPanel.add(new JLabel("Landmarks (optional):"), gbc);
        gbc.gridx = 1;
        inputPanel.add(landmarkField, gbc);
        
        // Row 4: Buttons
        JPanel buttonPanel = new JPanel(new FlowLayout());
        buttonPanel.add(findRoutesButton);
        buttonPanel.add(sortByDistanceButton);
        buttonPanel.add(sortByTimeButton);
        buttonPanel.add(clearButton);
        buttonPanel.setBackground(new Color(240, 248, 255));
        
        gbc.gridx = 0; gbc.gridy = 3;
        gbc.gridwidth = 2;
        inputPanel.add(buttonPanel, gbc);
        
        add(inputPanel, BorderLayout.NORTH);
        
        // Main Content Panel (Center)
        JPanel mainPanel = new JPanel(new BorderLayout());
        
        // Routes Table
        JScrollPane tableScrollPane = new JScrollPane(routesTable);
        tableScrollPane.setBorder(BorderFactory.createTitledBorder("Route Results"));
        mainPanel.add(tableScrollPane, BorderLayout.CENTER);
        
        // Map and Status Panel (South)
        JPanel bottomPanel = new JPanel(new BorderLayout());
        bottomPanel.add(mapDisplay, BorderLayout.CENTER);
        bottomPanel.add(statusLabel, BorderLayout.SOUTH);
        bottomPanel.setPreferredSize(new Dimension(0, 200));
        
        mainPanel.add(bottomPanel, BorderLayout.SOUTH);
        add(mainPanel, BorderLayout.CENTER);
    }
    
    private void setupEventHandlers() {
        findRoutesButton.addActionListener(e -> findRoutes());
        sortByDistanceButton.addActionListener(e -> sortByDistance());
        sortByTimeButton.addActionListener(e -> sortByTime());
        clearButton.addActionListener(e -> clearAll());
        
        // Enter key support for text fields
        startLocationField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    findRoutes();
                }
            }
        });
        
        destinationField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    findRoutes();
                }
            }
        });
    }
    
    private void findRoutes() {
        String start = startLocationField.getText().trim();
        String destination = destinationField.getText().trim();
        String landmarks = landmarkField.getText().trim();
        
        // Input validation
        if (start.isEmpty() || destination.isEmpty()) {
            showError("Please enter both start location and destination.");
            return;
        }
        
        // Simulate backend call
        List<Route> routes = generateSampleRoutes(start, destination, landmarks);
        
        if (routes.isEmpty()) {
            showError("No routes found between the specified locations.");
            return;
        }
        
        displayRoutes(routes);
        updateMapDisplay(routes);
        statusLabel.setText("Found " + routes.size() + " routes on University of Ghana campus");
    }
    
    private void sortByDistance() {
        if (sampleRoutes.isEmpty()) {
            showError("No routes to sort. Please find routes first.");
            return;
        }
        
        sampleRoutes.sort((r1, r2) -> Double.compare(r1.getDistance(), r2.getDistance()));
        displayRoutes(sampleRoutes);
        statusLabel.setText("Routes sorted by distance (shortest first)");
    }
    
    private void sortByTime() {
        if (sampleRoutes.isEmpty()) {
            showError("No routes to sort. Please find routes first.");
            return;
        }
        
        sampleRoutes.sort((r1, r2) -> Integer.compare(r1.getTimeMinutes(), r2.getTimeMinutes()));
        displayRoutes(sampleRoutes);
        statusLabel.setText("Routes sorted by time (fastest first)");
    }
    
    private void clearAll() {
        startLocationField.setText("");
        destinationField.setText("");
        landmarkField.setText("");
        tableModel.setRowCount(0);
        mapDisplay.setText("");
        sampleRoutes.clear();
        statusLabel.setText("Ready to find routes on University of Ghana campus");
    }
    
    private List<Route> generateSampleRoutes(String start, String destination, String landmarks) {
        List<Route> routes = new ArrayList<>();
        
        // Route 1: Direct route via Great Hall
        Route route1 = new Route(1, 1.8, 12, Arrays.asList("Main Gate (Legon)", "Great Hall", "Balme Library"));
        route1.setPath(start + " → Main Gate (Legon) → Great Hall → Balme Library → " + destination);
        routes.add(route1);
        
        // Route 2: Scenic route via Commonwealth Hall
        Route route2 = new Route(2, 2.4, 18, Arrays.asList("Main Gate (Legon)", "Commonwealth Hall", "Great Hall", "Balme Library"));
        route2.setPath(start + " → Main Gate (Legon) → Commonwealth Hall → Great Hall → Balme Library → " + destination);
        routes.add(route2);
        
        // Route 3: Alternative route via Volta Hall
        Route route3 = new Route(3, 2.1, 15, Arrays.asList("Main Gate (Legon)", "Volta Hall", "Great Hall", "Balme Library"));
        route3.setPath(start + " → Main Gate (Legon) → Volta Hall → Great Hall → Balme Library → " + destination);
        routes.add(route3);
        
        // Route 4: Via Mensah Sarbah Hall
        Route route4 = new Route(4, 2.7, 20, Arrays.asList("Main Gate (Legon)", "Mensah Sarbah Hall", "Great Hall", "Balme Library"));
        route4.setPath(start + " → Main Gate (Legon) → Mensah Sarbah Hall → Great Hall → Balme Library → " + destination);
        routes.add(route4);
        
        // Route 5: Via Akuafo Hall
        Route route5 = new Route(5, 2.3, 16, Arrays.asList("Main Gate (Legon)", "Akuafo Hall", "Great Hall", "Balme Library"));
        route5.setPath(start + " → Main Gate (Legon) → Akuafo Hall → Great Hall → Balme Library → " + destination);
        routes.add(route5);
        
        // Filter by landmarks if specified
        if (!landmarks.isEmpty()) {
            routes = routes.stream()
                .filter(route -> route.getLandmarks().stream()
                    .anyMatch(landmark -> landmark.toLowerCase().contains(landmarks.toLowerCase())))
                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
        }
        
        sampleRoutes = new ArrayList<>(routes);
        return routes;
    }
    
    private void displayRoutes(List<Route> routes) {
        tableModel.setRowCount(0);
        
        for (Route route : routes) {
            Object[] row = {
                route.getRouteNumber(),
                String.format("%.1f", route.getDistance()),
                route.getTimeMinutes(),
                String.join(" → ", route.getLandmarks()),
                route.getPath()
            };
            tableModel.addRow(row);
        }
    }
    
    private void updateMapDisplay(List<Route> routes) {
        StringBuilder mapText = new StringBuilder();
        mapText.append("UNIVERSITY OF GHANA CAMPUS ROUTE MAP\n");
        mapText.append("=====================================\n\n");
        
        for (Route route : routes) {
            mapText.append("Route ").append(route.getRouteNumber()).append(":\n");
            mapText.append("Distance: ").append(route.getDistance()).append(" km\n");
            mapText.append("Time: ").append(route.getTimeMinutes()).append(" minutes\n");
            mapText.append("Path: ").append(route.getPath()).append("\n");
            mapText.append("Landmarks: ").append(String.join(" → ", route.getLandmarks())).append("\n");
            mapText.append("--------------------------------------------------").append("\n\n");
        }
        
        mapDisplay.setText(mapText.toString());
    }
    
    private void showError(String message) {
        JOptionPane.showMessageDialog(this, message, "Error", JOptionPane.ERROR_MESSAGE);
        statusLabel.setText("Error: " + message);
    }
    
    private void loadSampleData() {
        // Pre-populate with University of Ghana campus data
        startLocationField.setText("Main Gate (Legon)");
        destinationField.setText("Balme Library");
        landmarkField.setText("Great Hall");
    }
} 