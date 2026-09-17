import java.util.Scanner;

public class PetNames
{
   public static void main( String[] args)
   {
      //variables
      boolean havePets;
      int numPets;
      String petOneName = "placeholder";
      String petTwoName = "placeholder";
      String petThreeName = "placeholder";
      double petFoodYearlyCost;
      
      //has pets?
      System.out.println("Do you have pets? (type ture or false)");
      Scanner scan0 = new Scanner(System.in);
      havePets = scan0.nextBoolean();
      if (havePets == false)
      {
         System.exit(1);
      }
      //Number of pets
      System.out.println("How many pets do you have? (3 max)");
      Scanner scan1 = new Scanner(System.in);
      numPets = scan1.nextInt();
      
      
      //Pet names
      //pet 1
      if (numPets >=1)
      {
         System.out.println("What is your first pet's name");
         Scanner scan3 = new Scanner(System.in);
         petOneName = scan3.nextLine();
      }
      //pet 2
      if (numPets >= 2)
      {
         System.out.println("What is your second pet's name");
         Scanner scan4 = new Scanner(System.in);
         petTwoName = scan4.nextLine();
      }
      //pet 3
      if (numPets >= 3)
      {
         System.out.println("What is your third pet's name");
         Scanner scan5 = new Scanner(System.in);
         petThreeName = scan5.nextLine();
      }
      //Pet food cost
      System.out.println("How much do you spend per year on pet food?");
      Scanner scan6 = new Scanner(System.in);
      petFoodYearlyCost = scan6.nextDouble();
      
      //Outputs
      System.out.println("Has pets: " + havePets);
      System.out.println("Number of pets: " + numPets);
      if (numPets >= 1)
      {
         System.out.println("First pet name: " + petOneName);
      }
      if (numPets >=2)
      {
         System.out.println("Second pet name: " + petTwoName);
      }
      if (numPets >=3)
      {
         System.out.println("Third pet name: " + petThreeName);
      }
      System.out.println("Pet food cost per year: " + petFoodYearlyCost);
      System.out.println("Average cost per pet: " + petFoodYearlyCost / numPets);

   }
}