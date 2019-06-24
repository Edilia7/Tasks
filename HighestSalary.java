import java.util.Scanner;
import java.text.DecimalFormat;
public class HighestSalary {
    public static void main(String[] args){
        Scanner highest = new Scanner(System.in);
        DecimalFormat form = new DecimalFormat("0,000.00");
        System.out.print("Please enter the numbers of employees: ");
        int employees = highest.nextInt();
        int[] salary = new int[employees];

        for (int i = 0; i < employees; i++){
            System.out.print("Please enter the salary for the employees " + (i+1)+ ": ");
            salary[i] = highest.nextInt();
        }
        int highestSalary = salary[0];
        for (int i = 1; i < (employees); i++){
            if (salary[i] > highestSalary){
                highestSalary = salary[i];
            } else {
                highestSalary = highestSalary;
            }
        }System.out.print("The highest salary is: $" + form.format(highestSalary));
    }
}
