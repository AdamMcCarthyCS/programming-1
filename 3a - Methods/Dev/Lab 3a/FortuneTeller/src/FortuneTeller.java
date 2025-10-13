public class FortuneTeller {

    public void sayRandomFortune() {
        System.out.println("Beware the spoon that stirs without soup;");
        System.out.println(" Your next great idea hides in the dishwasher.");
    }

    public void personalFortune(String name) {
        System.out.println("You're doing amazing " + name + " even your socks are proud of you!");
    }

    public String futurePrediction(int age) {
        return "Dont worry that you're " + age + " now. By the time you're " + (age + 10) +
                " anti-aging will have finally been perfected!";

    }
}
