public class CtoFTester {
  public static void main(String[] args) {
    System.out.println(celsiusToFahrenheit(0));
    System.out.println(fahrenheitToCelsius(32));
  }
  public static double celsiusToFahrenheit(double c) {
    return (c * 9 / 5 + 32);
  }
  public static double fahrenheitToCelsius(double f) {
    return ((f - 32) * 5 / 9);
  }
}
