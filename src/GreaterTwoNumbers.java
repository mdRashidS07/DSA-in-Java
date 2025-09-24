public class GreaterTwoNumbers {
    public static void main(String[] args) {
        int num1=10;
        int num2=20;

        int res = (num1>num2)? num1 : num2;//   // ternary operator
        System.out.println(res+" is greater");//

        if(num1>num2)
        {
            System.out.println("Num1 is grater");
        }
        else
        {
            System.out.println("num2 is greater");
        }
    }
    
}
