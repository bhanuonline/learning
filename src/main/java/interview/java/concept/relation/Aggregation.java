package interview.java.concept.relation;

class Department {
    String deptName;

    Department(String name) {
        this.deptName = name;
    }
}

class Employee {
    String empName;
    Department department; // HAS-A relationship

    Employee(String empName, Department dept) {
        this.empName = empName;
        this.department = dept;
    }

    void displayInfo() {
        System.out.println(empName + " works in " + department.deptName);
    }
}

public class Aggregation {
    public static void main(String[] args) {
        Department dept = new Department("HR");
        Employee emp = new Employee("Alice", dept);

        emp.displayInfo(); // Alice works in HR
    }
}
