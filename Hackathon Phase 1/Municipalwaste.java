import java.util.Scanner;

public class Municipalwaste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the vehicle number: ");
        String vehicleNumber = scanner.nextLine();
        System.out.print("Enter the amount of waste generated (in kg): ");
        double wastecollected = scanner.nextDouble();
        System.out.print("Enter the Number of Collection Points: ");
        int collectionPoints = scanner.nextInt();
        System.out.print("Enter the Vehicle Status: ");
        String vehicleStatus = scanner.next();
        scanner.close();
    }
}