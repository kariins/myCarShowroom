import cars.Car;
import cars.ShowRoom;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

public class Main {
    ShowRoom showRoom = new ShowRoom();
    public static void main(String[] args) {
Main main = new Main();

main.showMenu();

    }
    void showMenu() {
        Scanner scanner = new Scanner(System.in);
        String userInput = "";

        do {
            System.out.println("\nWelcome to the showroom, please choose an activity: ");
            System.out.println("1. Add Car");
            System.out.println("2. View All Cars");
            System.out.println("3. View Single Car");
            System.out.println("4. Remove Car");
            System.out.println("\nEnter Quit to end program...");

            System.out.println("Choose a number: ");
            userInput = scanner.nextLine();

            switch (userInput) {
                case "quit":
                    System.out.println("Exiting Application");
                    break;
                case "1":
                    addCar();
                case "2":
                    viewAllCars();
                    break;
                case "3":
                    getSingleCar();
                    break;
                case "4":
                    removeCar();
                    break;
                default:
                    break;
            }
        } while (!userInput.equals("Quit"));
        return;
    }
    void addCar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Add Car");

        Car car = new Car();
        System.out.println("Enter Name: ");
        car.name = scanner.nextLine();

        System.out.println("Enter Manufacturer");
        car.manufacturer = scanner.nextLine();

        System.out.println("Enter type: ");
        car.type = scanner.nextLine();

        car.id = UUID.randomUUID();

        String message = showRoom.addCar(car);
        System.out.println(message);

    }
    void viewAllCars() {
        ArrayList<Car> allCars = showRoom.getAllCars();

        System.out.println("\nAll Available Cars\n");
        System.out.println("Car Name\t Manufacturer\t Car type");
        for (Car car: allCars) {
            System.out.println(car.name + "\t" + car.manufacturer + "\t" + car.type);
        }
    }
    void getSingleCar() {
        System.out.println("View Car");
        System.out.println("Please provide car ID");
        Scanner scanner = new Scanner(System.in);
        int carIndex = scanner.nextInt();
        String  message2 = showRoom.getSingleCar(carIndex);
        System.out.println(message2);
//        System.out.println("Car Number: " + car.id);
//        System.out.println("Car Name: " + car.name);
//        System.out.println("Car Manufacturer: " + car.manufacturer);
//        System.out.println("Car Type: " + car.type);

    }
    void removeCar() {
        System.out.println("Remove Car");
        System.out.println("Please provide car ID");
        Scanner scanner = new Scanner(System.in);
        int carIndex = scanner.nextInt();
        System.out.println(showRoom.removeCar(carIndex));

    }
}
