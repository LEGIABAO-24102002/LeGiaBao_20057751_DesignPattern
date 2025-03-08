package statepattern;

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee("Tran Ngoc Kim Thuy", 5000000, new HeadOfDepartment());
        emp.displaySalary();

        Employee emp1 = new Employee("Tran Tu Tai", 5000000, new Doctor());
        emp1.displaySalary();

        Employee emp2 = new Employee("Nguyen Thi Anh Tu", 5000000, new TeamLeader());
        emp2.displaySalary();
    }
}
