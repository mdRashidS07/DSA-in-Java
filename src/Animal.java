class Animal {
    int age = 10;
    String color = "Black";

    void eat() {
        System.out.println("I am eating");
    }

    public static void main(String[] args) {
        Animal A = new Animal();
        System.out.println("Age: " + A.age);
        System.out.println("Color: " + A.color);
        A.eat();
    }
}