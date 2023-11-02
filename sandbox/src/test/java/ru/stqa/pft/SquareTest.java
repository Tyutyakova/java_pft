package ru.stqa.pft;
import org.junit.jupiter.api.Test;
import org.testng.Assert;


public class SquareTest {

  @Test
  public void TestArea () {
    Square s = new Square(5);
    Assert.assertEquals(s.area(), 24);;

  }
}
