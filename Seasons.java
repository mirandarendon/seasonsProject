
import java.util.Scanner;

public class Seasons {

    public static void main (String[] args) {
        
        Scanner scnr = new Scanner(System.in);
		
		int month, day;
		
		// gather user input for month
		System.out.println("Please enter a month (1-12)");
		month = scnr.nextInt();
		
		// test month validity
		if((month < 1) || (month > 12)) {
		System.out.println("invalid month");
		}
		
		// gather user input for day
		System.out.println("Please enter day");
		day = scnr.nextInt();
		
		
		// test day validity
		switch(month) {
		
		case 4, 6, 9, 11:
			if((day < 1) || (day > 30))
				System.out.println("invalid day");
			break;
			
		case 2:
			if((day < 1) || (day > 29))
				System.out.println("invalid day");
			break;
			
		default:
			if((day < 1) || (day > 31))
				System.out.println("invalid day");
			
		}
		
		// decide season
		switch(month) {
		
		case 4, 5:
			System.out.println("This date is in Spring!");
			break;
		
		case 7, 8:
			System.out.println("This date is in Summer!");
			break;
			
		case 10, 11:
			System.out.println("This date is in Fall!");
			break;
			
		case 1, 2:
			System.out.println("This date is in Winter!");
			break;
			
		case 3:
			if(day >= 21)
				System.out.println("This date is in Spring!");
			else
				System.out.println("This date is in Winter!");
			break;
			
		case 6:
			if(day >= 21)
				System.out.println("This date is in Summer!");
			else
				System.out.println("This date is in Spring!");
			break;
			
		case 9:
			if(day >= 21)
				System.out.println("This date is in Fall!");
			else
				System.out.println("This date is in Summer!");
			break;
			
		case 12:
			if(day >= 21)
				System.out.println("This date is in Winter!");
			else
				System.out.println("This date is in Fall!");
			break;
		}
		
		scnr.close();
		
    }
}