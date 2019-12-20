import java.util.Scanner;

public class ProblemA4 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double[] myList = new double[5];
    int i = 0;

    while (!sc.hasNext("exit")) {
      try {
        Scanner lineSc = new Scanner(sc.nextLine());
        while (lineSc.hasNextDouble()) {
          myList[i] = sc.nextDouble();
          i++;
        }
        if (myList.length != 5) {
          double x1 = myList[0];
          double y1 = myList[1];
          double x2 = myList[2];
          double y2 = myList[3];
          double p = myList[4];
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
      } catch (Exception e) {
        System.out.println("Exception occured");
      }
    }
  }

  public static String uptoDecimalPlaces(double value, int places) {
    double scale = Math.pow(10, places);
    double finalResult = Math.round(value * scale) / scale;
    String str = String.format("%.10f", finalResult);
    return str;
  }

}
