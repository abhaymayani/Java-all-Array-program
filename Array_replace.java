package array_replace;

import java.util.Scanner;

public class Array_replace 
{
    public static void main(String[] args) 
    {
        int a[],i,c=0,flag=0;
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
        for(i=0;i<n;i++)
        {
            System.out.println("a["+i+"]="+a[i]);
        }
        int no;
        System.out.print("Enter the number if you want to search = ");
        no=x.nextInt();
        
        int rep;
        System.out.print("Enter the number replace = ");
        rep=x.nextInt();

        
        for(i=0;i<n;i++)
        {
            if(no == a[i])
            {
                a[i]=rep;
               
            }
            System.out.println("a["+i+"]="+a[i]);  
        }
    }
    
}
