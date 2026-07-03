import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1, num2, num3, result;
        System.out.println("Enter the first double number:");
        num1 = input.nextDouble();
        System.out.println("Enter the second double number:");
        num2 = input.nextDouble();
        System.out.println("Enter the third double number:");
        num3 = input.nextDouble();
        result = num1 * num2 * num3;
        System.out.println("The product of the numbers is " + result);
    }
}
