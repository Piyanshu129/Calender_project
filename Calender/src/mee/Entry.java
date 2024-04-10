package mee;
import java.util.*;
public class Entry {
	public static void main(String[] args) {
		consoleipop ss=new consoleipop();
		while (true) {
			System.out.println("Enter 1 for enter date");
			System.out.println("Enter 2 for add days");
			System.out.println("Enter 3 for add months");
			System.out.println("Enter 4 for add year");
			System.out.println("Enter 5 for disp date");
			System.out.println("Enter 6 to exit");
			date s=new date();

			switch(ss.getInt()) {
			
			case 1:
				s.getdate();
				break;
			case 2:
				s.addday();
				break;
			case 3:
				s.addmonths();
				break;
			case 4:
				s.addyear();
				break;
			case 5:
				s.getdate();
				break;
			case 6:
				System.exit(0);
				break;
			default:
				System.out.println("pls enter value b/w 1-6");	
			}

			
			
		}
	}

}
