import java.util.Scanner;
public class Sum_Of_Nnatural_numbers {
    public static void main(String[] args){
        int sum = 0;
        System.out.println("enter the user input number:");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println("n:" + n);
        for(int i = 1; i<=n; i++)
        {
            System.out.println("i:" +i);
            sum=sum+i;
            System.out.println("sum:" + sum);
        }
    }
}
