import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Temperature Converter");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("Enter your choice (1 or 2): ");
        int choice = scanner.nextInt();

        switch(choice) {
            case 1:
                celsiusToFahrenheit();
                break;
            case 2:
                fahrenheitToCelsius();
                break;
            default:
                System.out.println("Invalid choice. Please enter 1 or 2.");

        }

        scanner.close();


    }

    public static void celsiusToFahrenheit() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature on Celsius: ");
        double celsius =  scanner.nextDouble();

        double fahrenheit = (celsius * 9/5) + 32;

        System.out.println(celsius + "°C = " + fahrenheit + "°F");

        scanner.close();


    }

    public static void fahrenheitToCelsius() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        double celsius = (fahrenheit -32) *5/9;

        System.out.println(fahrenheit + "°F = " + celsius + "°C");
    }
}