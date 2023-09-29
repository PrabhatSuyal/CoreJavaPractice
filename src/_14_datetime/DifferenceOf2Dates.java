package _14_datetime;

import java.time.*;

public class DifferenceOf2Dates {

	public static void main(String[] args) {
		
		LocalDate pdate = LocalDate.of(2012, 01, 01);
        LocalDate now = LocalDate.now();
 
        Period diff = Period.between(pdate, now);
 
     System.out.printf("\nDifference is %d years, %d months and %d days old\n\n", diff.getYears(), diff.getMonths(), diff.getDays());
		
	}

}
