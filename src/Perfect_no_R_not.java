import java.util.Scanner;
public class Perfect_no_R_not {
    public static void main(String[] args) {
        System.out.println("enter the number to check:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = n, sum = 0;
            for (int i = 1; i < n; i++)
                if (n % i == 0)
                    sum = sum + i;
            System.out.println(sum);
            if (t == sum)
                  System.out.println("perfect number");
            else
                  System.out.println("not a perfect number");


    }
}
