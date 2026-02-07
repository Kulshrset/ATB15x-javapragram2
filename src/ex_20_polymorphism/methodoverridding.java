package ex_20_polymorphism;

public class methodoverridding {
    public static void main(String[] args) {
   dog d1=new dog();
   d1.sound();
    }
}


class aniaml{
  void sound(){
      System.out.println("default sound");
  }
}

class dog extends  aniaml{

    @Override
    void sound() {
        System.out.println("my roar");
    }
}


