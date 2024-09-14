import java.util.Scanner;

public class dinamicMatrix {
    public static void main(String[] args) {
        //add values to a matrix
        int rows, columns;
        var console = new Scanner(System.in);
        //define the Matrix
        System.out.print("Give the matrix total rows: ");
        rows = Integer.parseInt(console.nextLine());
        System.out.print("Give the matrix total columns: ");
        columns = Integer.parseInt(console.nextLine());

        var userMatrix = new int[rows][columns];
        //Ask for the atrix values
        for(var row =0; row < rows; row++){
            for (var col = 0; col < columns; col++){
                System.out.print("Value for [" + row + "] = ");
                userMatrix[row][col] = Integer.parseInt(console.nextLine());

            }
        }
        //iterate userMatrix Values
        for(var row =0; row < rows; row++){
             for(var col = 0; col < columns; col++){
                 System.out.println("Matrix[" + row + "][" + col + "] = "
                 + userMatrix[row][col]);
             }
        }
    }
}
