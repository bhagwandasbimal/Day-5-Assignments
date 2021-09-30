public class empWageCase {
	public static void main(String[] args) {
		System.out.println( "Welcome to Employee Wage Computation Program" );
		int isFullTime= 1;
		int isPartTime= 2;
		int fullDayHour= 0;
		int partTimeHour= 0;
		int empWagePerHour=20;
		int empCheck = (int)Math.round((Math.random() *10) % 3);
		switch (empCheck)
		{
			case 1:
				fullDayHour=8;
			int fullTimeEmpWage=(empWagePerHour*fullDayHour);
				System.out.println( "Employee is Present as Full-Time" );
				System.out.println( "Full-Time Employee Daily Wage: " +fullTimeEmpWage);
			break;
			case 2:
					partTimeHour=8;
			int partTimeEmpWage=(empWagePerHour*partTimeHour);
				System.out.println( "Employee is Present as Part-Time");
				System.out.println( "Part-Time Employee Wage: " +partTimeEmpWage);
			break;
			default:
                        System.out.println( "Employee is Absent" );
		}
	}
}
