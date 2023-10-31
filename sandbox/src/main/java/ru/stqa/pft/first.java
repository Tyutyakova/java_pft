package ru.stqa.pft;

public class first {
public static void main (String[] args) {
   hello("Anna");
   square(4);
  System.out.println ("Gkjoflm " + area(3));
  double a = 4;
  double b = 5;
  System.out.println ("Gkjoflm2 " + area(a, b));
}
public static void hello (String userName) {
    System.out.println ("Hello, " + userName + "!!!!!");
}
public static void square (double len) {
  double s = len * len;
  System.out.println ("Площадь " + s );
}
public static  double area (double len) {
  return len * len;
}
public static double area (double a, double b ){
  return a * b;

}

}