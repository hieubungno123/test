package JavaEncapsulation.Test4;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("15", "Tran Minh Hieu", 4999);
        System.out.println("Employee Details:");
        System.out.println("ID: " + e1.getEmployee_id());
        System.out.println("Name: " + e1.getEmployee_name());
        String formattedSalary = e1.getFormattedSalary();
        System.out.println("Salary: " + formattedSalary);
    }
}
