public class MagicSquare {

    /**
     *
     * @param array2d
     * @return the sum of the first row in array2d.
     */
    public static int calculateCheckSum(int[][] array2d) {
        int sum = 0;
        for(int i = 0; i < array2d[0].length; i++){
            sum += array2d[0][i];
        }
        return sum;
    }

    /**
     *
     * @param array2d
     * @param checkSum
     * @return whether the sum of each row in array2d is equal to checkSum or not.
     *         Because we have already determined the sum of the first row
     *         via the method 'calculateCheckSum', this method can begin
     *         iterating from the second row.
     */
    public static boolean magicRows(int[][] array2d, int checkSum) {
        checkSum = calculateCheckSum(array2d);
        boolean check = true;
        for(int i = 0; i < array2d.length; i++){
            int sum = 0;
            for(int col = 0; col < array2d[0].length; col++){
                sum+=array2d[i][col];
            }
            if(sum != checkSum){
                check = false;
            }
        }
        return check;
    }

    /**
     *
     * @param array2d
     * @param checkSum
     * @return whether the sum of each column in array2d is equal to checkSum or not.
     */
    public static boolean magicColumns(int[][] array2d, int checkSum) {
        checkSum = calculateCheckSum(array2d);
        boolean check = true;
        for(int i = 0; i < array2d[0].length; i ++){
            int sum = 0;
            for(int j = 0; j < array2d.length; j++){
                sum += array2d[j][i];
            }
            if(sum != checkSum){
                check = false;
            }
        }
        return check;
    }

    /**
     *
     * @param array2d
     * @param checkSum
     * @return whether the sum of each of the two main diagonals is equal to checkSum or not.
     */
    public static boolean magicDiagonals(int[][] array2d, int checkSum) {
        boolean check = true;
        int sum = 0;
        for(int i = 0; i < array2d.length; i ++){
            sum += array2d[i][i];
        }
        if(sum != checkSum){
            check = false;
        }
        for(int i = array2d.length-1; i >=0; i--){
            sum += array2d[i][i];
        }
        if(sum != checkSum) {
            check = false;
        }
        return check;
    }

    /**
     *
     * @param array2d
     * @return whether array2d is magic or not.
     */
    public static boolean isMagic(int[][] array2d) {
        int sum = calculateCheckSum(array2d);
        boolean check = magicDiagonals(array2d,sum);
        return check;
    }

}
