import java.util.Scanner;

public class diagonalAddMatrix {
    public static void main(String[] args) {
        //diagona Addition

        int rows, columns;
        var console = new Scanner(System.in);


        //define the matrix by the user
        System.out.print("Give the total rows for the matrix: ");
        rows = Integer.parseInt(console.nextLine());
        System.out.print("Give the total columns for the matrix: ");
        columns = Integer.parseInt(console.nextLine());

        var userMatrix = new int[rows][columns];

        //ask for the matrix values

        for (var row = 0; row < rows; row++) {
            for (var col = 0; col < columns; col++) {
                System.out.print("Value[" + row + "][" + col + "] = ");
                userMatrix[row][col] = Integer.parseInt(console.nextLine());
            }
        }
        //Addition of the diagonal Matrix
        System.out.println();
        var diagonalAdd = 0;
        for(var row = 0; row < rows; row++){
            for(var col = 0; col < columns; col++){
                if(row == col)
                    diagonalAdd += userMatrix[row][col];
            }
        }
        System.out.println("Diagonal addition of the matrix: " + diagonalAdd);
    }
}