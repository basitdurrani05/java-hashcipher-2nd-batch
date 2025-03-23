// 5). Mutliple Inheritance (Achieve through Interface)


interface firstname{

    void fname();
}

interface lastname{

    void lname();
}




public class interface_1 implements firstname, lastname{

    public void fname(){
        System.out.println("First Name: Arbaaz");
    }

    public void lname(){
        System.out.println("Last Name: Khan");
    }



    public static void main(String[] args) {


        interface_1 obj = new interface_1();
        obj.fname();
        obj.lname();
        
    }
    
}
