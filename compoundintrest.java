import java.util.Scanner;

public class CompoundIntrest {

    private static double A;


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("enter pricipal amount");
        
        double P = input.nextDouble();
        
        System.out.println("enter intrest rate");
        
        double I = input.nextDouble();
        
         System.out.println("Period in years");
         
         double N = input.nextDouble();
         
         A =P*Math.pow(1+I*N, N);
         
          System.out.println("the final amount"+A);
                 
        
         
     
        
        
         
        
    }
    
}

