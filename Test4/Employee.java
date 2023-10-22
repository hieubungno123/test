package JavaEncapsulation.Test4;

public class Employee {
    private String employee_id;
    private String employee_name;
    private double employee_salary;

    public Employee(String employee_id,String employee_name,double employee_salary){
        this.employee_id=employee_id;
        this.employee_name=employee_name;
        this.employee_salary=employee_salary;
    }

    public String getEmployee_id(){
        return this.employee_id;
    }
    public void setEmployee_id(String employee_id){
        this.employee_id=employee_id;
    }
    
    public String getEmployee_name(){
        return this.employee_name;
    }
    public void setEmployee_name(String employee_name){
        this.employee_name=employee_name;
    }

    public double getEmployee_salary(){
        return this.employee_salary;
    }
    public void setEmployee_salary(double employee_salary){
        this.employee_salary=employee_salary;
    }

    public String getFormattedSalary() {
        return String.format("$%.2f", employee_salary);
      }
}
