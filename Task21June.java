import java.util.Scanner;
public class Task21June {
    public static void main(String[] args){
        Scanner math = new Scanner(System.in);
        System.out.print("Welcome to the calculator application, if you do not want to continue in the application type \"no\" or \"n\", otherwise \"enter\": ");
        String exit = math.nextLine();
        if (exit.equals("no") || exit.equals("n")){
            System.exit(0);
        }
        System.out.print("Please enter the code of the operation you want to perform: 1.Sum 2.Subtraction 3.Multiplication 4.Division: ");
        int operations = math.nextInt();
        System.out.print("Please enter the 2 integer number for the operation: ");
        int numberOne = math.nextInt();
        int numberTwo = math.nextInt();

        if (operations == 1){
            System.out.print("The result of the sum is " + (numberOne + numberTwo));
        } else if (operations == 2){
            System.out.print("The result of the subtraction is " + (numberOne - numberTwo));
        } else if (operations == 3){
            System.out.print("The result of the multiplication is " + (numberOne * numberTwo));
        } else if (operations == 4){
            System.out.print("The result of the division is " + (numberOne / numberTwo));
        } else {
            System.out.print("The operation is not available");
        }
    }
}
