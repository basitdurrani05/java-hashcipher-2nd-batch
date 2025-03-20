class B{

    private int a;
    private String b;
    private int c;

    // Home Work
    
    private String d;
    private String e;
    private int f;


    public void getA(int roll){

        a=roll;

    }

    public int setA(){
        return a;

    }


    public void getB(String name){

        b=name;
    }

    public String setB(){
        return b;
    }


    public void getC(int mobile){

        c=mobile;


    }

    public int setc(){
        return c;
    }


}




public class getter_setter_2 {

    public static void main(String[] args) {

        B ob = new B();

        ob.getA(30);
        ob.getB("Arbaaz");
        ob.getC(8884325);

        System.out.println(ob.setA());
        System.out.println(ob.setB());
        System.out.println(ob.setc());
        
    }
    
}
