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

}
