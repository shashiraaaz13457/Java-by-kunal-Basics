package A1;
// Program for printing largest number.
import java.util.Scanner;

public class Q5LargestNo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number : ");
        int num2 = input.nextInt();

        if (num1>num2){
            System.out.print("Largest number is : " + num1);
        } else {
            System.out.print("Largest number is : " + num2);
        }
    }
}
