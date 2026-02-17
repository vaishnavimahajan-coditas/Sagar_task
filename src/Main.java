public class Main{
    public static void main(String[] args) {
        Employee dev = new Developer(5,60_000,28, 4);

//
//       dev.calculate_gross_salary();
//       dev.display_all_information();


//       Employee manager = new Manager(5,50000,27,5);
//       manager.calculate_gross_salary();
//       manager.display_all_information();

       Employee intern = new Intern(10_000,29, 5);
       intern.calculate_gross_salary();
       intern.display_all_information();

    }
}