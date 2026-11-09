public class FindMinimum {

   public static int findMin() {
      int placeholderNum = 101;
      int num = 100;
      for (int i = 0; i < 10; i++){
         placeholderNum = (int) (Math.random() * 100);
         if (placeholderNum < num){
            num = placeholderNum;
         }
      }
      System.out.println(num);
      return num;
   }
   public static void main(String[] args)
   {
   findMin();
   }
}