public class Test {
    public static void main(String[] args) {
        String soz = "ana";
        String soz2 = "ana";
        String soz3 = new String("ana");
        String soz4 = new String("ana");

        System.out.println(soz.equals(soz2));// true
        System.out.println(soz == soz2);//true


    }
}
