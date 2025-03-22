// Inheritance

// 1). Single inheritance
// 2). Multilevel inheritance
// 3). Hierarchical inheritance
// 4). Multiple inheritance  (through interface)
// 5). Hybrid inheritance


// 1). Single inheritance


class A{

   void display(){

    System.out.println("Company Details : ");
   }



}

public class inheritance_1 extends A {

    
    void employee(){

        String a ="Arbaaz";
    int id =20;
    String designation = "Software Engineer";

    System.out.println("Name: "+a);
    System.out.println("ID: "+id);
    System.out.println("Designation: "+designation);
    }


    public static void main(String[] args) {


        inheritance_1 ob = new inheritance_1();
        ob.display();
        ob.employee();
        

    }
    
}
