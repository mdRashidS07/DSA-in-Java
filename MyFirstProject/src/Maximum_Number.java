import java.util.Scanner;

public class Maximum_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Three Number:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a>=b && a>c)
        {
            System.out.println(a);
        }
        else if(b>=a && b>=c)
        {
            System.out.println(b);
        }
        else
        {
            System.out.println(c);
        }




    }
}
