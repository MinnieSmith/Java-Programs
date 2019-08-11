public class SpeedConverter {

    public static long toMilesPerHours(double kilometersPerHours) {

        if (kilometersPerHours < 0) {
            return -1;
        }

        return Math.round(kilometersPerHours/1.609);

    }

    public static void printConversion(double kilometersPerHour) {
        if(kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            long milesPerHour = toMilesPerHours(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h " +
                    milesPerHour + " mi/h");
        }
    }
}
