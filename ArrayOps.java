public class ArrayOps {

  public static int sum(int[] arr){
//takes array of int and returns a sum of the individual values in the array
    if (arr.length == 0){
      return 0;
    }
    int sum = 0;

    for (int i = 0; i < arr.length ; i++){
      sum += arr[i];
    }
    return sum;
  }

  public static int largest(int[] arr){
//takes a non-empty array of int and returns the largest element of the array
    int large = 0;
    for (int i = 0 ; i < arr.length - 1;i++){

      large = Math.max(arr[0], arr[i]);

    }

    return large;
  }

  public static int[] sumRows(int[][] matrix){
//takes a 2D array of int and returns a 1D array of int with each element being the sum of the individual rows of the 2D array

    int[] arrsum = new int[matrix.length];

    for (int i = 0 ; i < matrix.length; i++){
      arrsum[i] = sum(matrix[i]);

    }
    return arrsum;
  }

  public static int[] largestInRows(int[][] matrix){
//takes a nonempty 2D array of int and returns a 1D array of int with each element being the largest element of the rows

    int[] larges = new int[matrix.length];

    for (int i = 0; i < matrix.length; i++){
      larges[i] = largest(matrix[i]);

    }
    return larges;
  }

  public static int sum(int[][] arr){
//takes a 2D array of int and returns the sum of all individual values in all of the arrays
    int arrsum = 0;
    for (int i = 0; i < arr.length ; i++){
        arrsum += sum(arr[i]);

    }
      return arrsum;
  }

  public static int[] sumCols(int[][] matrix){
//returns an array with each element being the sum of the individual columns of the 2D array
    int[] colsum = new int[matrix[0].length];

      for (int i = 0 ; i < matrix.length ; i++){
        for (int k = 0; k < matrix[0].length; k++){
          colsum[k] += matrix[i][k];
        }


      }
return colsum;
  }

  public static boolean isRowMagic(int[][] matrix){
  //takes a 2d array and returns true when each row has the same sum, otherwise false
boolean equalsum = true;
      for (int i = 0 ; i < matrix.length;i++){
        if (sum(matrix[0]) == sum(matrix[i])){
          equalsum = true;
        }
        else {
          equalsum = false;
        break ;
      }
    }
    return equalsum;

  }

  public static boolean isColMagic(int[][] matrix){
//takes 2d array and returns true when each column hsa the same sum
    boolean equalsum = true;
      int[] colsums = sumCols(matrix);

      for (int i = 0; i < colsums.length; i++){
        if (colsums[0] == colsums[i]){
          equalsum = true;
        }
        else{
          equalsum = false;
          break;
        }
      }
      return equalsum;

  }

    public static boolean isLocationMagic(int[][] matrix, int row, int col){
  //takes a 2d array and returns true when the row and column specified have the same sumCols

      int[] rowsums = sumRows(matrix);
      int[] colsums = sumCols(matrix);

      return rowsums[row] == colsums[col];




    }

}
