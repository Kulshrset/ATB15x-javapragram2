package test;
//Create a class "Person" with attributes "name" and "age". Create two instances and print their details.
public class q2 {
    static void main(String[] args) {
        person p1=new person("nishu", 20);
        System.out.println(p1);
        p1.display();
    }

}

class person{
    String name;
    int age;

    person( String name, int age){
        this.name=name;
        this.age=age;

    }

    void display(){
        System.out.println("name :"+ name +  "age :"+  " " +age);
    }


}
