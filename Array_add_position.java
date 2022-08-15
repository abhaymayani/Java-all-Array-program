
package array_add_position;

import java.util.Scanner;


public class Array_add_position 
{
    
    public static void main(String[] args) 
    {
        int a[],i;
        a=new int[10];
        
        Scanner x =new Scanner (System.in);
        
        System.out.print("Enter the value of n = ");
        int n;
        n=x.nextInt();
        
        for(i=0;i<n;i++)
        {
            System.out.print("a[ "+i+"] = ");
            a[i]=x.nextInt();
        }
        
        int pos;
        System.out.print("Enter the position if you want to add = ");
        pos=x.nextInt();
        
        int value;
        System.out.print("Enter the number if you want to Enter = ");
        value=x.nextInt();

        
        for(i=n;i>pos;i--)
        {
            a[i]=a[i-1];
        }
        a[pos]=value;
        n++;
        
        for(i=0;i<n;i++)
        {
            System.out.println("a["+i+"]="+a[i]);
        }
        
    }
    
}

