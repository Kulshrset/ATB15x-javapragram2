package ex_18_oops_const;

public class lab2_const {
    static void main(String[] args) {
        WebAutomations w1=new WebAutomations();

        car c1= new car();
        System.out.println(c1.name);
        System.out.println(c1.model);
        System.out.println(c1.year );


    }
}

 class WebAutomations{

    //DC
    WebAutomations(){
        System.out.println("i want to read a csv files");
        System.out.println("open the page before loading the scriprs");




    }
 }

 class car{
    String name;
    String year;
    String model;


car(){
    name= " unknown car";
    //year = "2000";
    model=" xxxx";
    year="2000";

}


 }
