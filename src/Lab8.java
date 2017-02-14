import java.text.NumberFormat;
import java.util.Scanner;

  /**
  * Created by Norman Wilson on 2/10/17.
  */
  public class Lab8 {

      public static void main(String[] args) {
              Scanner scan = new Scanner(System.in);
             Scanner input = new Scanner(System.in);


                 // int [] answers = new int[5];-


                System.out.println("Welcome to the Batting Average Calculator! ");


                System.out.println();


                do {
                         //Ask user to enter number of bats
                        System.out.println("Enter number of times at bat: ");

                       //get user input - number of at bats
                    int atBats = scan.nextInt();
                        System.out.println();


                    //ask user for the number of bases earned
                        System.out.println("Enter number of bases earned? ");
                        double[] atBatsArray = new double[atBats];


                         //int sum = 0;
                        //get user input - number of bases earned
                       for (int i = 0; i < atBats; i++) {

                                atBatsArray[i] = scan.nextInt();
                                //sum += atBatsArray[i];


                             }


                        //Silence the sum after you figure out the calculation


                        //Format percentages such that three decimal places are shown
                        NumberFormat numberFormat = NumberFormat.getNumberInstance();
                       numberFormat.setMinimumFractionDigits(3);


                         System.out.println();
                         //stub out: implement method and insert code
                    //Display batting average - create a method - to create a variable you need datatype - calculate avg
                        double batAvg = calculateBatAverage(atBatsArray);          //Calling the method
                        System.out.println("Batting average is: " + numberFormat.format(batAvg));


                        //Display slugging percentage
                         double slugPercent = calculateSlugPercent(atBatsArray);
                        System.out.println("Slugging Percentage is: " + numberFormat.format(slugPercent));
                         System.out.println();


                        System.out.println("Another batter? (y/n): ");
                     } while (input.next().equalsIgnoreCase("Y"));
                 input.close();
             }


             /*
       This method calculates the slug percent
         */
            public static double calculateSlugPercent(double[] atBatsArray) {

                 double sum = 0;
                for (int i = 0; i < atBatsArray.length; i++) {
                        sum = sum += atBatsArray[i];
                    }
                double answer = sum / atBatsArray.length;
                return answer;


             }


            /*
           This method calculates batting avg
           */
             public static double calculateBatAverage(double[] atBatsArray) {


                double sum = 0;
               for (int i = 0; i < atBatsArray.length; i++) {
            sum = sum += atBatsArray[i];
        }
        double answer = sum / atBatsArray.length;
        return answer * (.5);

    }
}















