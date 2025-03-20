public class thirteen {

    // public void count(){

    //     System.out.println("one");
    // }

    // public void count2(){

    //     count();
    //     System.out.println("Two");
    // }


    public int fact(int a){

        if(a==1){

            return 1;
        }


        else{

            return a*fact(a-1);
        }
    }



    public static void main(String[] args) {      
        thirteen ob = new thirteen();

         System.out.println(ob.fact(5));
        


    }
    
}
