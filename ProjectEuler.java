public class ProjectEuler {
   
   public static int problem1(int maxValue) {
      int multipleNum = 1;
      int threeMultiple;
      int fiveMultiple;
      int threeMultiplesTotal = 0;
      int fiveMultiplesTotal = 0;
      while (3 * multipleNum < maxValue){
         threeMultiple = 3 * multipleNum;
         if (threeMultiple % 5 == 0) {
            threeMultiple = 0;
         }
         threeMultiplesTotal = threeMultiplesTotal + threeMultiple;
         multipleNum++;
         
      }
      multipleNum = 1;
      while (5 * multipleNum < 1000){
         fiveMultiple = 5 * multipleNum;
         fiveMultiplesTotal = fiveMultiplesTotal + fiveMultiple;
         multipleNum++;
      }
      return (threeMultiplesTotal + fiveMultiplesTotal);
   }
   
   public static int problem2() {
      int valueOne = 1;
      int valueTwo = 2;
      int placeholerValue;
      int sumEven = 0;
      while (valueTwo < (4000000)){
         placeholerValue = valueOne + valueTwo;
         valueOne = valueTwo;
         valueTwo = placeholerValue;
         System.out.print(valueTwo + " ");
         if (valueOne % 2 == 0){
            sumEven = sumEven + valueOne;
         }
         if (valueTwo % 2 == 0){
            sumEven = sumEven + valueTwo;
         }
      }
      
      
      
      
      return sumEven;
   }
   
   public static void main(String[] args) {
      System.out.println("The answer to problem 1 is: " + problem1(1000));
      System.out.println("The answer to problem 2 is: " + problem2());      
   }  
}