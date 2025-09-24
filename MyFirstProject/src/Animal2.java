 class Animal2 {
    String name;
    int age;
    String color;
    String food;
    String type;
    double height;
    double weight;

    void eat(){
        System.out.println(name + " is eating");
    }
    void run (){
        System.out.println(name + " is running");

    }
    void sleep(){
        System.out.println(name + " is sleeping");
    }
    void sound(){
        System.out.println(name + " make a sound ");
    }
    void play(){
        System.out.println(name + " is playing");
    }
    void drink(){
        System.out.println(name + " is drinking water");
    }
    void jump(){
        System.out.println(name + " is jumping");

    }

    void info(){
        System.out.println("-----------Animal info-------------");
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Color: "+color);
        System.out.println("Food: "+food);
        System.out.println("Type:"+type);
        System.out.println("Height: "+height);
        System.out.println("Weight:"+weight);
    }
    public static void main(String[] args){
        // object create
        Animal2 goat=new Animal2();  // ek hi object mai multiple calling
         // values assign
        goat.name="Tommy";
        goat.age=10;
        goat.color="Black";
        goat.food="Grass";
        goat.type="pet Animal";
        goat.height=0.8;
        goat.weight=15.0;


        //  multiple method calling
        goat.info();
        goat.eat();
        goat.run();
        goat.sleep();
        goat.sound();
        goat.play();
        goat.drink();
        goat.jump();


     }

}
