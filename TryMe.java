import java.util.Scanner;

public class TryMe {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What is your name? ");
        String name = input.nextLine();

        System.out.print("How old are you? ");
        int age = input.nextInt();

        System.out.println();
        System.out.println("Hello, " + name + "!");
        System.out.println("Next year you will be " + (age + 1) + " years old.");
        
        input.close();
    }
}