// EMI Calculator program in java 
import java.io.*; 
import java.util.Scanner;
public class emicalculator { 
      
    // Function to calculate EMI 
    static double emi_calculator(double p,  
                           double r, double t) 
    { 
        double emi; 
      
        r = r / (12 * 100); // one month interest 
        t = t * 12; // one month period 
        emi = (p * r * (double)Math.pow(1 + r, t))  
                / (double)(Math.pow(1 + r, t) - 1); 
      
        return (emi); 
    } 
      
    // Driver Program 
    static public void main (String[] args) 
    { 
	System.out.println("\n\t\t\tKOTAK MAHINDRA BANK-HOME LOANS\n");
        Scanner sc=new Scanner(System.in);
        double principal, rate, time, emi; 
	System.out.print("enter principle amount:");
        principal = sc.nextDouble(); 
	System.out.print("\nenter rate of interest per annum:");
        rate = sc.nextDouble(); 
	System.out.print("\nenter time in months:");
        time = sc.nextDouble(); 
          
        emi = emi_calculator(principal, rate, time); 
          
        System.out.println("Monthly EMI is = Rs." +String.format("%.2f",emi)+"/-");
    System.out.println("amount borrowed=Rs."+String.format("%.2f",principal)+ "/-");
	System.out.print("total payable amount=Rs.");
 	principal+=emi*time;
	System.out.println(String.format("%.2f",principal)+"/-");
	System.out.println("\n\t\tTHANK YOU...VISIT AGAIN");
	
    } 
} 
  