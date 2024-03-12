public class Main {
    private static Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        employees[0] = new Employee("Семёнов Дмитрий Алексеевич", 1, 75000);
        employees[1] = new Employee("Андреев Михаил Николаевич", 1, 55000);
        employees[2] = new Employee("Иванов Семён Максимович", 2, 58000);
        employees[3] = new Employee("Петров Александр Валерьевич", 2, 65000);
        employees[4] = new Employee("Сидоров Алексей Афанасьевич", 3, 68000);
        employees[5] = new Employee("Михайлов Кирилл Дмитриевич", 3, 95000);
        employees[6] = new Employee("Денисов Емельян Михайлович", 4, 78000);
        employees[7] = new Employee("Александров Валерьян Макарович", 4, 85000);
        employees[8] = new Employee("Печкин Егор Кондратьевич", 5, 88000);
        employees[9] = new Employee("Овечкин Богдан Бгогданович", 5, 98000);

        listInfo();
        listNames();
        System.out.println("Сумма зарплат сотрудников составляет: " + calculateSumOfSalarys());
        System.out.println("Средняя зарплата сотрудников составляет: " + calculateAverageSumOfSalarys());
        System.out.println("Максимальная зарплата составляет: " + calculateMaxSumOfSalarys());
        System.out.println("Минимальная зарплата составляет: " + calculateMinSumOfSalarys());
    }

    public static void listInfo() {
        System.out.println("Инфо сотрудников:");
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }

    }

    public static void listNames() {
        System.out.println("ФИО сотрудников:");
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].getFullName());
        }
    }

    public static int calculateSumOfSalarys() { //Сумма ЗП
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum = sum + employees[i].getSalary();
        }
        return sum;
    }

    public static int calculateAverageSumOfSalarys() { //Средняя ЗП
        int sum = calculateSumOfSalarys();
        int averageSum = sum / employees.length;
        return averageSum;
    }
    public static int calculateMaxSumOfSalarys() {
        int maxSalary = Integer.MIN_VALUE;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() > maxSalary) {
                maxSalary = employees[i].getSalary();
            }
        }
        return maxSalary;
    }
    public static int calculateMinSumOfSalarys() {
        int minSalary = Integer.MAX_VALUE;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < minSalary) {
                minSalary = employees[i].getSalary();
            }
        }
        return minSalary;
    }
}