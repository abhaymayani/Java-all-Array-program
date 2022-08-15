package array_of_obj;

import java.util.Scanner;

public class Array_of_obj 
{
    static Scanner x = new Scanner (System.in);
    Scanner x1 = new Scanner(System.in);
    
    int roll_no,s1,s2,s3,s4,s5,tot;
    String name;
    float pr;
    
    void get_data()
    {
        System.out.print("Enter the Roll No : ");
        roll_no = x.nextInt();
        
        System.out.print("Enter the name : ");
        name  = x1.nextLine();
        
        System.out.print("Enter the Subject Mark 1 : ");
        s1 = x.nextInt();
        System.out.print("Enter the Subject Mark 2 : ");
        s2 = x.nextInt();
        System.out.print("Enter the Subject Mark 3 : ");
        s3 = x.nextInt();
        System.out.print("Enter the Subject Mark 4 : ");
        s4 = x.nextInt();
        System.out.print("Enter the Subject Mark 5 : ");
        s5 = x.nextInt();
    }
    void total()
    {
        tot = s1+s2+s3+s4+s5;
        
    }
    void per()
    {
        pr = (float)tot/5;
        
    }
    void display()
    {
        System.out.println(roll_no+"   \t   "+name+"  \t  "+s1+"  \t  "+s2+"  \t  "+s3+"  \t  "+s4+"  \t  "+s5+"  \t  "+tot+"  \t  "+pr);
    }
    public static void main(String[] args) 
    {
        int n;
        Array_of_obj ob1[] = new Array_of_obj[10];
        
        System.out.println("Enter the Number : ");
        n=x.nextInt();
        
        for(int i=0;i<n;i++)
        {
            ob1[i]=new Array_of_obj();
            ob1[i].get_data();
            ob1[i].total();
            ob1[i].per();
        }
        System.out.println("*********************************************************************************");
        System.out.println("*\t\t\t\tSTUDENT RESULT\t\t\t\t\t*");
        System.out.println("*********************************************************************************");
        System.out.println("ROLL NO    NAME \t SUB 1 \t SUB 2 \t SUB 3 \t SUB 4 \t SUB 5 \tTOTAL \t PER");
        for(int i=0;i<n;i++)
        {
            ob1[i].display();
        }
        System.out.println("*********************************************************************************");       
    } 
}