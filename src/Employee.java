abstract public class Employee {


    double pf;
    int base_salary;
    double daily_salary;
    double absent_days;
    double attendance_days;

    double attendance_deduction;
    double bonus_percentage;
    double gross_salary;
    int rating;

    double bonus;
    double tax;

    Employee(int  base_salary,double attendance_days,int rating)
    {
      this.base_salary = base_salary;
      this.attendance_days= attendance_days;
      this.rating = rating;
    }

    double net_salary;
    public static final double pf_percentage = 0.12;


    void pf_deduction()
    {
        pf = base_salary * pf_percentage;
        System.out.println("PF Deducted: "+pf);
    }
   void calculate_attendance_deduction()
   {
//        DailySalary = BaseSalary / 30
//● AbsentDays = 30 - AttendanceDays
//● AttendanceDeduction = AbsentDays * DailySalary


       daily_salary =  (double) base_salary /30;
       absent_days = 30 - attendance_days;
       attendance_deduction = absent_days * daily_salary;
       System.out.println("Attendance deduction is: " +attendance_deduction);

   }

   void bonus_calculation(int rating)
   {
        bonus=0;
    switch (rating)
    {

        case 1 :
            bonus_percentage = 0.0;
            break;
        case 2 :
            bonus_percentage = 0.05;
            break;
        case 3 :
            bonus_percentage = 0.10;
            break;
        case 4 :
            bonus_percentage = 0.15;
            break;
        case 5:
            bonus_percentage = 0.20;
            break;

    }
//    Bonus = GrossSalary * BonusPercent
       bonus = gross_salary * bonus_percentage;
       System.out.println("Bonus is: "+bonus);
   }

   void tax_calculation(){
//        TaxableIncome = GrossSalary + Bonus
       double taxableIncome =  gross_salary + bonus;
       double tax_rate;
       if(taxableIncome <= 50_000 )
       {
           tax_rate = 0.05;
       }
       else if (taxableIncome <= 100_000 )
       {
           tax_rate= 0.10;
       }
       else if (taxableIncome <= 150_000 )
       {
           tax_rate= 0.15;
       }
       else
       {
           tax_rate= 0.20;
       }
//       Tax = TaxableIncome * TaxRate
       tax  = taxableIncome * tax_rate;
       System.out.println("Tax : "+tax);

   }
   void calculate_net_salary()
   {
//       NetSalary = GrossSalary + Bonus - Tax - PF - AttendanceDeduction
        net_salary = gross_salary + bonus - tax -pf -attendance_deduction;
       System.out.println("Net Salary is : "+ net_salary);
   }
   void  display_all_information()
   {
       pf_deduction();
       calculate_attendance_deduction();
      bonus_calculation(rating);
       tax_calculation();
       calculate_net_salary();
   }
   abstract void calculate_gross_salary();
}
