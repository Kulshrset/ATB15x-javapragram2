package ex_17_OOPs;

public class lab5_baby {
    static void main(String[] args) {
        baby b1= new baby();
      //String name;
        baby b2= new baby("kuls");
         baby b3=new baby("kk","50");



    }
}

class baby{
    String name;

    baby(){
        System.out.println("marvel");
    }

baby(String name){
    System.out.println("baby-name");
}

baby(String name, String money){
    System.out.println("dc-name.age");
}

}



