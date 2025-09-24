public class Typecasting{
    public static void main(String[] args) {
        int i1 = 10;
        short s1 = 30;
        int res = i1 + s1;   // yaha pe short automatic int me promote ho jata hai

        System.out.println("Result = " + res);  // Output: Result = 40
    }
}