import java.util.Scanner;

public class hello {
    public static void main(String[] args) {
        System.out.println("Java program is running.");
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter your age: ");
        String ageText = input.nextLine();

        try {
            int age = Integer.parseInt(ageText.trim());
            System.out.println("Hello, " + name + "! You are " + age + " years old.");
            System.out.println("Next year you will be " + (age + 1) + ".");
        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid number for your age.");
        }

        input.close();
    }
}