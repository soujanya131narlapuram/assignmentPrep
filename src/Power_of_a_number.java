import java.util.Scanner;
import java.lang.Math;
public class Power_of_a_number {
    public static void main(String[] args) {
        System.out.println("enter the number to check:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        double power =(Math.pow(n,m));
        System.out.println("power of a number:" + power);
    }
}
