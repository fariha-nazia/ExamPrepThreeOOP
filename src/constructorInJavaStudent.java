public class constructorInJavaStudent {
    public static void main(String[] args){

        StudentClass student1 = new StudentClass("Spongebob", 30, 1.55);
        StudentClass student2 = new StudentClass("Patrick", 34, 2.7);
        StudentClass student3 = new StudentClass("Sandy", 27, 1);

        System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student1.gpa);
        System.out.println(student1.isEnrolled);

        System.out.println(student2.name);
        System.out.println(student2.age);
        System.out.println(student2.gpa);
        System.out.println(student1.isEnrolled);

        System.out.println(student3.name);
        System.out.println(student3.age);
        System.out.println(student3.gpa);
        System.out.println(student3.isEnrolled);

        student1.study();
        student2.study();
        student3.study();



    }
}
