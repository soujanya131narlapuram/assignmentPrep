import java.util.Scanner;
public class Positive_NegativeRZero {
    public static void main(String[] args) {
        System.out.println("enter the user input number:");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.println("i:" + i);
        if (i > 0) {
            System.out.println("positive number");
        } else if (i < 0) {
            System.out.println("negative number");
        } else {
            System.out.println("number is equal to zero");
        }
    }
}
