package ru.stqa.pft;

public class Area {
  public static  double area (Square as) {
    return as.l * as.l;
  }
  public static int getFactorial(int f) {
    int result = 1;
    for (int i = 1; i <= f; i++) {
      result = result * i;
    }
    return result;
  }
}
