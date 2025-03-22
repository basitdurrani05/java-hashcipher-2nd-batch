// Polymorphism

// 1). Compile Time


public class polymorphism_1 {

    public void arbaaz(){
        System.out.println("Student");
    }

    public void arbaaz(String college){
        System.out.println(college);
    }

    public void arbaaz(int id, String compnay ){
        System.out.println("Id Number : " + id);
        System.out.println("Company Name : " + compnay);
    }



    public static void main(String[] args) {

        polymorphism_1 ob = new polymorphism_1();

        ob.arbaaz();
        ob.arbaaz("Friend");
        ob.arbaaz(345,"Software Engineer");
        
    }
    
}
