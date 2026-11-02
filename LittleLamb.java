public class LittleLamb
{
   public static void main(String[] args)
   {
    System.out.print("Mary had a ");
    littleLamb("a", ",");
    littleLamb("b", ",");
    littleLamb("c", ".");
   }
   public static void littleLamb(String petName, String punctuation)
   {
   System.out.print(petName + punctuation);
   }
}