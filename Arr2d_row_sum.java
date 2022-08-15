
package arr2d_row_sum;

import java.util.Scanner;

public class Arr2d_row_sum 
{
    public static void main(String[] args) 
    {
        int a[][],sum=0,j;
        a=new int [10][10];
        
        Scanner x = new Scanner (System.in);
        
        for(int i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.print("a["+i+"]["+j+"] = ");
                a[i][j]=x.nextInt();
            }
        }
        for(int i=0;i<3;i++)
        {
            sum=0;
            for(j=0;j<3;j++)
            {
                System.out.print(a[i][j]+"  ");
                sum=sum+a[i][j];
            }
            System.out.print(" = "+sum);
            System.out.println("");
            
        }
        
    }
    
}
