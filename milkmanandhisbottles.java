/*
A Milkman serves milk in packaged bottles of varied sizes. The possible size of the bottles are {1, 5, 7 and 10} litres. He wants to supply desired quantity using as less bottles as possible irrespective of the size. Your objective is to help him find the minimum number of bottles required to supply the given demand of milk.

Input Format

First line contains number of test cases N

Next N lines, each contain a positive integer Li which corresponds to the demand of milk.

Output Format

For each input Li, print the minimum number of bottles required to fulfill the demand Constraints

For each input Li, print the minimum number of bottles required to fulfill the demand


Constraints

1 <= N <= 1000

Li > 0

1 <= i <= N

Sample Input 

2

17

65

Sample Output

2

7
*/

import java.io.*;
import java.util.Scanner;
public class Main{
          public static void main(String []args) {
             //Write your code here   
             Scanner sc=new Scanner(System.in);
             int N=sc.nextInt();
             for(int i=0;i<N;i++)
             {
                 int L=sc.nextInt();
                 int c=0;
                 if(L>=10)
                 {
                    c=c+L/10;                     
                    L=L%10;
                 }
                 if(L>=7){
                     c=c+L/7;
                     L=L%7;
                 }
                 if(L>=5){
                     c=c+L/5;
                     L=L%5;
                 }
                 if(L>=1){
                     c=c+L;
                 }
                 System.out.println(c);
             }
          }
}

