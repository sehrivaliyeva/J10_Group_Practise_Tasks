package lesson9and10;

public class Yoxlama {
    public static void main(String[] args) {
        Course c1 = new Course("Java", 4);
        Course c2 = new Course("C#", 3);
        Course c3 = new Course("Python", 5);
        Course.showTotalCourses();
        Student s1=new Student(101,"Sevinc");
        s1.addCourse(c1);
        s1.addCourse(c2);
        s1.addCourse(c3);
        s1.showCourses();
        System.out.println(Student.totalStudents);

    }
}
