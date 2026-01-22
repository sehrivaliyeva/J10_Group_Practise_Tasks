package lesson9and10;

public class Course {
    String courseName;
    int credit;
    static int totalCourses;

    public Course(String courseName, int credit) {
        this.courseName = courseName;
        this.credit = credit;
        totalCourses++;
    }
   static{
       System.out.println("Course sistemi ise salindi.");
   }
    {
        System.out.println("yeni kurs yaradilir");
    }
    public void showCourseInfo(){
        System.out.println("Kurs ismi: " + courseName);
        System.out.println("Kurs kredi: " + credit);
    }
    public static void showTotalCourses(){
        System.out.println("Toplam kurs sayisi: " + totalCourses);
    }
}
