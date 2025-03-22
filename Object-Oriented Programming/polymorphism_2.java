// 2). Run Time Polymorphism  


class A{

    public void arbaaz(){

        System.out.println("Arbaaz is a Good Boy");
    }
}

public class polymorphism_2 extends A{


    @Override       // annotation
    public void arbaaz(){

        System.out.println("He is a Bad Boy");
    }

    public static void main(String[] args) {

        polymorphism_2 ob = new polymorphism_2();
        ob.arbaaz();
        

  


        
    }
    
}
