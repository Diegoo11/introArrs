class Arreglos4 {
  public static void main(String[] args) {
    int array [] = {21, 14, 56, 83, 1};
    int temp = 0;
    for(int i = 0; i <array.length; i += 1) {
      temp += array[i];
    }
    int result = temp/array.length;
    System.out.println(result);
  }
}
