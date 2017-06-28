package Assignment4;
import java.util.Scanner;

public class DimondPattren {
	public static void main(String abc[])
	 {
		
		
		Scanner scr=new Scanner(System.in);
		int n;
		System.out.println("Enter the number of rows. ");
		n=scr.nextInt();


		char c;
		for(int i=1;i<=n;++i)        // FOR LOOP FOR NUMBER OF ROWS
		{
		c='a';
		for(int j=i;j<n;++j)        // FOR LOOP FOR PRINTING SPACES
		{
		System.out.print(" ");
		}
		for(int k=1;k<=i;++k)      // FOR LOOP FOR PRINTING ALPHABETS IN DESCENDING ORDER  
		{
		System.out.print(c);
		++c;
		}
		c-=2;
		for(int l=1;l<i;++l)      // FOR LOOP FOR PRINTING ALPHABETS IN ASCENDING ORDER
		{
		System.out.print(c);
		--c;
		}
		for (int m=1;m<=1;++m){
		System.out.println("a");    // INTRODUCING NEW LINE
		++c;}
		c+=2;
		for(int j=2;j<2;++j)        // FOR LOOP FOR PRINTING SPACES
		{
       System.out.print("b");
          ;
		}}

		} // end of main method
		} // end of main class



