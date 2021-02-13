package Lesson5;

public class Employee {
    Employee(int id1, String surname1, int age1, double salary1, String department1) {
        id = id1;
        surname = surname1;
        age = age1;
        salary = salary1;
        department = department1;
    }
    int id;
    String surname;
    int age;
    double salary;
    String department;

    void increaseSalaryBy2() {
        salary *= 2;
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Ivanov", 19, 30000, "CS");
        Employee e2 = new Employee(2, "Pracny", 23, 45000, "CZU");
        System.out.println(e1.salary);
        e1.increaseSalaryBy2();
        System.out.println(e1.salary);
    }
}