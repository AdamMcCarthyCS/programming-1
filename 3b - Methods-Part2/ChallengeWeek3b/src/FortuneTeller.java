/**
 * This class contains methods for predicting the users fortune and provides extra functionality
 * beyond the lab 3a version
 *
 * @author Adam McCarthy
 * @version 2.0
 */
public class FortuneTeller {

    public void sayRandomFortune() {
        System.out.println("Beware the spoon that stirs without soup;");
        System.out.println("Your next great idea hides in the dishwasher.");
    }

    public void personalFortune(String name) {
        System.out.println("You're doing amazing " + name + ", even your socks are proud of you!");
    }

    public String futurePrediction(int age) {
        return "Dont worry that you're " + age + " now. By the time you're " + (age + 10) +
                ", anti-aging cream will have finally been perfected!";

    }

    public String futurePrediction(String starSign) {
        String message;

        if (starSign.equalsIgnoreCase("aries")) {
            message = "You will receive a golden ram!";
        } else if (starSign.equalsIgnoreCase("taurus")) {
            message = "A lone bull will  bring you good luck!";
        } else if (starSign.equalsIgnoreCase("gemini")) {
            message = "Twin fortunes await you!";
        } else if (starSign.equalsIgnoreCase("cancer")) {
            message = "Your fate crawls by the seashore!";
        } else if (starSign.equalsIgnoreCase("leo")) {
            message = "You will be king of men and animals!";
        } else if (starSign.equalsIgnoreCase("virgo")) {
            message = "A maiden will bring you good luck!";
        } else if (starSign.equalsIgnoreCase("libra")) {
            message = "Your effort and rewards will weigh equally!";
        } else if (starSign.equalsIgnoreCase("scorpio")) {
            message = "You will be rewarded for crossing the sands!";
        } else if (starSign.equalsIgnoreCase("sagittarius")) {
            message = "You will be struck by fates arrow!";
        } else if (starSign.equalsIgnoreCase("capricorn")) {
            message = "You will be the GOAT in your chosen adventure!";
        } else if (starSign.equalsIgnoreCase("aquarius")) {
            message = "You will receive good fortune when the rain falls around you!";
        } else if (starSign.equalsIgnoreCase("pisces")){
            message = "Your best ideas will come when you step in the waters!";
        } else {
            message = starSign + " is not a valid star sign!";
        }

        return message;
    }
}