
package arr2d_col_sum;

import java.util.Scanner;


public class Arr2d_col_sum 
{
    public static void main(String[] args) 
    {
        int a[][],sum=0,j,i;
        a=new int [10][10];
        
        Scanner x = new Scanner (System.in);
        
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.print("a["+i+"]["+j+"] = ");
                a[i][j]=x.nextInt();
            }
        }
        System.out.println("____________Array____________");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.print(a[i][j]+"  ");
            }
            System.out.println("");
        }
        System.out.println("------------");
        for(i=0;i<3;i++)
        {
            sum=0;
            for(j=0;j<3;j++)
            {
                sum=sum+a[j][i];            
            }
            System.out.print(sum+" ");
            System.out.print("");
        }
    }
}
