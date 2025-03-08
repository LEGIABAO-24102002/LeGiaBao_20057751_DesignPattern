package strategypattern;

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee("Cao Ba Quat", 5000000, new HeadOfDepartmentSalaryStrategy());
        emp.displaySalary();

        Employee emp1 = new Employee("Cu Van Lao", 5000000, new DoctorSalaryStrategy());
        emp1.displaySalary();

        Employee emp2 = new Employee("Nguyễn Văn A", 5000000, new ManagerSalaryStrategy());
        emp2.displaySalary();
    }
}
