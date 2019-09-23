/**
 * Problem Set 1.
 *
 * It's time to put your skills to the test. This problem set focuses on using
 * primitive data types, variables, and basic operators and functions.
 *
 * The specifications for each exercise are outlined below. Your output is
 * expected to meet requirements set forth in this section (as well as the
 * Deliverables section).
 *
 * Work through these exercises on your own. Experiment, make mistakes, ask
 * questions, and fix your mistakes. It's the only way to get good at programming.
 */

public class ProblemSet1 {

    public static void main(String[] args) {

        /*
         * Exercise 1.
         *
         * What is the area (in square millimeters) of an 8.5-by-11-inch sheet of paper?
         */
        double lengthinches = 8.5;
        double widthinches = 11;
        double intomm = 25.4;
        double finalcalc = intomm*intomm*(widthinches*lengthinches);
          System.out.printf("\n%,.2f square millimeters.\n", finalcalc);


        /*
         * Exercise 2.
         *
         * What is the perimeter (in centimeters) of an 8.5-by-11-inch sheet of paper?
         */
         double intocm = 2.54;
         double finalcalctwo = (lengthinches+widthinches)*2*intocm;
          System.out.printf("\n%,.2f centimeters.\n", finalcalctwo);


        /*
         * Exercise 3.
         *
         * What is the length of the diagonal (in inches) between two corners on an 8.5-
         * by-11-inch sheet of paper?
         */
        double lengthdiag = Math.sqrt((lengthinches*lengthinches)+(widthinches*widthinches));
          System.out.printf("\n%,.2f inches.\n", lengthdiag);


        /*
         * Exercise 4.
         *
         * Given the grading policy and the homework, quiz, and test grades I received,
         * what marking period grade will I get?
         */

    int homework1 = 88;
    int homework2 = 91;
    int homework3 = 0;
    int quiz1 = 84;
    int quiz2 = 89;
    int quiz3 = 93;
    int test1 = 74;
    int test2 = 87;
    int test3 = 82;

double homeworkconverter = 0.15;
double quizconverter = 0.35;
double testconverter = 0.50;
double homeworktotal = ((double)homework1+(double)homework2+(double)homework3)/3;
double quiztotal = ((double) quiz1+(double)quiz2+(double)quiz3)/3;
double testtotal = ((double)test1+(double)test2+(double)test3)/3;
double finalgrade = (homeworktotal*homeworkconverter)+(quiztotal*quizconverter) + (testtotal*testconverter);
        System.out.printf("\n%,.2f%%.\n", finalgrade);
        /*
         * Exercise 5.
         *
         * I make $12.50/hour working as a cashier at a local supermarket. How much money
         * will I make this week?
         */
double totalhours = 7.5+8+10.5+9.5+6+11.5;
double hourlywage = 12.5;
double finalwage = hourlywage*totalhours;
         System.out.printf("\n$%,.2f.\n", finalwage);


        /*
         * Exercise 6.
         *
         * What is my take-home pay each check?
         */

      double salary = 117000;
      double weeklypay = salary / 24;

      double fouronek = 0.07 * weeklypay;
      weeklypay = weeklypay - fouronek;

      double fedtax = 0.24 * weeklypay;
      weeklypay = weeklypay - fedtax;

      double statetax = 0.0637 * weeklypay;
      weeklypay = weeklypay - statetax;

        System.out.printf("\n$%,.2f.\n",weeklypay);

         /*
         * Exercise 7.
         *
         * I am planning a class trip next month. How many buses do I need, and how many
         * people will be on the last bus?
         */
         int students = 273;
         int teachers = 28;
         int busCap = 54;

         int totalpass = students + teachers;
         int numBuses = (int) (Math.ceil((double) totalpass / (double) busCap));
         int passesleft = totalpass % busCap;

            System.out.println("\n" + numBuses + " buses are needed, with " + passesleft + " passengers on the last bus.");

         /*
         * Exercise 8.
         *
         * What is the surface area of a standard Cornhole board?
         */
         double boardLength = 48;
         double boardWidth = 24;
         double holediam = 6;

         double boardArea = boardLength * boardWidth;
         double holeArea = Math.pow(holediam / 2, 2) * Math.PI;

            boardArea = boardArea - holeArea;

            System.out.printf("\n%,.2f square inches.\n", boardArea);

         /*
         * Exercise 9.
         *
         * Are the years 2020, 2100, and 2400 leap years?
         */
         int year1 = 2020;
         int year2 = 2100;
         int year3 = 2400;

         boolean leap2020 = (year1 % 4 == 0 && (year1 % 100 != 0 | year1 % 400 == 0));
         boolean leap2100 = (year2 % 4 == 0 && (year2 % 100 != 0 | year2 % 400 == 0));
         boolean leap2400 = (year3 % 4 == 0 && (year3 % 100 != 0 | year3 % 400 == 0));

            System.out.println("\n" + year1 + " is a leap year..." + leap2020 + ".");
              System.out.println(year2 + " is a leap year..." + leap2100 + ".");
                System.out.println(year3 + " is a leap year..." + leap2400 + ".");

         /*
         * Exercise 10.
         *
         * What is the wind chill?
         */
         double temp = 38;
         double windspeed = 14;

         double windchill = 35.74 + (0.6215 * temp) + ((0.4275 * temp) - 35.75) * (Math.pow(windspeed, 0.16));

            System.out.printf("\n%,.1f degrees.\n", windchill);
       }
       }
