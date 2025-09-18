package converters;

public class DistanceConverter {
    public static double kilometersToMiles(double km) {
        return km * 0.621371;
    }
    
    public static double milesToKilometers(double miles) {
        return miles / 0.621371;
    }
}
