import java.util.Scanner;
public class Factorial_NthTerm {
    public static void main(String[] args) {
        System.out.println("enter the number to check:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<=n;i++)
            System.out.print(i+" ");
    }
}
