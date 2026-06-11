import java.util.HashMap;
import java.util.Map;

public class EmployeeManager {

    private Map<Integer, Employee> employees = new HashMap<>();

    public void addEmployee(Employee employee) {
        if (employees.containsKey(employee.getId())) {
            System.out.println("Employee ID already exists!");
            return;
        }

        employees.put(employee.getId(), employee);
        System.out.println("Employee added successfully.");
    }

    public void viewEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employee records found.");
            return;
        }

        for (Employee employee : employees.values()) {
            System.out.println(employee);
        }
    }

    public void searchEmployee(int id) {
        Employee employee = employees.get(id);

        if (employee != null) {
            System.out.println(employee);
        } else {
            System.out.println("Employee not found.");
        }
    }

    public void updateEmployee(int id, String name,
                               String department, double salary) {

        Employee employee = employees.get(id);

        if (employee != null) {
            employee.setName(name);
            employee.setDepartment(department);
            employee.setSalary(salary);

            System.out.println("Employee updated successfully.");
        } else {
            System.out.println("Employee not found.");
        }
    }

    public void deleteEmployee(int id) {
        if (employees.remove(id) != null) {
            System.out.println("Employee deleted successfully.");
        } else {
            System.out.println("Employee not found.");
        }
    }
}