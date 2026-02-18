package ex_compare_camparator;
import java.util.Objects;
public class compare {
    static void main(String[] args) {


         class Student implements Comparable<Student> {

            private int rollNo;
            private String name;
            private int marks;

            // Constructor
            public Student(int rollNo, String name, int marks) {
                this.rollNo = rollNo;
                this.name = name;
                this.marks = marks;
            }

            // Getter
            public int getRollNo() {
                return rollNo;
            }

            public String getName() {
                return name;
            }

            public int getMarks() {
                return marks;
            }

            // Setter
            public void setMarks(int marks) {
                this.marks = marks;
            }

            // Override equals() and hashCode() (Important for Set)
            @Override
            public boolean equals(Object o) {
                if (this == o) return true;
                if (!(o instanceof Student)) return false;
                Student s = (Student) o;
                return rollNo == s.rollNo;
            }

            @Override
            public int hashCode() {
                return Objects.hash(rollNo);
            }

            // For TreeSet (Sorting by marks)
            @Override
            public int compareTo(Student s) {
                return this.marks - s.marks;
            }

            // Override toString()
            @Override
            public String toString() {
                return rollNo + " " + name + " " + marks;
            }
        }

    }
}
