abstract class A{

    abstract public void show();
}




public class abstraction_1 extends A{

    public void show(){
        System.out.println("Hello Abstractions");
    }


    public static void main(String[] args) {

        abstraction_1 ob = new abstraction_1();

        ob.show();
        

    }
    
}
