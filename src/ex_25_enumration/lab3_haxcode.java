package ex_25_enumration;

public class lab3_haxcode {
    static void main(String[] args) {
        System.out.println(hax_code.red.getHax_code());
    }
}

enum hax_code{
    red("#4f2d1d"),
    blue("#67920d"),
    green("#1a7606"),
     yellow("#af7de1");

     private  String hax_code;

     hax_code(String hax_code){
         this.hax_code=hax_code;

     }
     String getHax_code(){
         return this.hax_code;
     }



}


