import java.util.*;
public class EarthVolumeCalculator {
    public static void main(String[] args) {
        // Create a variable radius.
        int radius = 6378;

        //Calculate EarthVolume in km.
        double earthVolumeKm = (4.0 /3.0) * Math.PI * Math.pow(radius,3);

        //Calculate EarthVolume in miles.
        double earthVolumeMile=earthVolumeKm * 0.239913;

        //Display result.
        System.out.printf("The volume of earth in cubic kilometers is %.2f and cubic miles is %.2f",earthVolumeKm,earthVolumeMile); 
    }
}
