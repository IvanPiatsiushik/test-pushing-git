public class Sort {

  public static void main(String[] args) {

    int[] array = { 12, 3, 5, 2, 19 };
    System.out.println("before");
    printArray(array);

    for (int i = 1; i < array.length; i++) {

      int currentValue = array[i];
      int index = i - 1;

      while (index >= 0 && array[index] > currentValue) {
        array[index + 1] = array[index];
        index--;
      }
      array[index + 1] = currentValue;

    }
    System.out.println("after");
    printArray(array);
  }

  public static void printArray(int[] arr) {
    for (int el : arr) {
      System.out.println(el);
    }
  }
}
