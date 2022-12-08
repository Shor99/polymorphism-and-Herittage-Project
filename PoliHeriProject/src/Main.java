import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Factory factory = new Factory();
        Manager eli = new Manager("Eli",5000,15);
        Manager maya = new Manager("Maya",6000,10);
        Worker dani = new Worker("Dani",40.0);
        dani.setHour(210);
        Worker or = new Worker("Or",42.2);
        or.setHour(123);
        Worker bar = new Worker("Bar",29.32);
        bar.setHour(116);
        Worker shlomo = new Worker("Shlomo",40.0);
        shlomo.setHour(98);
        Worker shmuel = new Worker("shmuel",40.0);
        shmuel.setHour(120);

        factory.addEmployee(eli);
        factory.addEmployee(maya);
        factory.addEmployee(dani);
        factory.addEmployee(or);
        factory.addEmployee(bar);
        factory.addEmployee(shlomo);
        factory.addEmployee(shmuel);

        Manager most_manager = factory.mostManager();
        Worker least_hours =  factory.minHours();
        Employee highest_wage = factory.maxSalary();


        System.out.println("\nThe number of workers: " + factory.getNumOfWorkers());
        System.out.println("\nThe manager with the most employee's is: " + most_manager.getName());
        System.out.println("\nThe worker who worked the least hour is: " + least_hours.getName() + " with " + least_hours.getHour() + " hours");
        System.out.println("\nThe employee's who makes the highest wage is: " + highest_wage.getName() + " with " + highest_wage.salary() + " ILS");
        System.out.println("\nEnter a new to search to get his salary for the month");
        String employee_name = sc.next();
        double employee_salary = factory.salaryByName(employee_name);
        if (employee_salary !=0 )
        {
            System.out.println("The employee salary is: " + employee_salary);
        }
        else {
            System.out.println("There is not an employee with this name in this factory");
        }

    }
}