public class Matrices {
    public static void main(String[] args) {

        //define a Matrix
        int[][] matrix = new int[2][3];
        //var matrix = new int[2][3];

        //modify values
        matrix[0][0] = 100;
        matrix[0][1] = 200;
        matrix[0][2] = 300;
        matrix[1][0] = 400;
        matrix[1][1] = 500;
        matrix[1][2] = 600;

        //access values
        System.out.println("Values in 1: " + matrix[0][0]);
        System.out.println("Values in 2: " + matrix[0][1]);
        System.out.println("Values in 3: " + matrix[0][2]);
        System.out.println("Values in 4: " + matrix[1][0]);
        System.out.println("Values in 5: " + matrix[1][1]);
        System.out.println("Values in 6: " + matrix[1][2]);

        //iterate a matrix
        final var LINES = 2;
        final var COLUMNS = 3;
        var mainMatrix = new int[LINES][COLUMNS];

        mainMatrix[0][0] = 1000;
        mainMatrix[0][1] = 2000;
        mainMatrix[0][2] = 3000;
        mainMatrix[1][0] = 4000;
        mainMatrix[1][1] = 5000;
        mainMatrix[1][2] = 6000;

        //iterate Matrix
        //external cicle, iterate LINES
        for(var lin = 0; lin < LINES; lin++){
            //inner cicle, iterate COLUMNS
            for(var col = 0; col< COLUMNS; col++){
                System.out.println("Value[" + lin + "][" + col + "] = " + mainMatrix[lin][col]);
            }
        }
    }
}
