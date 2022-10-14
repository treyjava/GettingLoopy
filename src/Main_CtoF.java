import java.util.Scanner;



public class Main_CtoF
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        boolean done = false;
        double tempC = 0;
        String trash = "";


        do{
            System.out.print("Enter your temperature in Celsius: ");
            if(in.hasNextDouble())
            {
                tempC = in.nextInt();
                in.nextLine();

                double tempF = tempC * 9/5 + 32;
                System.out.println("Your temperature in Fahrenheit is " + tempF);
                done = true;
            }
            else
            {
                trash = in.nextLine();
                System.out.println("You must enter a valid number, not: " + trash);
            }
        }while (!done);
    }
}


