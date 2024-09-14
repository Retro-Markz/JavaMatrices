public class matrixPractice {
    public static void main(String[] args) {
        var matrix = new int[][]{
                {100,200,300},
                {400,500,600}
        };

        //external cicle
        for(var lin = 0; lin < matrix.length; lin++){
            //inner cicle
            for(var col = 0; col< matrix[lin].length; col++){
                System.out.println("Value[" + lin + "][" + col + "] = " + matrix[lin][col]);
            }
        }



    }
}
