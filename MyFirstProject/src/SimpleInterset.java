import java.util.*; // this is mandatory package for user input and print

public class SimpleInterset {
    public static void main(String [] args)
    {
        try (Scanner sc = new Scanner(System.in)) {
            int p=sc.nextInt();
            int r=sc.nextInt();
            int t=sc.nextInt();
            int si= (p*r*t)/100;
            System.out.println(si);
        }


    }
}
