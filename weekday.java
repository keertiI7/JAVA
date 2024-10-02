package labinternal;
import java.util.Scanner;
import java .util.Random;
public class weekday {
		public static void main(String[]args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a number :");
			int n=sc.nextInt();
			Random r=new Random();
			int daynumber=r.nextInt(7)+1;
			System.out.println(daynumber);
			switch(daynumber) {
			case 1:
				System.out.println("MONDAY");
				break;
			
			case 2:
				System.out.println("TUESDAY");
				break;
			
			case 3:
				System.out.println("WEDNESDAY");
				break;
			
			case 4:
				System.out.println("THRUSDAY");
				break;
				
			case 5:
				System.out.println("FRIDAY");
				break;
				
			case 6:
				System.out.println("SATURDAY");
				break;
			
			default:
				System.out.println("INVALID");
			}
		}
		}

