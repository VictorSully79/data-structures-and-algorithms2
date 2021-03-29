package challenges.arrayReverse;

public class ArrayReverse {
  public static void main (String[] args) {
    
    int[] numbers = {2, 4, 6, 8};
    int[] newNumbers;
    newNumbers = new int[4];
    for (int i =0; i < numbers.length; i++) {
      int newArray = numbers.length-i-1;
        System.out.println(newArray);

        newNumbers[newArray] = numbers[i];
    
    }
    for(int i = 0; i < newNumbers.length; i++) {
      System.out.println(newNumbers[i]);
    }
  }  
}
