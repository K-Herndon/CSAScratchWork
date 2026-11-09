public class NestedIteration {
   public static void main (String[] args){
   String myString = "ballard high";
      for (int i = 0; i<= 5; i++) {
         for (int j = 0; j<4; j++){
            if (j==3){
            System.out.println("("+i + ", " + j +")");
            }else {
            System.out.print("("+i + ", " + j+") ");
            }
         }
      }
   }
}