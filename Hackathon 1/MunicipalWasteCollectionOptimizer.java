import java.util.Scanner;

public class WasteCollection {

    public static double calculateTotalWaste(double point1Waste, double point2Waste) {
        return point1Waste + point2Waste;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

              int vehicleNumber = 106;
        double wasteCollected = 160.50;
        int collectionPoints = 22;
        char vehicleStatus = 'B';

        System.out.println("=== Vehicle Details ===");
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Waste Collected (kg): " + wasteCollected);
        System.out.println("Number of Collection Points: " + collectionPoints);
        System.out.println("Vehicle Status: " + vehicleStatus);
        System.out.println();

       
        System.out.println("=== Target Status Checker ===");
        System.out.print("Enter waste collected in kg: ");
        double inputWaste = scanner.nextDouble();

        if (inputWaste >= 100.0) {
            System.out.println("Collection Target Achieved");
        } else {
            System.out.println("More Waste Collection Required");
        }
        System.out.println();
        System.out.println("=== Total Waste Calculator ===");
        System.out.print("Enter waste from Point 1 (kg): ");
        double point1 = scanner.nextDouble();

        System.out.print("Enter waste from Point 2 (kg): ");
        double point2 = scanner.nextDouble();

        double totalWaste = calculateTotalWaste(point1, point2);
        System.out.println("Total Waste Collected: " + totalWaste + " kg");

        scanner.close();
}}
