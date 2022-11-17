import java.util.Scanner;
public class Friendly_pair_Rnot
{
public static void main(String[] args)
{
    System.out.println("enter the n1 and n2 values:");
    Scanner sc = new Scanner(System.in);
    int n1 = sc.nextInt();
    int n2 = sc.nextInt();
    int sum1 = 0;
    int sum2 = 0;
    for (int i = 1; i < n1; i++)
        if (n1 % i == 0)
            sum1 = sum1 + i;
            int m1 = sum1 / n1;
            System.out.println("first:" + m1);
            for (int i = 1; i < n2; i++)
                if (n2 % i == 0)
                    sum2 = sum2 + i;
            int m2 = sum2 / n2;
            System.out.println("second:" + m2);

            if (m2 == m1)

                System.out.println("friendly pair");
            else
                System.out.println("not friendly pair");


        }
}

