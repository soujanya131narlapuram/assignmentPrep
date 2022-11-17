import java.util.Scanner;
//import java.lang.Math;
public class Factorial_Of_aNumber {
    public static void main(String[] args) {
        System.out.println("enter the number to check:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact=1;
        for(int i=1;i<=n;i++) {
                System.out.print(i+"\n*");
                fact = fact * i;
        }
        System.out.println("\nfactorial of a number " +fact);


    }
}
