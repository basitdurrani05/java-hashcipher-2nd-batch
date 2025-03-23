// 4). Hybrid inheritance

class pardada{

    public void show(){
        System.out.println("Par Dada Jii");
    }
}

class dada extends pardada{

    public void show2(){
        System.out.println("Dada Jii");
    }
}

class papa extends dada{


    public void show3(){
        System.out.println("Papa Jii");
    }
}



public class inheritance_4 extends papa{



    public void show4(){
        System.out.println("Child - Me");
    }

    public static void main(String[] args) {

        inheritance_4 obj = new inheritance_4();
        obj.show();
        obj.show2();
        obj.show3();
        obj.show4();
        
    }
    
}
