public class PriceConversion {
    public static void main(String[] args) {
        int priceInCents = 550;

        // convert to euros
        double priceInEurosAndCents = priceInCents / 100.0d;

        // output conversion
        System.out.println("Price in euro: €" + priceInEurosAndCents);
    }
}
