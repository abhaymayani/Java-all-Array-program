
package array_sum;

import java.util.Scanner;

public class Array_sum 
{

    public static void main(String[] args) 
    {
        int a[],n=0,sum,i;
        a= new int[10];
        
        Scanner x = new Scanner (System.in);
        
        System.out.println("Enter the value of a = ");
        n=x.nextInt();
        
        for(i=0;i<n;i++)
        {
            System.out.println("a[ "+i+"] = ");
            a[i]=x.nextInt();
        }
        sum=0;
        for(i=0;i<n;i++)
        {
            sum = sum + a[i];
        }
        System.out.println("Sum = "+sum);
        
    }
    
}
