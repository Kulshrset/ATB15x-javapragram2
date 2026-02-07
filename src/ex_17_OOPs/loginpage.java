package ex_17_OOPs;

public class loginpage {

    String email;
    String password;
    String submitButton;

    public loginpage(String email, String password){
        this.email=email;
        this.password=password;
    }






    public loginpage(String email, String password, String submitButton) {
        this(email, password);


        //this is called constructor chaining


        this.submitButton = submitButton;
    }



}
