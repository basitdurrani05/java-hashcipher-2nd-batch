// 3). Hierarchical inheritance


class parents{



    public void method1(){
        System.out.println("Parents");
    }
}

class child extends parents{

    public void method2(){
        System.out.println("Child - Son");
    }

    public void method3(){
        System.out.println("Child - Daughter");
    }
}

public class inheritance_3 extends child{
    
    public static void main(String[] args) {

        inheritance_3  obj = new inheritance_3();
        obj.method1();
        obj.method2();
        obj.method3();
        
    }
}
