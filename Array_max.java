
package array_max;

import java.util.Scanner;

public class Array_max 
{
  public static void main(String[] args) 
  {   
        int a[],n=0,i,max;
        a= new int[10];
        
        Scanner x = new Scanner (System.in);
        
        System.out.println("Enter the value of a = ");
        n=x.nextInt();
        
        for(i=0;i<n;i++)
        {
              System.out.println("a[ "+i+"] = ");
              a[i]=x.nextInt();
        }
        max=a[0];
        for(i=0;i<n;i++)
        {
                if(max<a[i])
                {
                    max=a[i];
                }
        }
        System.out.println("MAX = "+max);
          
    }
        
        
}
  
