package Week10.employee;

import java.util.*;

public class EmployeeController {
    private ArrayList<Employee> employees;

    public EmployeeController() {
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee emp){
        employees.add(emp);
    }


    public void printAllEmployees(){
       for(Employee emp : employees){
           System.out.println(emp);
       }
    }





    public static void main(String[] args) {
        EmployeeController employeeController = new EmployeeController();

        Employee steve = new Employee("Steve",
                "s.mcguire@hud.ac.uk", -10);
        employeeController.addEmployee(steve);
        employeeController.addEmployee(new Employee("Ilias", "iliad@hud.ac.uk", 54566));


    }

}
