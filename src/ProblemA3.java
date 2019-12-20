import java.util.Scanner;

public class ProblemA3 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int coordinateMin = 0;
    int coordinateMax = 100;
    double pNormMin = 0.1;
    double pNormMax = 10;
    boolean valid = true;
    double x1 = 0.0;
    double y1 = 0.0;
    double x2 = 0.0;
    double y2 = 0.0;
    double p = 0.0;
    if (sc.hasNextDouble()) {
      x1 = sc.nextDouble();
      if (x1 < coordinateMin || x1 > coordinateMax) {
        valid = false;
      }
    }
    if (sc.hasNext() && sc.hasNextDouble()) {
      y1 = sc.nextDouble();
      if (y1 < coordinateMin || y1 > coordinateMax) {
        valid = false;
      }
    } else {
      System.out.println("Enter valid values");
    }
    if (sc.hasNext() && sc.hasNextDouble()) {
      x2 = sc.nextDouble();
      if (x2 < coordinateMin || x2 > coordinateMax) {
        valid = false;
      }
    } else {
      System.out.println("Enter valid values");
    }
    if (sc.hasNext() && sc.hasNextDouble()) {
      y2 = sc.nextDouble();
      if (y2 < coordinateMin || y2 > coordinateMax) {
        valid = false;
      } else {
        System.out.println("Enter valid values");
      }

      if (sc.hasNext() && sc.hasNextDouble()) {
        p = sc.nextDouble();
        if (p < pNormMin || p > pNormMax) {
          valid = false;
        } else {
          System.out.println("Enter valid values");
        }
      }
      double powX = Math.pow((x2 - x1), p);
      double powY = Math.pow(y2 - y1, p);

      /*System.out.println("Value x1,y1 "+x1+","+y1);
      System.out.println("Value x2,y2 "+x2+","+y2);
      System.out.println("Value p "+p);
      System.out.println("Value powX "+powX);
      System.out.println("Value powY "+powY);
      System.out.println("Value Total "+total);*/

      Double result = Math.pow((powX + powY), (1 / p));
      System.out.println(uptoDecimalPlaces(result, 10));
    }
  }

  public static String uptoDecimalPlaces(double value, int places) {
    double scale = Math.pow(10, places);
    double finalResult = Math.round(value * scale) / scale;
    String str = String.format("%.10f", finalResult);
    return str;
  }

}
