package ru.stqa.pft;

public class first {
public static void main (String[] args) {
   hello("Anna");
   square(4);

   Square as = new Square(3);
   Rectangle re = new Rectangle(4, 5);
  System.out.println ("Rectangle " + re.area());
  System.out.println ("Gkjoflm " + as.area() );
 }
public static void hello (String userName) {
    System.out.println ("Hello, " + userName + "!!!!!");
}
public static void square (double len) {
  double s = len * len;
  System.out.println ("Площадь " + s );
}

}