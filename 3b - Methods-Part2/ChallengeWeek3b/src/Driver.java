/**
 * This is the entry point to the program.
 *
 * <p>This class contains the {@code main} method.</p>
 *
 * @author Adam McCarthy
 * @version 1.0
 */
public class Driver {
    public static void main(String[] args) {

        // create a fortuneTeller object
        FortuneTeller fortune = new FortuneTeller();

        String messageOne = fortune.futurePrediction("aries");
        String messageTwo = fortune.futurePrediction("pisces");
        String messageThree = fortune.futurePrediction("orion");

        System.out.println("Message 1: " + messageOne);
        System.out.println("Message 2: " + messageTwo);
        System.out.println("Message 3: " + messageThree);
    }
}
