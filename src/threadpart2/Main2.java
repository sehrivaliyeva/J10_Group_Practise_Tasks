package threadpart2;

public class Main2 {
    public static void main(String[] args) {
        Printer printer = new Printer();
        Thread printing = new Thread(() -> printer.print("salam dostlar"));
        Thread printing2 = new Thread(() -> printer.print("salam dostlar yene de"));
        printing.start();
        printing2.start();


    }
}
