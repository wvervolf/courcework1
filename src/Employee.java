public class Employee {
    private int id;
    private String fullName;
    private int department;
    private int salary;
    private static int generatorId = 1;
    public Employee(String fullName, int department, int salary) {
        this.id = generatorId++;
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;

    }

    @Override
    public String toString() {
        return "id = " + id + ", ФИО = " + fullName +
                ", Отдел = " + department +
                ", ЗП = " + salary;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public String getFullName() {
        return fullName;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
