import java.io.*;
import java.util.Scanner;

class Binarysearchinstrings{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size");
		int size=sc.nextInt();
		String a[]=new String[size];
		for(int i=0;i<size;i++)
			a[i]=sc.nextLine();
		System.out.println("array before sort:");
		display(a);
		sortArray(a);
		System.out.println("array after sort:");
		display(a);
		System.out.println("enter search element:");
		String search=sc.nextLine();
		binarySearch(a,search);
	}
	public static void display(String a[]){
		for(String i:a)
			System.out.println(i+" ");
	}
	public static void sortArray(String []a){
		for(int i=0;i<a.length-1;i++){
			 if(a[i].compareTo(a[i+1])>0){
				String temp=a[i];
				a[i]=a[i+1];
				a[i+1]=temp;
			}
		}
	}
	public static void binarySearch(String a[],String search){
		int lb=0;
		int ub=a.length-1;
		int flag=0;
		while(lb!=ub){
			int mid=(ub+lb)/2;
			if(search.compareTo(a[mid])==0) {
				System.out.printf("%s found at %d location", search, mid + 1);
				flag=1;
				break;
			}
			else if(search.compareTo(a[mid])>0) {
				lb = mid + 1;
			}
			else {
				ub = mid - 1;
			}
		}
		if(flag==0)
			System.out.println("element not found");
	}
}
