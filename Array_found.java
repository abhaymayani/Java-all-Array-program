package array_found;

import java.util.Scanner;

public class Array_found 
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
        int no;
        System.out.print("Enter the number if you want to search = ");
        no=x.nextInt();
        
        for(i=0;i<n;i++)
        {
            if(no == a[i])
            {
                c++;
                flag =1;
            }
        }
        if(flag==1)
        {
             System.out.println(no+" number of found "+c+" time");
        }
        else
        {
            System.out.println("No. is not found..");
        }
        
    }
    
    
}
