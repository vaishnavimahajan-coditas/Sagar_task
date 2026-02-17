

public class Main {
    public static void main(String[] args) {

        System.out.println("Developer...");
        System.out.println("****************************");
        Employee dev = new Developer(5, 60_000, 28, 4);
        dev.calculate_gross_salary();
        dev.display_all_information();

        System.out.println("****************************");
        System.out.println("Manager.....");
        Employee manager = new Manager(5, 50000, 27, 5);
        manager.calculate_gross_salary();
        manager.display_all_information();

        System.out.println("****************************");
        System.out.println("Intern.....");
        Employee intern = new Intern(10_000, 29, 5);
        intern.calculate_gross_salary();
        intern.display_all_information();

    }
}