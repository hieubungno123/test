package JavaEncapsulation.Test1;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Tran Minh Hieu", 22, "Viet Nam");
        Person p2 = new Person("Nguyen Thanh Doanh", 25, "Japan");
        Person p3 = new Person("Tran Viet Dung", 55, "Chinese");

        System.out.println("Name: " + p1.getName());
        System.out.println("Age: " + p1.getAge());
        System.out.println("Country: " + p1.getCountry());
        System.out.println();

        System.out.println("Name: " + p2.getName());
        System.out.println("Age: " + p2.getAge());
        System.out.println("Country: " + p2.getCountry());
        System.out.println();

        System.out.println("Name: " + p3.getName());
        System.out.println("Age: " + p3.getAge());
        System.out.println("Country: " + p3.getCountry());
        System.out.println();

        Person p4 = new Person(null, 0, null);
        p4.setName("Arthfael Viktorija");
        p4.setAge(25);
        p4.setCountry("USA");

        System.out.println("Name: " + p4.getName());
        System.out.println("Age: " + p4.getAge());
        System.out.println("Country: " + p4.getCountry());

    }
}
