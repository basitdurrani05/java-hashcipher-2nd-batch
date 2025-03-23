// 2). Multilevel Inheritance



class Dada{

    public void method1(){
        System.out.println("Dada jii");
    }


}

class parents extends Dada{



    public void method2(){
        System.out.println("Parents");
    }
}




public class inheritance_2 extends parents{


    public void method3(){
        System.out.println("Child - Me");
    }

    public static void main(String[] args) {

        inheritance_2 obj = new inheritance_2();

        obj.method1();
        obj.method2();
        obj.method3();

        
        
    }
    
}
