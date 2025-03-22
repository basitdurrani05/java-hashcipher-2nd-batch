// 2).Copy Constructors

public class constructor_3 {

    String a;

    constructor_3(){

        a="arbaaz asheesh";
        System.out.println(a);

        
    }

    constructor_3(constructor_3 za){

        a=za.a;
        System.out.println(a);


    }


    public static void main(String[] args) {

        constructor_3 ob = new constructor_3();
        constructor_3 ob2 = new constructor_3(ob);
        
    }
    
}
