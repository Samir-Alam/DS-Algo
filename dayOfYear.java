package Homeworks;

import java.util.*;
import java.util.Scanner;

public class dayOfYear {

	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);		//easiest method
//		//String month = in.next();
//		int mm = in.nextInt();
//		//String day = in.next();
//		int dd = in.nextInt();
//		//String year = in.next();
//		int yy = in.nextInt();
//		in.close();
//		LocalDate dt = LocalDate.of(yy, mm, dd);
//		System.out.println(dt.getDayOfWeek());
//		System.out.println(LocalDate.of(yy, mm, dd).getDayOfWeek());
//
//	}

	
	
//	        Scanner in = new Scanner(System.in);		//next method
//	        String month = in.next();
//	        String day = in.next();
//	        String year = in.next();
//	        String input_date = day + "/" + month + "/" + year;
//	        SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy");
//	        try 
//	        {
//	            DateFormat format2 = new SimpleDateFormat("EEEE"); 
//	            String final_day = format2.format(format1.parse(input_date));
//	            System.out.println(final_day.toUpperCase());
//	        }
//	        catch(Exception e){}
		
		
		try (Scanner scanner = new Scanner(System.in)) {		//another method
			int month = scanner.nextInt();
			int day = scanner.nextInt();
			int year = scanner.nextInt();

			Calendar calendar = Calendar.getInstance();
			calendar.set(Calendar.DATE, day);
			calendar.set(Calendar.MONTH, month - 1);
			calendar.set(Calendar.YEAR, year);

			System.out.println(calendar.getDisplayName(Calendar.DAY_OF_WEEK,
					Calendar.LONG, new Locale("en", "US")).toUpperCase());
		}
	    }
	}


