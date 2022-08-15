package arr2d_row_max;

import java.util.Scanner;

public class Arr2d_row_max 
{
    public static void main(String[] args) 
    {
        int a[][],j,i,max=0;
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
       
        for(i=0;i<3;i++)
        {
            max=a[i][0];
            for(j=0;j<3;j++)
            {
                if(max<a[i][j])
                {
                    max=a[i][j];
                }
                System.out .print(" "+a[i][j]);
            }
            System.out.print("max = "+max);
            System.out.println(" ");
        }
        for(i=0;i<3;i++)
        {
            max=a[i][0];
            for(j=0;j<3;j++)
            {
                if(max<a[j][i])
                {
                    max=a[j][i];
                }
            }
            System.out.print(""+max);
            System.out.print(" ");
        }
    }
}
