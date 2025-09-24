class Animal3{
    String name;
    int age;
    String color;
    String food;
    double height;
    double weight;
    int legs;

        void eat(){
            System.out.println(name + " is eating");

       }
       void run(){
            System.out.println(name + " is running");
       }
       void sleep(){
            System.out.println(name + " is sleeping");
       }
       void walk(){
            System.out.println(name + " is walking");
       }
       void play(){
            System.out.println(name + " is playing");
       }
       void jump(){
            System.out.println(name + " is jump");
       }
       void sound(){
            System.out.println(name + " make a sound");
       }
       void drink(){
            System.out.println(name + " is drinking water");
       }
       void info(){
            System.out.println("--------Animal info--------");
            System.out.println("Name : "+name);
            System.out.println("Age : "+age);
            System.out.println("Color : "+color);
            System.out.println("Food : "+food);
            System.out.println("Height : "+height);
            System.out.println("Weight : "+weight);
            System.out.println("legs : "+legs);

       }
       public static void main(String[] args){
            // object created
           Animal3 cat=new Animal3();
           // value assign
           cat.name="Tommy";
           cat.age=12;
           cat.color="Black";
           cat.food="Milk";
           cat.height=0.1;
           cat.weight=12;
           cat.legs=4;

           // object Two
           Animal3 dog=new Animal3();
           // value assign
           dog.name="dog";
           dog.age=5;
           dog.color="white";
           dog.food="Biscuits";
           dog.height=0.8;
           dog.weight=16.0;
           dog.legs=4;

           // object three
           Animal3 tiger=new Animal3();
           tiger.name="tiger";
           tiger.age=34;
           tiger.color="Brown";
           tiger.food="Meat";
           tiger.height=0.9;
           tiger.weight=56.0;
           tiger.legs=4;

           // object Four
           Animal3 lion=new Animal3();
           lion.name="lion";
           lion.age=32;
           lion.color="Red";
           lion.food="Meat";
           lion.height=1.0;
           lion.weight=90;

           // method calling for cat
           System.out.println("\n===CAT====");
           cat.info();cat.eat();cat.run();cat.sleep();cat.walk();cat.play();cat.jump();cat.sound();cat.drink();

           // method calling for dog
           System.out.println("\n===DOG===");
           dog.info();dog.eat();dog.run();dog.sleep();dog.walk();dog.play();dog.jump();dog.sound();dog.drink();

           // method calling for tiger
           System.out.println("\n===TIGER===");
           tiger.info();tiger.eat();tiger.run();tiger.sleep();tiger.walk(); tiger.play();tiger.jump();tiger.sound();tiger.drink();

           // method calling for lion
           System.out.println("\n===LION===");
           lion.info();lion.eat();lion.run();lion.sleep();lion.walk();lion.play();lion.jump();lion.sound();lion.drink();
       }
}