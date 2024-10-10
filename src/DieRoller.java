import java.util.Random;
import java.util.Scanner;

public class DieRoller
{
    public static void main (String [] args)
    {

        Random gen = new Random();
        Scanner in = new Scanner (System.in);


        int die1 = 0;
        int die2 = 0;
        int die3 = 0;
        int roll = 0;
        int sum = 0;
        String yesNo = "";
        boolean done = true;

        System.out.println("Roll\t Die 1\tDie 2\t Die 3\t Sum\t");
        System.out.println("__________________________________");

        do {
            do {
                die1 = gen.nextInt(6) + 1; // 0 - 5 + 1 is 1 to 6
                die2 = gen.nextInt(6) + 1;
                die3 = gen.nextInt(6) + 1;
                sum = die1 + die2 + die3;
                roll++;
                System.out.printf("%6d\t%6d\t%6d\t%6d\t%6d\n", roll, die1, die2, die3, sum);
            } while (!(die1 == die2 && die2 == die3));


            System.out.println("Do you want to roll again? (Y/N)");
                yesNo = in.nextLine();
            if(yesNo.equalsIgnoreCase("Y"))
                {
                    done = false;
                }
            else
            {
                done = true;
            }

        }while(!done);
    }
}
