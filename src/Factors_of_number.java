import java.util.Scanner;
public class Factors_of_number {
    public static void main(String[] args) {
        System.out.println("enter the number to check:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
          for(int i=1;i<n;i++)
          {
              if(n% i==0)
              {
                  System.out.println("factors of a number:"+i);
              }
          }

    }
}
