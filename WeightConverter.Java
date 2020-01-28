import java.util.Scanner;
public class WeightConverter
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Are you trying to convert gram or kilo?: ");
        String conv = in.next();
        if (conv.contains("grams") || conv.contains("gram"))
        {
            System.out.print("Enter the number of gram: ");
            int num = in.nextInt();
            Double num2 = new Double(num);
            Double kilo = num2 / 1000.0;
            System.out.println(num + " grams converted to kilo is " + kilo);
        }
        else
        {
            System.out.print("Enter the number of kilo: ");
            int num = in.nextInt();
            int grams = num * 1000;
            System.out.println(num + " kilo converted to grams is " + grams);
        }
    }
}