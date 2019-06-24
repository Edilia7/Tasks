import java.util.Scanner;
import java.text.DecimalFormat;
public class CompanySalary {
    public static void main(String[] args){
        Scanner increase = new Scanner(System.in);
        DecimalFormat form = new DecimalFormat("0,000.00");
        System.out.println("***************************************");
        System.out.println("*Welcome to the salary increase system*");
        System.out.println("***************************************");
        System.out.println("");
        System.out.print("Please enter the numbers of employees: ");
        int employees = increase.nextInt();
        int[] salary = new int[employees];
        double[] NewSalary = new double[employees];
        double payroll = 0;

        for (int i = 0; i < employees; i++){
            System.out.print("Please enter the salary number " + (i+1) + ": ");
            salary[i] = increase.nextInt();
        }
        for (int i = 0; i < employees; i++){
            if (salary[i] < 1000){
                NewSalary[i] = salary[i] * 1.15;
                System.out.println("This is the new salary for the employee " + (i+1) + ": $" + form.format(NewSalary[i]));
            } else{
                NewSalary[i] = salary[i] * 1.12;
                System.out.println("This is the new salary for the employee " + (i+1) + ": $" + form.format(NewSalary[i]));
            }payroll += NewSalary[i];
        }System.out.println("This is the value of the new payroll: $" + form.format(payroll));
    }
}
