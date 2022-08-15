
package array_delete_position;

import java.util.Scanner;

public class Array_delete_position 
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
        System.out.print("Enter the position if you want to delete = ");
        pos=x.nextInt();

        
        for(i=pos;i<n;i++)
        {
            a[i]=a[i+1];
        }
        for(i=0;i<n-1;i++)
        {
            System.out.println("a["+i+"]="+a[i]);
        }
    }
    
}
