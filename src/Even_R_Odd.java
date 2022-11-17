import java.util.Scanner;
public class Even_R_Odd {
    public static void main(String[] args){
    System.out.println("enter the user input number:");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.println("i:" + i);
        if (i % 2 == 0) {
            System.out.println("the entered number is even:");
        } else {
            System.out.println("the entered number is odd:");
        }
    }
}

