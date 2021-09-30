public class empPartTimeFullTime {
	public static void main(String[] args) {
		System.out.println( "Welcome to Employee Wage Computation Program" );
		int isFullTime= 1;
		int isPartTime= 2;
		int fullDayHour= 0;
		int partTimeHour= 0;
		int empWagePerHour=20;
		double empCheck = Math.floor(Math.random() * 10) % 3;
		if (empCheck == isFullTime )
			{
				fullDayHour=8;
			double fullTimeEmpWage=(empWagePerHour*fullDayHour);
				System.out.println( "Employee is Present as Full-Time" );
				System.out.println( "Employee Wage: " +fullTimeEmpWage);
			}
		else if (empCheck == isPartTime )
			{
					partTimeHour=8;
			double partTimeEmpWage=(empWagePerHour*partTimeHour);
				System.out.println( "Employee is Present as Part-Time");
				System.out.println( "Employee Wage: " +partTimeEmpWage);
			}
		else
			{
			System.out.println( "Employee is Absent" );
			}
		}
}
