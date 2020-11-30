package Week10.employee;

import java.util.ArrayList;

public class EmployeeController {
    private ArrayList<Employee> employees = new ArrayList<>();

    public EmployeeController() {

    }

    public void addEmployee(Employee emp){
       employees.add(emp);
    }

    public void printEmployees(){
        for(Employee emp : employees){
            System.out.println(emp);
        }
    }

    public static void main(String[] args) {
        EmployeeController ec = new EmployeeController();
        Employee steve = new Employee("Steve", "steve@hud.ac.uk", 54566);
        ec.addEmployee(steve);
        Employee ilias = new Employee("ilias", "ilias@hud.ac.uk", 43454);
        ec.addEmployee(ilias);

        ec.printEmployees();
        System.out.println(steve.getRating());


    }
}
