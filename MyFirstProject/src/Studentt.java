
 class Student2 {
    int id;
    String name;
    int age;
    String course;
    double marks;
    boolean isRegular;
    String college;
    String email;
    char gender;
    int attendance;

    // methods
       void study(){
           System.out.println(name + "is studying"  +course  +".");
       }
       void exam(){
           System.out.println(name + "giving an exam.");
       }
       void attendClass(){
           System.out.println(name + " is attending class.");
       }
       void play(){
           System.out.println(name + "is playing.");
       }
       void submitHomework(){
           System.out.println(name + " submitted homework.");
       }
       void eat(){
           System.out.println(name + " is eating launch.");
       }
       void sleep(){
           System.out.println(name + "is sleeping.");
       }
       void rest(){
           System.out.println(name + "is resting.");
       }
       void result(){
           if(marks>=40){
               System.out.println(name + "has passed.");
           }else{
               System.out.println(name + "has failed.");
           }

           }
    // Methods
    void info() {
        System.out.println("======== Student Info ========");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
        System.out.println("Marks: " + marks);
        System.out.println("Regular: " + isRegular);
        System.out.println("College: " + college);
        System.out.println("Email: " + email);
        System.out.println("Gender: " + gender);
        System.out.println("Attendance: " + attendance + "%");
        System.out.println("-----------------------------------");
    }
       }
       class main_Program{
       public static void main(String[] args) {
           // object 1
           Student2 s1=new Student2();
           s1.id=100;s1.name="Rashid";s1.age=22;s1.course="B.tech cse";
           s1.marks=90;s1.isRegular=true;s1.college="Birbhum Institute of Engineering and Technology";
           s1.email="rashiid.cse@gmail.com";s1.gender='M';s1.attendance=70;

           // object2
           Student2 s2=new Student2();
           s2.id=101;s2.name="Guf";s2.age=23;s2.course="BCA";s2.marks=90;
           s2.isRegular=true;s2.college=" institute of Engineering and technology";
           s2.email="gufran@example.com";s2.gender='M';s2.attendance=75;

           // object3
           Student2 s3=new Student2();
           s3.id=102;s3.name="Nilanjana";s3.age=22;s3.course="B.techb CSE";
           s3.marks=100;s3.isRegular=true;s3.college="Birbhum Institute of Engineering And Technology";
           s3.email="nilanaj@example.com";s3.gender='F';s3.attendance=100;
           // calling method for s1
           s1.info();
           s1.study();
           s1.exam();
           s1.attendClass();
           s1.play();
           s1.submitHomework();
           s1.eat();
           s1.sleep();
           s1.rest();
           s1.result();
           System.out.println();

           // calling method for s2
           s2.info();
           s2.study();
           s2.exam();
           s2.attendClass();
           s2.play();
           s2.submitHomework();
           s2.eat();
           s2.sleep();
           s2.rest();
           s2.result();
           System.out.println();

           // calling method for  s3
           s3.info();
           s3.study();
           s3.exam();
           s3.attendClass();
           s3.play();
           s3.submitHomework();
           s3.eat();
           s3.sleep();
           s3.rest();
           s3.result();

       }
}
