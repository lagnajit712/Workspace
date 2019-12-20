import java.util.Scanner;
import java.util.*;


public class ProblemA {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    while (sc.hasNextDouble()) {
      try {
          double x1 = sc.nextDouble();
          double y1 = sc.nextDouble();
          double x2 = sc.nextDouble();
          double y2 = sc.nextDouble();
          double p = sc.nextDouble();
          if (x1 < 0 || y1 < 0 || x2 < 0 || y2 < 0 || x1 > 100 || y1 > 100 || x2 > 100 || y2 > 100) {
            System.out.println("Invalid values provided!! Coordinates should be from 0 to 100");
          } else if (p < 0 || p > 10) {
            System.out.println("Invalid values provided!! p- norm ranges from 0.1 to 10");
          } else {

            //|x1−x2|
            double x = x2 - x1;
            double y = y2 - y1;
            double powX = Math.pow(x, p);
            double powY = Math.pow(y, p);
            double total = powX + powY;
      /*System.out.println("Value x1,y1 "+x1+","+y1);
      System.out.println("Value x2,y2 "+x2+","+y2);
      System.out.println("Value p "+p);
      System.out.println("Value powX "+powX);
      System.out.println("Value powY "+powY);
      System.out.println("Value Total "+total);*/

            Double result = Math.pow(total, (1 / p));
            System.out.println(uptoDecimalPlaces(result, 10));
          }
      }catch(Exception e) {
        return;
      }
    }
  }
  public static String uptoDecimalPlaces(double value, int places) {
    double scale = Math.pow(10, places);
    double finalResult=Math.round(value * scale) / scale;
    String str = String.format("%.10f", finalResult);
    return str;
  }

}
