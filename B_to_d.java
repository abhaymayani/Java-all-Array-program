package b_to_d;

import java.util.Scanner;

public class B_to_d 
{
    public static void main(String[] args) 
    {
        Scanner x = new Scanner (System.in);
        int k=0,t=1,n,b,sum=0;
        
        System.out.println("Enter Your Binnary Number : ");
        b=x.nextInt();
        
        do
        {
            n= b % 10;
            b= b / 10; 
            
            k=n*t;
            sum=sum+k;
            t=t*2;
            
        }while(b>0);
        //sum=sum/2;
        System.out.println("Decimal = "+sum);
        
        
        //Binnary To HexaDesimal Convert...
        char str[]= {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        int s1;
        String temp="";
        /*int no;
        System.out.println("Enter the binnary number : ");
        no=x.nextInt();
        
        temp = 16%no;
        
        str=temp;*/
        
        while(sum>0)
        {
            s1=sum%16;
            temp=str[s1]+temp;
            sum=sum/16;
        }
        System.out.println("HexaDesimal : "+temp);
    }
}