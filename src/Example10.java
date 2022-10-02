import java.util.Scanner;

public class Example10 {
    public static void main(String [] argv) {
        float number;

        System.out.println("Write a number");
        Scanner inputValue;
        inputValue = new Scanner(System.in);
        number = inputValue.nextFloat();

        if(number >= 0) {
            System.out.println("Is positive");
        } else {
            if(number <= 1) {
                System.out.println("Is negative");
            }
        }

    }
}
