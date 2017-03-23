package epam.restful.dao;


import epam.restful.entity.Employee;

import java.util.*;

public class EmployeeDAO {
    private static final Map<String, Employee> empMap = new HashMap<String, Employee>();

    static {
        initMap();
    }

    private static void initMap() {
        Employee emp1 = new Employee("John", "Smith", "JS", "John_Smith@gmail.com");
        Employee emp2 = new Employee("Bob", "Martin", "BM", "Bob_Martin@gmail.com");
        Employee emp3 = new Employee("Nait", "Di", "ND", "Nait_Di@gmail.com");
        empMap.put(emp1.getFirstName(), emp1);
        empMap.put(emp2.getFirstName(), emp2);
        empMap.put(emp3.getFirstName(), emp3);
    }

    public static Employee getEmployee(String firstName) {
        return empMap.get(firstName);
    }

    public static Employee addEmployee(Employee emp) {
        empMap.put(emp.getFirstName(), emp);
        return emp;
    }

    public static Employee updateEmployee(Employee emp) {
        empMap.put(emp.getFirstName(), emp);
        return emp;
    }

    public static void deleteEmployee(String firstName) {
        empMap.remove(firstName);
    }

    public static List<Employee> getAllEmployees() {
        Collection<Employee> c = empMap.values();
        List<Employee> list = new ArrayList<Employee>();
        list.addAll(c);
        return list;
    }

}
