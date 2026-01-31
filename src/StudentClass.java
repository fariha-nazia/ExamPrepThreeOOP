public class StudentClass {
    String name;
    int age;
    double gpa;
    boolean isEnrolled;

    StudentClass(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.isEnrolled = true;
    }


//    method to study
    void study(){
        System.out.println(this.name + " is studying");
    }

}
