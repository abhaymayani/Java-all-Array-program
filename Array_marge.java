
package array_marge;

import java.util.Scanner;

public class Array_marge 
{

    public static void main(String[] args) 
    {
        int a[],b[],m[],c=0,i,n1,n2=0;
        a=new int[10];
        b=new int[10];
        m=new int[10];
        
        Scanner x =new Scanner (System.in);
        
        System.out.print("Enter the value of n1 = ");
        n1=x.nextInt();
        
        for(i=0;i<n1;i++)
        {
            System.out.print("a[ "+i+"] = ");
            a[i]=x.nextInt();
        }
        
        System.out.print("Enter the value of n2 = ");
        n2=x.nextInt();
        
        for(i=0;i<n2;i++)
        {
            System.out.print("a[ "+i+"] = ");
            b[i]=x.nextInt();
        }
        
        System.out.println("MARGE ARRAY : ");
        for(i=0;i<n1;i++)
        {
            //System.out.println("a["+i+"]= "+a[i]);
            m[c]=a[i];
            c++;
        }
        for(i=0;i<n2;i++)
        {
           // System.out.println("b["+i+"]= "+b[i]);
            m[c]=b[i];
            c++;
        }
        for(i=0;i<c;i++)
        {
            System.out.println("m["+i+"]= "+m[i]);
        }
    }
    
}
