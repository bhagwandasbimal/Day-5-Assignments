public class empDailyWage {
	public static void main(String[] args) {
			System.out.println( "Welcome to Employee Wage Computation Program" );
		int isFullTime= 1;
		int fullDayHour= 0;
		double empCheck = Math.floor(Math.random() * 10) % 2;
		if (empCheck == isFullTime )
			{
			System.out.println( "Employee is Present" );
				fullDayHour= 8;
			}
		else
			{
			System.out.println( "Employee is Absent" );
				fullDayHour= 0;
			}
		int empWagePerHour= 20;
		double dailyEmpWage=(empWagePerHour*fullDayHour);
			System.out.println( "Daily Employee Wage :" +dailyEmpWage );
			}
	}
