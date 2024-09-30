import java.util.Scanner;

public class NumCompare {
    public static void main(String[] args) {

        int firstNumber;
        int secondNumber;



        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first Number.");
        if (scan.hasNextInt()) {
            firstNumber = scan.nextInt();
            System.out.println("Enter your next number");

            if (scan.hasNextInt()) {
                secondNumber = scan.nextInt();
                    if  (firstNumber > secondNumber) {
                        System.out.println(firstNumber + " is greater than " + secondNumber);
                    }
                    else if (secondNumber > firstNumber){
                        System.out.println(secondNumber + " is greater than " + firstNumber);
                    }
                    else if (firstNumber == secondNumber) {
                        System.out.println(firstNumber + " is equal to " + secondNumber);
                }
            } else {
                System.out.println("You entered the wrong data type");
            }
        }
        else {
            System.out.println("You entered the wrong data type");
        }




    }
}