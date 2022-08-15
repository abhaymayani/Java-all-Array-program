
package array_min;

import java.util.Scanner;

public class Array_min 
{
    public static void main(String[] args) 
    {
     int a[],n=0,i,j=0,min;
        a= new int[10];
        
        Scanner x = new Scanner (System.in);
        
        System.out.println("Enter the value of a = ");
        n=x.nextInt();
        
        for(i=0;i<n;i++)
        {
              System.out.println("a[ "+i+"] = ");
              a[i]=x.nextInt();
        }
        min=a[0];
        for(i=0;i<n;i++)
        {
                if(min>a[i])
                {
                    min=a[i];
                }
        }
        System.out.println("MIN = "+min);
    }
    
}
