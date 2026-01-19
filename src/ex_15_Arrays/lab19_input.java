package ex_15_Arrays;

public class lab19_input {
    static void main(String[] args) {

        int [][]matrix={{1,2,3},{21,54,2}, {1,2,3},{21,54,2}};
//4*3
        System.out.print(matrix.length);
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j] + " |");

            }
            System.out.println();
        }


        System.out.println();
    }
}
