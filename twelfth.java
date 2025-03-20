public class twelfth {

    public void arbaaz(String a){

        System.out.println("Company : ");

        System.out.println("Arbaaz : "+a);
    }

    public void arbaaz(String b, String c){

        System.out.println("Home : \n");
        System.out.println("Arbaaz : "+b);
        System.out.println("Arbaaz : "+c);


    }

    public void arbaaz(String d, String e, String f){

        System.out.println("College : \n");
        System.out.println("Arbaaz : "+d);
        System.out.println("Arbaaz : "+e);
        System.out.println("Arbaaz : "+f);

        
    }


    


    public static void main(String[] args) {

        twelfth d = new twelfth();

        d.arbaaz("Software Engineer");

        d.arbaaz("Son","Brother");

        d.arbaaz("Friend","Best-Friend","Student");

 







        
    }
    
}
