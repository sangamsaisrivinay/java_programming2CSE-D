import java.util.Scanner;
public class Experiment10_gcd{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a and b values:");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int gcd=0;
        int temp=n1;
        int temp1=n2;
        while (n1!=n2){
            if(n1>n2)
                n1-=n2;
            else
                n2-=n1;
        }
        gcd=n1;
        System.out.printf("%d/%d=%d/%d",temp,temp1,temp/gcd,temp1/gcd);
    }
}
