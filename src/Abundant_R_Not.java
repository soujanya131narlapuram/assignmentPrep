import java.util.Scanner;
public class Abundant_R_Not {
public static void main(String[] args)
{
    System.out.println("enter the number to check:");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int t=n;
    int sum=0;
    for (int i = 1; i < n; i++)
        if (n % i == 0)
            sum = sum+ i;
    System.out.println("sum:"+sum);
    if(sum>t)
        System.out.println("abundant number");
    else
        System.out.println("not abundant number");


}
}
