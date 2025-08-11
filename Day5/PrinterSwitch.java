package Assignment5;

interface Printer {
    void print(String document);
}
class LaserPrinter implements Printer {
    public void print(String document) {
        System.out.println("Laser Printer printing: " + document);
    }
}
class InkjetPrinter implements Printer {
    public void print(String document) {
        System.out.println("Inkjet Printer printing: " + document);
    }
}
public class PrinterSwitch {
    public static void main(String[] args) {
        Printer p;
        p = new LaserPrinter();
        p.print("Invoice.pdf");

        p = new InkjetPrinter();
        p.print("Photo.jpg");
    } 
}
