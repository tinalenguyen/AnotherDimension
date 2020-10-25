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

      large = Math.max(arr[i], arr[i+1]);

    }

    return large;
  }




}
