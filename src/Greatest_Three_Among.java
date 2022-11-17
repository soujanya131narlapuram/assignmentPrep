public class Greatest_Three_Among {
    public static void main(String[] args){
    int num1=40;
    int num2=60;
    int num3=20;
    if((num1>num2)&&(num1>num3))
    {
        System.out.println("the number num1 is greater than num2 &num3:" +num1);
    }
    else if((num2>num1)&&(num2>num3)){
        System.out.println("the number num2 is greater than num1&num3:" +num2);
    }else {
        System.out.println("number3 is greater than num1 amd num2:" +num3);
    }
}
}
