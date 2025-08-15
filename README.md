# University of Ghana - Campus Route Finder

A comprehensive Java Swing-based frontend application for finding and managing routes on the University of Ghana (Legon) campus with advanced features for sorting, landmark filtering, and visual route representation.

## Features

### 1. User Interface (UI)
- **Start Location Input**: Enter your starting point on campus
- **Destination Input**: Enter your destination on campus
- **Landmark Selection**: Optionally specify landmarks you want to pass through
- **Action Buttons**: Find routes, sort results, and clear inputs

### 2. Route Results Display
- **Multiple Routes**: Shows 5 possible routes for each search
- **Comprehensive Information**: Distance, estimated time, and landmarks for each route
- **Table Format**: Clean, organized display with sortable columns
- **Route Path**: Visual representation of the complete route

### 3. Sorting Controls
- **Sort by Distance**: Arrange routes from shortest to longest
- **Sort by Time**: Arrange routes from fastest to slowest
- **Real-time Sorting**: Instant results with visual feedback

### 4. Landmark Search Feature
- **Landmark Filtering**: Search for routes passing through specific landmarks
- **Smart Matching**: Case-insensitive search with partial matching
- **Highlighted Results**: Routes with matching landmarks are clearly displayed

### 5. Visual Route Representation
- **Route Map Panel**: Text-based map showing route details
- **Landmark Visualization**: Clear indication of landmarks along each route
- **Path Display**: Step-by-step route visualization

### 6. Error Handling & User Experience
- **Input Validation**: Checks for required fields and valid inputs
- **Friendly Error Messages**: Clear, helpful error notifications
- **Status Updates**: Real-time feedback on application state
- **Clear Functionality**: Reset all inputs and results with one click

### 7. Backend Integration Ready
- **Modular Design**: Easy to connect with backend routing algorithms
- **Data Models**: Clean separation between UI and business logic
- **Extensible Architecture**: Simple to add new features and data sources

## University of Ghana Campus Locations

### Main Landmarks
- **Main Gate (Legon)**: Main entrance to the campus
- **Great Hall**: Central ceremonial and administrative building
- **Balme Library**: Main university library
- **Commonwealth Hall**: Student residence hall
- **Volta Hall**: Student residence hall
- **Mensah Sarbah Hall**: Student residence hall
- **Akuafo Hall**: Student residence hall

### Sample Routes
1. **Direct Route**: Main Gate → Great Hall → Balme Library (1.8km, 12 min)
2. **Scenic Route**: Main Gate → Commonwealth Hall → Great Hall → Balme Library (2.4km, 18 min)
3. **Alternative Route**: Main Gate → Volta Hall → Great Hall → Balme Library (2.1km, 15 min)
4. **Extended Route**: Main Gate → Mensah Sarbah Hall → Great Hall → Balme Library (2.7km, 20 min)
5. **Quick Route**: Main Gate → Akuafo Hall → Great Hall → Balme Library (2.3km, 16 min)

## How to Compile and Run

### Prerequisites
- Java 8 or higher
- Any Java IDE (Eclipse, IntelliJ, NetBeans) or command line

### Command Line Compilation
```bash
# Compile all Java files
javac *.java

# Run the application
java Main
```

### IDE Setup
1. Create a new Java project
2. Add all `.java` files to the project
3. Run the `Main` class

## Usage Guide

### 1. Finding Routes
1. Enter your start location in the "Start Location" field
2. Enter your destination in the "Destination" field
3. Optionally enter landmarks you want to pass through
4. Click "Find Routes" or press Enter

### 2. Sorting Results
- **Sort by Distance**: Click "Sort by Distance" to arrange routes from shortest to longest
- **Sort by Time**: Click "Sort by Time" to arrange routes from fastest to slowest

### 3. Landmark Search
- Enter a landmark name in the "Landmarks" field
- Click "Find Routes" to see only routes passing through that landmark
- The search is case-insensitive and supports partial matching

### 4. Clearing Results
- Click "Clear All" to reset all inputs and results
- This will clear the form fields, route table, and map display

### 5. Keyboard Shortcuts
- Press Enter in any text field to find routes
- Use Tab to navigate between fields

## File Structure

```
Location/
├── Main.java              # Application entry point
├── RouteFinderApp.java    # Main application window and UI logic
├── Route.java            # Route data model class
├── run.bat               # Windows launcher script
├── run.sh                # Unix/Linux/Mac launcher script
├── README.md             # This documentation file
├── SETUP_GUIDE.md        # Setup instructions
└── LAUNCHER.md           # Quick launch guide
```

## Technical Details

### UI Framework
- **Java Swing**: Modern, cross-platform GUI framework
- **Layout Managers**: GridBagLayout for precise component positioning
- **Custom Styling**: Professional color scheme and typography

### Data Model
- **Route Class**: Encapsulates route information (number, distance, time, landmarks, path)
- **Collections**: Uses Java Collections Framework for data management
- **Stream API**: Modern Java 8+ features for data filtering and processing

### Architecture
- **MVC Pattern**: Clear separation between UI, data, and logic
- **Event-Driven**: Responsive UI with proper event handling
- **Modular Design**: Easy to extend and maintain

## Customization

### Adding New Features
1. **New Route Properties**: Extend the `Route` class with additional fields
2. **Additional Sorting Options**: Add new sort methods in `RouteFinderApp`
3. **Enhanced Map Display**: Modify the `updateMapDisplay` method
4. **Backend Integration**: Replace `generateSampleRoutes` with actual API calls

### Styling Changes
- Modify colors in `initializeComponents()` method
- Adjust fonts and sizes for different components
- Change layout spacing and component positioning

### Data Sources
- Replace sample data generation with database queries
- Integrate with external mapping APIs
- Connect to real-time location services

## Future Enhancements

- **Interactive Maps**: Integration with Google Maps or OpenStreetMap
- **Real-time Updates**: Live route information and traffic data
- **User Preferences**: Save favorite routes and locations
- **Mobile Support**: Responsive design for different screen sizes
- **Accessibility**: Screen reader support and keyboard navigation
- **Campus Events**: Integration with university event calendar
- **Transport Options**: Include shuttle bus routes and walking paths

## Troubleshooting

### Common Issues
1. **Application won't start**: Ensure Java 8+ is installed and in PATH
2. **UI looks distorted**: Check if system look and feel is properly set
3. **No routes displayed**: Verify that start and destination fields are filled

### Performance Tips
- The application is designed to handle hundreds of routes efficiently
- Large datasets may require pagination in the table
- Consider caching frequently accessed route data

## Support

For questions or issues:
1. Check the error messages displayed in the application
2. Review the console output for detailed error information
3. Ensure all Java files are in the same directory
4. Verify Java version compatibility

---

**Note**: This is a frontend demonstration application specifically designed for the University of Ghana campus. For production use, integrate with actual backend routing algorithms and real campus data. 