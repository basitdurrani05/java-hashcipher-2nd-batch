import java.util.Scanner;

public class khan {

    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);  // Input

        System.out.println("Enter 1st Number : ");
        int a = sc.nextInt();  // Integer Input    // nextInt() - Method


        System.out.println("Enter 2nd Number : ");
        int b = sc.nextInt();


        System.out.println("Operator : 1).Add\n 2).Subtraction");
        int operator = sc.nextInt();

        switch (operator) {
            case 1:
            int result = a+b;
            System.out.println("Addition : "+result);
            break;
        


            case 2:

            int result2 = a-b;
            System.out.println("Subtraction : "+result2);
            break;

            
          
        
            
        }







    }
    
}
