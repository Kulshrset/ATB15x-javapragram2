package ex_08_ternary;

public class lab3_nested_ternery {
    static void main(String[] args) {
        int age =21;
        String result= (age > 18) ? ((age > 25) ? "you can drink" : "you cant drink") :
                "no you can go to goa";

        System.out.println(result);
    }

}
