package JavaEncapsulation.Test3;

public class Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle( 6.7 , 4);
        System.out.println("Length: " + r1.getLength());
        System.out.println("Width: " + r1.getWidth());
        System.out.println("Area Rectangle R1 : " + r1.areaRectangle());
        System.out.println();

        Rectangle r2 = new Rectangle(7, 8.6);
        System.out.println("Length: " + r2.getLength());
        System.out.println("Width: " + r2.getWidth());
        System.out.println("Area Rectangle R2: " + r2.areaRectangle());
        System.out.println();


        Rectangle r3 = new Rectangle(0, 0);
        r3.setLength(8.6);
        r3.setWidth(2);
        System.out.println("Length: " + r3.getLength());
        System.out.println("Width: " + r3.getWidth());
        System.out.println("Area Rectangle R3: " + r3.areaRectangle());
        

    }
}
