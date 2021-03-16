import java.util.Scanner;

public class Assignment7 {

	public static void main(String[] args) {
		
		 int[] num = {52, 22, 74, 6,19,1,23,26,35,37,7};
	   
	        Scanner sc=new Scanner(System.in);
			System.out.println("Enter number ");
			int toFind=sc.nextInt();
	        boolean found = false;

	        for (int n : num) {
	            if (n == toFind) {
	                found = true;
	                break;
	            }
	        }

	        if(found)
	            System.out.println(toFind + " is found.");
	        else
	            System.out.println(toFind + " is not found.");
	    }
	
	
}
