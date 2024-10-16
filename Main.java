public class Main {

   public static void main(String []args) {
      System.out.println("Hello World");

      int age = 15;
      int year = 14; 

      boolean match = (age == year);

      System.out.println(match);

      year = 15;
      System.out.println( age == year);

      System.out.println( age != year);

      double pi = 3.141592653859;
      System.out.println(pi > 0); 
      System.out.println(pi < 0);
      System.out.println(pi >= 3.14);
      System.out.println(pi <= 10.00);
      

      // if statements

      boolean isCold = false;

      if (isCold == true) {
         System.out.println("Bring a jacket!");
      }

      if (isCold == false) {
         System.out.println("Enjoy the weather");
      }

      // magic eight ball
      int rando = (int) (Math.random() * 8) + 1;

      if (rando == 1) {
         System.out.println( "No chance.");
      }
      if (rando == 2) {
         System.out.println( "Meh.");
      }
      if (rando == 3) {
         System.out.println( "Nah.");
      }
      if (rando == 4) {
         System.out.println( "Most definitely.");
      }
      if (rando == 5) {
         System.out.println( "Sources say yes.");
      }
      if (rando == 6) {
         System.out.println( "Perchance.");
      }
      if (rando == 7) {
         System.out.println( "Absolutely!");
      }
      if (rando == 8) {
         System.out.println( "Absolutely no chance.");
      }


   }
}
