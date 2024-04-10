package mee;

import java.util.Scanner;

public class date {
	 consoleipop objCI=new consoleipop();


	public  void getdate() {
		System.out.println("Enter day:");
		int d=objCI.getInt();
		System.out.println("Enter month:");

		int m=objCI.getInt();
		System.out.println("Enter year:");

		int y=objCI.getInt();
		int arr[]= {31,28,31,30,31,30,31,31,30,31,30,31};
		if(d<=31) {
			if(m==1) {
			if(y<=9999)
			{
				System.out.println(d+" "+m+" "+y);
			}
			else {
				System.out.println("plz enter a valid data. ");
			}
		}
			if(m==2) {
				if(y%4==0 && y<=9999) {
					if(d<=29) {
						System.out.println(d+" "+m+" "+y);
					}
				}
				else if(y%4!=0 && y<=9999) {
					if(d<=28) {
						System.out.println(d+" "+m+" "+y);

					}
				}
			}
			if(m==3) {
				if(d<=31 && y<=9999) {
					System.out.println(d+" "+m+" "+y);

				}
			}
			if(m==4) {
				if(d<=30 && y<=9999) {
					System.out.println(d+" "+m+" "+y);

				}
			}
			if(m==5) {
				if(d<=31 && y<=9999) {
					System.out.println(d+" "+m+" "+y);
				}
			}
			if(m==6) {
				if(d<=30 && y<=9999) {
					System.out.println(d+" "+m+" "+y);
				}
			}
			if(m==7) {
				if(d<=31 && y<=9999) {
					System.out.println(d+" "+m+" "+y);
				}
			}
			if(m==8) {
				if(d<=31 && y<=9999) {
					System.out.println(d+" "+m+" "+y);
				}
			}
			if(m==9) {
				if(d<=30 && y<=9999) {
					System.out.println(d+" "+m+" "+y);
				}
			}
			if(m==10) {
				if(d<=31 && y<=9999) {
					System.out.println(d+" "+m+" "+y);
				}
			}
			if(m==11) {
				if(d<=30 && y<=9999) {
					System.out.println(d+" "+m+" "+y);
				}
			}
			if(m==12) {
				if(d<=31 && y<=9999) {
					System.out.println(d+" "+m+" "+y);
				}
			}
			
			else {
				System.out.println("plz enter a valid data. ");
			}
	}
		else {
		System.out.println("plz enter a valid data. ");
	}
		
	}
	
	
     public int getDaysInMonth(int month, int year) {
       int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
       if (month == 2 && isLeapYear(year)) {
           return 29;
       }
       return daysInMonth[month - 1];
   }
     public static boolean isLeapYear(int year) {
         return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
     }
   
     
     
     public void addmonths() {
 		System.out.println("Enter day:");

    	 int day = objCI.getInt();     
 		System.out.println("Enter month:");

	        int month = objCI.getInt();     
			System.out.println("Enter year:");

			 int year = objCI.getInt();   
			 

;
			 System.out.println("Enter months to add");
	        int monthsToAdd = objCI.getInt(); 
			int s=month + monthsToAdd;

	        
	            int monthsInYear = 12;
	            if (s> monthsInYear) {
	            	int d;
	            	d=s/12;
	            	year+=d;
	            	s%=12;
	            } else {

	            	s=month + monthsToAdd;
	            }
	        
	        

	        int daysInMonth = getDaysInMonth(month, year);
	        if (day > daysInMonth) {
	            day = daysInMonth;
	        }

	        System.out.println("New date: " +day+" "+ s+" "+ year);
     }
     
     public void addyear() {
 		System.out.println("Enter day:");

    	 int day = objCI.getInt();  
 		System.out.println("Enter month:");

	     int month = objCI.getInt();   
			System.out.println("Enter year:");

	     int year = objCI.getInt(); 
	     
	     System.out.println("Enter year to add :");
	     int yy=objCI.getInt();
	     
	     int sss=year+yy;
	     if(month<=12 && sss<=9999) {
	    	 System.out.println(day+" "+month+" "+sss);
	     }else {
	    	 System.out.println("not possible");
	     }
     }
     
     
     public void addday() {

 		
 		System.out.println("Enter day:");

	        int day = objCI.getInt(); 
			System.out.println("Enter month:");

	        int month = objCI.getInt();     
			System.out.println("Enter year:");

			 int year = objCI.getInt();   

			 System.out.println("Enter days to add");
	        int daysToAdd = objCI.getInt();  

	        while (daysToAdd > 0 && year<=9999) {
	            int daysInMonth = getDaysInMonth(month, year);
	            if (day + daysToAdd > daysInMonth) {
	                if (month == 12) {
	                    year++;
	                    month = 1;
	                } else {
	                    month++;
	                }
	                daysToAdd -= (daysInMonth - day + 1);
	                day = 1;
	            } else {
	                day += daysToAdd;
	                daysToAdd = 0;
	            }
	        }
	        System.out.println("New date: " +day+" "+ month+" "+ year);
		
		
		
		
		
	}
}
