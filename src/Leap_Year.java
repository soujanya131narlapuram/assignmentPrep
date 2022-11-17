import java.util.Scanner;
public class Leap_Year {
    public static void main(String[] args) {
        System.out.println("enter the year number in the variable a:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (((a % 4 == 0) && (a % 100 != 0) || (a % 400 == 0))) {
            System.out.println("leap year");
        } else {
            System.out.println("not leap year");
        }
    }
}

