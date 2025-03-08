package decoratorpattern;


public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee("Nguyan Van Tuan Cong ", 5000000);
        emp = new HeadOfDepartmentAllowance(emp);
        emp.displaySalary();

        Employee emp1 = new Employee("Tran Thi Anh Minh ", 5000000);
        emp1 = new ManagerAllowance(emp1);
        emp1.displaySalary();

        Employee emp2 = new Employee("Le Toan Cong Phu", 5000000);
        emp2 = new TeamLeaderAllowance(emp2);
        emp2.displaySalary();
    }
}