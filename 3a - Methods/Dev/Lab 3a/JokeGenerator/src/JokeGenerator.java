public class JokeGenerator {
    public void tellJoke() {
        System.out.println("A horse walks into a bar.");
        System.out.println("Bartender: Why the long face?");
    }

    public void tellStory(String name) {
        System.out.println("Once upon a time " + name + " dreamt of being a programmer.");
        System.out.println("After breaking many older machines they found the secret in Spain.");
        System.out.println("Some say they now live in the mountains and have mastered Si++");
    }

    public String ageInTenYears(int age) {
        int futureAge = age + 10;
         return "In 10 years you'll be " + futureAge + " years old - Answering to our" +
                 " AI overlords.";
    }
}
