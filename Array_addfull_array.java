
package array_addfull_array;

import java.util.Scanner;


public class Array_addfull_array 
{
   
    public static void main(String[] args) 
    {
        int a[],b[],i;
        a=new int[10];
        b=new int[10];
        
        Scanner x =new Scanner (System.in);
        
        System.out.print("Enter the value of n = ");
        int n;
        n=x.nextInt();
        
        for(i=0;i<n;i++)
        {
            System.out.print("a[ "+i+"] = ");
            a[i]=x.nextInt();
        }
        
        System.out.print("Enter the value of n = ");
        int n1;
        n1=x.nextInt();
        
        for(i=0;i<n1;i++)
        {
            System.out.print("b[ "+i+"] = ");
            b[i]=x.nextInt();
        }
        
        int pos;
        System.out.print("Enter the position if you want to add = ");
        pos=x.nextInt();
        
        for(i=n;i>pos;i--)
        {
            a[i]=a[i-1];
        }
        n++;
        for(i=0;i<=pos;i++)
        {
            System.out.println("a["+i+"]="+a[i]);
        }
        for(i=0;i<n1;i++)
        {
            a[pos]=b[i];
            a[i]=a[pos];
        }
        for(i=0;i<n;i++)
        {
            System.out.println("a["+i+"]="+a[i]);
            //System.out.println("a["+i+"]="+a[pos]);
        }
        
    }
    
}
