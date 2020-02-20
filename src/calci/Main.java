package calci;
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Label:for(int i=0;i<1;i++) {
	    System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Divide");
       
	    System.out.println("Enter your choice:");
     
	    Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	    Add add=new Add();
	    Subtract sub=new Subtract();
	    Multiply mul=new Multiply();
	    Divide div=new Divide();
        if(n==1) {
        	add.Add();
        }
        else if(n==2) {
        	sub.Subtract();
        }
        else if(n==3) {
        	mul.Multiply();
        }
        else if(n==4) {
        	div.Divide();
        }
        else {
        	System.out.println("Invalid option!!!!");
        	continue Label;
        }
        
        }
	    	
        
	}
}
class Add {
    void Add()
    {
        Scanner s=new Scanner(System.in);

        System.out.println("How many numbers do you want to add:");

        int n=s.nextInt();

        double arr[]=new double[n];

        System.out.println("Enter numbers:");

        for(int i=0;i<n;i++){
            arr[i]=s.nextDouble();

        }
        double sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
        }
        System.out.println("Addition of given numbers is:"+sum);
    }
}
class Multiply{
    void Multiply(){
        
    System.out.println("Enter no.of operands:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
    double a[]=new double[n];
    System.out.println("Enter the numbers:");
    for(int i=0;i<n;i++){
        a[i]=sc.nextDouble();
       
       
    }
    double mul=1;
    for(int j=0;j<n;j++){
        mul=mul*a[j];
    }
    System.out.println("multiplication of given numbers is:"+mul);
}}
class Divide{
    void Divide()
    {
         Scanner sc=new Scanner(System.in);
        
          System.out.println("Enter first number:");
    double n1=sc.nextInt();
    System.out.println("enter second number:");
    double n2=sc.nextInt();
    double  d=n1/n2;
    System.out.println("Division of numbers is:"+d);
    }
}

class Subtract{
    void Subtract()
    {
         Scanner sc=new Scanner(System.in);
        
          System.out.println("Enter first number:");
    double n1=sc.nextInt();
    System.out.println("Enter second number:");
    double n2=sc.nextInt();
    double  s=n1-n2;
    System.out.println("Division of numbers is:"+s);
    }
}
