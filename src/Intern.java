public class Intern extends  Employee{
//    Formula:
//AttendancePercent = (AttendanceDays / 30) * 100
//If AttendancePercent < 70%
//GrossSalary = BaseSalary - (BaseSalary * 0.20)
//Else
//GrossSalary = BaseSalary

double attendance_percentage;
    Intern(int base_salary, double attendance_days,int rating)
    {
    super(base_salary,attendance_days,rating);

    }
    @Override
    void calculate_gross_salary()
    {
    attendance_percentage = (attendance_days)* 100;
    if(attendance_percentage < 70)
    {
//        GrossSalary = BaseSalary - (BaseSalary * 0.20)
        gross_salary = base_salary - (base_salary * 0.20);
        System.out.println("Gross Salary :" +gross_salary);
    }
    else
    {
        gross_salary = base_salary;
        System.out.println("Gross Salary is:"+gross_salary);
    }
    }
}
