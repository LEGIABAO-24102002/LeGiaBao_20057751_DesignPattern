package nodesignpattern;


public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee("Luong Cao Tu", 5000000, "Trưởng khoa");
        emp.displaySalary();

        Employee emp1 = new Employee("Le Anh Tuan", 5000000, "Tiến sĩ");
        emp1.displaySalary();

        Employee emp2 = new Employee("Tran Cong Dai", 5000000, "Trưởng phòng");
        emp2.displaySalary();
    }
}
