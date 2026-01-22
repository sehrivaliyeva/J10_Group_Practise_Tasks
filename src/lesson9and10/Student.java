package lesson9and10;

public class Student {
    int id;
    String name;
    Course [] courses;
    static int totalStudents;
    static {
        System.out.println("student sistemi ise salindi");
    }
    {
        System.out.println("yeni telebe yaradilir...");
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
        courses = new Course[5];
        totalStudents++;
    }
    public void addCourse(Course course){
        for (int i = 0; i < courses.length; i++) {
            if(courses[i]==null){
                courses[i]=course;
                return;
            }
        }
        System.out.println("yeni kurs ucun yer yoxdur");
    }
    public void showCourses(){
        for (int i = 0; i < courses.length; i++) {
            if(courses[i]!=null){
                courses[i].showCourseInfo();
                System.out.println(name+ " adli telebenin qeydiyyatda oldugu kurslar: "+ courses[i].courseName);
            }
        }
    }
    public static void showTotalsStudents(){
        System.out.println("umumi telebe sayi: " + Student.totalStudents);
    }
}
