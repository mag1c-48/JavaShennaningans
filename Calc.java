import java.util.*;
public class Calc
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to this simple calculator, you will be asked to enter two digits.");
        System.out.print("Enter your first number: ");
        int num1 = in.nextInt();
        System.out.print("Enter your second number: ");
        int num2 = in.nextInt();
        System.out.print("What operator would you like to use? (+, -, %, /, *): ");
        char oper = in.next().charAt(0);
        int answer = 0;

        switch (oper)
        {
            case '+': answer = num1 + num2;
            break;

            case '-': answer = num1 - num2;
            break;
            
            case '%': answer = num1 % num2;
            break;

            case '/': answer = num1 / num2;
            break;

            case '*': answer = num1 * num2;
            break;

        }

        System.out.println("Your answer is: " + answer);
    }
}