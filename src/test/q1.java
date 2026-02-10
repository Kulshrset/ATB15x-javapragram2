package test;


//Implement encapsulation in a class "Employee" with private attributes "id", "name", and "salary".
// Add getter and setter methods.Implement encapsulation in a class "Employee" with private attributes "id", "name", and "salary". Add getter and setter methods.
public class q1 {


    private static class employee {


        String name;
        int id;
        float salary;


        public String getName() {
            return name;
        }

        public int getid() {
            return id;
        }

        public float getsalary() {
            return salary;
        }

        public void setName(String name) {
            this.name = name;
        }


        public void setid(int id) {
            this.id = id;
        }

        public void setsalary(float salary) {
            this.salary = salary;
        }


        static void main(String[] args) {
            employee e=new employee();
            e.setName("kulsh");
            e.setsalary(1200);
            e.setid(12);

            System.out.println(e.getid());
            System.out.println(e.getsalary());
            System.out.println(e.getName());



        }

    }
}
