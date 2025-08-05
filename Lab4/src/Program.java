


public class Program {
   public Program() {
   }

   public static void main(String[] args) {
      int[] numbers = new int[]{1, 3, -5, 7, 0, 4, 6, 8};
      int sum = 0;
      int[] var6 = numbers;
      int min = numbers.length;

      for(int var4 = 0; var4 < min; ++var4) {
         int num = var6[var4];
         sum += num;
      }

      double average = (double)sum / (double)numbers.length;
      min = numbers[0];
      int[] var9 = numbers;
      int i = numbers.length;

      int indexOfZero;
      int max;
      for(indexOfZero = 0; indexOfZero < i; ++indexOfZero) {
         max = var9[indexOfZero];
         if (max < min) {
            min = max;
         }
      }

      max = numbers[0];
      int[] var10 = numbers;
      int var13 = numbers.length;

      for(i = 0; i < var13; ++i) {
         indexOfZero = var10[i];
         if (indexOfZero > max) {
            max = indexOfZero;
         }
      }

      indexOfZero = -1;

      for(i = 0; i < numbers.length; ++i) {
         if (numbers[i] == 0) {
            indexOfZero = i;
            break;
         }
      }

      System.out.println("Sum: " + sum);
      System.out.println("Average: " + average);
      System.out.println("Minimum: " + min);
      System.out.println("Maximum: " + max);
      System.out.println("Index of zero: " + indexOfZero);
   }
}



