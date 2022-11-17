import java.util.Scanner;
//import java util.Math.sqrt;

public class Automorphic_no_R_not {
public static void main(String[] args){
    System.out.println("enter the number to check:");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int t=n;
    int sqrt=n*n;
    System.out.println(sqrt);
        while(n!=0) {
        int rem = n % 10;
        if (rem == t)
            System.out.println("automorphic number:" + t);
        else
            System.out.println("not a automorphic number:" + t);
    }
}
}
