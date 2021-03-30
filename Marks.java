package p1;
import java.util.Scanner;
public class Marks {
		public static void main(String[] args) {
			int english,java,db,springTools;
			
			Scanner sc =new Scanner(System.in);
			System.out.println("Enter English Marks ");
			english=sc.nextInt();
			
			System.out.println("Enter Java Marks ");
			java=sc.nextInt();
			
			System.out.println("Enter DBMS Marks ");
			db=sc.nextInt();
			
			System.out.println("Enter Spring Tools Marks ");
			springTools=sc.nextInt();
			
			int totalMarks = (english+java+db+springTools);
			
			System.out.println("Total Marks="+totalMarks);
			
			int avg=totalMarks/4;
			System.out.println("Average Marks="+avg);

	}
	}


