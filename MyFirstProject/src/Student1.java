 class Student1 {
    String name;
    int id;
    String course;
    double marks;
    boolean isRegular;
    String college;
    String email;
    char gender;
    int attendance;

    // methods
     void study(){
         System.out.println(name + " is studying " + course + ".");
     }
     void exam(){
         System.out.println(name + " giving an exam");
     }
     void attendClass(){
         System.out.println(name + " is attending a class");
     }
     void play(){
         System.out.println(name + " is playing football");

     }
     void submitHomework(){
         System.out.println(name + " submitted homework");
     }
     void eat(){
         System.out.println(name + " is eating");
     }
     void sleep(){
         System.out.println(name + " is sleeping");
     }
     void rest(){
         System.out.println(name + " is resting");
     }
     boolean isPassed(){
         return marks>=40;
     }
     void info(){
         System.out.println("======Student info=======");
         System.out.println("Name: "+name);
         System.out.println("ID: "+id);
         System.out.println("Course: "+course);
         System.out.println("Marks: "+marks);
         System.out.println("Regular: "+isRegular);
         System.out.println("College: "+college);
         System.out.println("Email: "+email);
         System.out.println("Gender: "+gender);
         System.out.println("Attendance:"+attendance + "%");
         System.out.println("------------------------------");
     }

     public static void main(String[] args) {
         // objected created
         Student1 s2 = new Student1();
         s2.name = "Rashid";
         s2.id = 101;
         s2.course = "Computer Science Engineering";
         s2.marks = 80;
         s2.isRegular = true;
         s2.college = "ABC College";
         s2.email = "rashidhashmi482@gmail.com";
         s2.gender = 'M';
         s2.attendance = 75;
         // object
         Student1 s3 = new Student1();
         s3.name = "Joyjeet";
         s3.id = 102;
         s3.course = "B.tech cse";
         s3.marks = 89;
         s3.isRegular = true;
         s3.college = "Birbhum institute of engineering and technology";
         s3.email = "joyjeet@example.com";
         s3.gender = 'M';
         s3.attendance = 76;

         // method calling for each student

         s2.info();
         s2.study();
         s2.exam();
         System.out.println("passed?" +s2.isPassed());
         System.out.println();

        s3.info();
        s3.attendClass();
        s3.play();
         System.out.println("passed?" +s3.isPassed());
         System.out.println();



     }

}
