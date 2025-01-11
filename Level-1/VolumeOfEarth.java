public class VolumeOfEarth {
    public static void main(String[] args) {
		//create variable named radiusInKms and assign radius in km
        int radiusInKms = 6378;
		//convert  radius of earth in km to radius of earth in miles
        double radiusInMiles = radiusInKms * 1.6;
		//calculate volume of earth in cubic kilometers
        double volumeInKms = (4.0/3.0)*3.14*Math.pow(radiusInKms,3);
		//calculate volume of earth in cubic miles
        double volumeInMiles = (4.0/3.0)*3.14*Math.pow(radiusInMiles,3);
		//print volume of earth in cubic kilometers and cubic miles
        System.out.println("The volume of earth in cubic kilometers is:"+volumeInKms+" "+ "and cubic miles is:"+ volumeInMiles);
    }
}