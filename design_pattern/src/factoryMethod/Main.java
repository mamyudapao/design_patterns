package factoryMethod;

public class Main {
  public static void main(String[] args) {
    Factory factory = new IDCardFactory();
    Product card1 = factory.create("ケンイチ");
    Product card2 = factory.create("ミク");
    Product card3 = factory.create("ルカ");
    card1.use();
    card2.use();
    card3.use();
  }
}