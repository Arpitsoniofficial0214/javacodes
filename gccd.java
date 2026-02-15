package poly;

import java.util.Scanner;

public class gccd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner sc-new Scanner(System.in);
 int n=sc.nextInt();
 int divisor=36;
 int divident = 60;
 while(divident % divisor != 0) {
	 int rem= divident % divisor;
	  divident = divisor ;
	 divisor = rem;
 }
 System.out.println(divisor);
	}

}
