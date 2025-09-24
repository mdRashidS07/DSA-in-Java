class Animal4 {
    String name;
    int age;
    String color;
    String food;
    double height;
    double weight;
    int legs;

       void eat(){
           System.out.println(name + "is eating");
       }
       void run(){
           System.out.println(name + "is running");
       }
       void sleep(){
           System.out.println(name + "is sleeping");
       }
       void walk(){
           System.out.println(name + "is walking");
       }
       void play(){
           System.out.println(name + "is playing");
       }
       void jump(){
           System.out.println(name + "is jumping");
       }
       void sound(){
           System.out.println(name + " make a sound");
       }
       void drink(){
           System.out.println(name + "is drinking water");
       }
       void info() {
           System.out.println("======== Animal info =======");
           System.out.println("Name: " + name);
           System.out.println("AGE: " + age);
           System.out.println("Color: " + color);
           System.out.println("Food: " + food);
           System.out.println("Height: " + height);
           System.out.println("Weight: " + weight);
           System.out.println("Legs: " + legs);

       }
}
class Bird{
    String name;
    String species;
    boolean canFly;
    int age;
    String color;
    int wings; // usually 2
    boolean migrates;
    int energy;

      void fly() {
          if (canFly && energy > 10) {
              System.out.println(name + " is flying.");
              energy -= 10;
          } else if (!canFly) {
              System.out.println(name + " cannot fly.");
          } else {
              System.out.println(name + " is too tired to fly.");
          }
      }
    void sing() { System.out.println(name + " is singing."); }
    void eat() { System.out.println(name + " is pecking food."); }
    void sleep() { System.out.println(name + " is sleeping."); }
    void walk() { System.out.println(name + " is walking."); }
    void drink() { System.out.println(name + " is drinking water."); }
    void rest() { System.out.println(name + " is resting."); }
    void buildNest() { System.out.println(name + " is building a nest."); }
    boolean isTired() { return energy < 20; }

    void info() {
        System.out.println("Bird Info -> " + name + ", Species: " + species + ", Color: " + color);
    }

}
// ---- Student Class ----
class Student {
    // 10 properties
    int id;
    String name;
    int age;
    String course;
    double marks;
    boolean isRegular;
    String college;

    char gender;
    int attendance;


    // 10 methods
    void info() {
        System.out.println("Student Info -> " + id + ", " + name + ", Age: " + age + ", Course: " + course);
    }

    void study() {System.out.println(name + " is studying " + course + "."); }
    void exam() { System.out.println(name + " is giving an exam."); }
    void attendClass() { System.out.println(name + " is attending class."); attendance += 2; }
    void play() { System.out.println(name + " is playing football."); }
    void submitHomework() { System.out.println(name + " submitted homework."); }
    void eat() { System.out.println(name + " is eating lunch."); }
    void sleep() { System.out.println(name + " is sleeping."); }
    void rest() { System.out.println(name + " is resting."); }
    boolean isPassed() { return marks >= 40; }
}

// ---- Main Program ----
public class MainProgram {
    public static void main(String[] args) {
        // Animal Objects
        Animal4 dog = new Animal4();
        dog.name="tommy";dog.age=12;dog.color="Red";dog.food="Biscuits";dog.height=0.6;dog.weight=5;dog.legs=4;

        // method call
        dog.info();
        dog.eat();
        dog.run();
        dog.sleep();
        dog.walk();
        dog.play();
        dog.jump();
        dog.sound();
        dog.drink();

        System.out.println("---------------------------------");

        // Bird Objects
        Bird parrot = new Bird();
        parrot.name = "Mithu"; parrot.species = "Parrot"; parrot.color = "Green"; parrot.canFly = true; parrot.energy = 50;
        parrot.info(); parrot.fly(); parrot.sing(); parrot.buildNest(); parrot.drink();
        System.out.println("Is tired? " + parrot.isTired());
        System.out.println("---------------------------------");

        // Student Objects
        Student s1 = new Student();
        s1.id = 101; s1.name = "Rashid"; s1.age = 20; s1.course = "B.Tech CSE"; s1.marks = 78; s1.isRegular = true;
        s1.info(); s1.study(); s1.attendClass(); s1.exam(); s1.play();
        System.out.println("Passed? " + s1.isPassed());
    }
}

