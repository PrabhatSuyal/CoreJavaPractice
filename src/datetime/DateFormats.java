package datetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.Date;

public class DateFormats {

	public static void main(String[] args) {
		
		String result;
		//Date localDate = new Date();
		LocalDate localDate = LocalDate.now();
        DateTimeFormatter formatterLocalDate = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        result = formatterLocalDate.format(localDate);
		//DateTimeFormatter df = new DateTimeFormatter();
		//Date dt = new Date("24012022");
		System.out.println(result);
		
		LocalDate localDate1 = LocalDate.parse("2020-06-01");
		String localDateAsDefaultString = localDate1.toString();
        System.out.println("LocalDate: " + localDateAsDefaultString + "( year: " + localDate1.getYear() + ", month: " + localDate1.getMonthValue() + ", day: " + localDate1.getDayOfMonth() + " )");
        System.out.println("\nNext Friday: "+localDate1.with(TemporalAdjusters.next(DayOfWeek.FRIDAY)));
        System.out.println("Previous Friday: "+localDate1.with(TemporalAdjusters.previous(DayOfWeek.FRIDAY))+"\n");
	}

}
