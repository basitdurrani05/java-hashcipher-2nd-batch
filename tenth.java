import java.util.Scanner;

public class tenth {
    

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int [][]a = new int[2][2];
        int [][]b = new int[2][2];
        int [][]result = new int[2][2];

        System.out.println("Enter Array Elements : ");
        
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a.length; j++){

                a[i][j] = sc.nextInt();
            }
        }


        System.out.println("1st Array Elements are : ");

        for(int i=0; i<a.length; i++){

            for(int j=0; j<a.length; j++){

                System.out.print(a[i][j]+" ");
            }

            System.out.println();
        }


        System.out.println("Enter Array Elements : ");
        
        for(int i=0; i<b.length; i++){
            for(int j=0; j<b.length; j++){

                b[i][j] = sc.nextInt();
            }
        }


        System.out.println("2nd Array Elements are : ");

        for(int i=0; i<b.length; i++){

            for(int j=0; j<b.length; j++){

                System.out.print(b[i][j]+" ");
            }

            System.out.println();
        }


        System.out.println("\nAddition Of Matrix : ");

        for(int i=0; i<result.length; i++){

            for(int j=0; j<result.length; j++){

                result[i][j] = a[i][j]+b[i][j];
                System.out.print(result[i][j]+" ");
            }

            System.out.println();
        }


    


        

    }
}
