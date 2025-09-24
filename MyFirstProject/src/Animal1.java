public class Animal1 {
    String name="dog";
    int age=12;
    String color="Green";
    Double weight=7.5;

    void eat(){
        System.out.println("i am running");

    }
    void run (){
        System.out.println("i am running");
    }
    void sleep(){
        System.out.println("i am sleeping");

    }
    public static void main(String [] args){
        // object created

        Animal1 cat=new Animal1();
        System.out.println("Name: "+cat.name);
        System.out.println("Age: "+cat.age);
        System.out.println("Weight: "+cat.weight);

        // calling method
        cat.eat();
        cat.run();
        cat.sleep();

    }
}
