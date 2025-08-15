import java.util.List;

public class Route {
    private int routeNumber;
    private double distance; // in kilometers
    private int timeMinutes;
    private List<String> landmarks;
    private String path;
    
    public Route(int routeNumber, double distance, int timeMinutes, List<String> landmarks) {
        this.routeNumber = routeNumber;
        this.distance = distance;
        this.timeMinutes = timeMinutes;
        this.landmarks = landmarks;
        this.path = "";
    }
    
    // Getters
    public int getRouteNumber() {
        return routeNumber;
    }
    
    public double getDistance() {
        return distance;
    }
    
    public int getTimeMinutes() {
        return timeMinutes;
    }
    
    public List<String> getLandmarks() {
        return landmarks;
    }
    
    public String getPath() {
        return path;
    }
    
    // Setters
    public void setRouteNumber(int routeNumber) {
        this.routeNumber = routeNumber;
    }
    
    public void setDistance(double distance) {
        this.distance = distance;
    }
    
    public void setTimeMinutes(int timeMinutes) {
        this.timeMinutes = timeMinutes;
    }
    
    public void setLandmarks(List<String> landmarks) {
        this.landmarks = landmarks;
    }
    
    public void setPath(String path) {
        this.path = path;
    }
    
    @Override
    public String toString() {
        return "Route " + routeNumber + " - " + distance + "km, " + timeMinutes + "min";
    }
} 