import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter first number: ");
      double x=sc.nextDouble();
      System.out.println("Enter second number: ");
      double y=sc.nextDouble();
      System.out.println("Enter third number: ");
      double z=sc.nextDouble();
      if(x>y && x>z){
          System.out.printf("Greatest number is %f",x);
      }
      else if(y>x && y>z){
          System.out.printf("Greatest number is %f",y);
      }
      else{
          System.out.printf("Greatest number is %f",z);
      }

    } 
        
    }
    