import java.math.BigDecimal;

public class BuyFruit {
    private static BigDecimal buyApple(Integer num){
        return new BigDecimal(8).multiply(new BigDecimal(num));
    }
    private static BigDecimal buyStrawberry(Integer num){
        return new BigDecimal(13).multiply(new BigDecimal(num));
    }
    private static BigDecimal buyMango(Integer num){
        return new BigDecimal(20).multiply(new BigDecimal(num));
    }
    private static BigDecimal disCount(BigDecimal money){
        return money.multiply(new BigDecimal("0.8"));
    }
    private static BigDecimal superDisCount(BigDecimal money){
        return money.subtract(new BigDecimal(10));
    }

    public static void main(String[] args) {
        // question1
        BigDecimal total1 = buyApple(10).add(buyStrawberry(10));
        System.out.println(total1);

        // question2
        BigDecimal total2 = buyApple(10).add(buyStrawberry(10)).add(buyMango(10));
        System.out.println(total2);

        // question3
        BigDecimal total3 = disCount(buyApple(10).add(buyStrawberry(10)).add(buyMango(10)));
        System.out.println(total3);

        // question4
        BigDecimal total4 = superDisCount(buyApple(10).add(buyStrawberry(10)).add(buyMango(10)));
        System.out.println(total4);
    }
}
