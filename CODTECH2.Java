import java.util.Random;

public class CODTECH2 {
    public static void main(String[] args) {
        String[] subjects = {"The cat", "A student", "My friend", "The teacher", "An AI system"};
        String[] verbs = {"writes", "creates", "explains", "studies", "teaches"};
        String[] objects = {"a story", "a project", "an idea", "a lesson", "a program"};
        String[] adverbs = {"quickly", "slowly", "happily", "seriously", "creatively"};

        Random rand = new Random();

        for (int i = 0; i < 5; i++) {
            String subject = subjects[rand.nextInt(subjects.length)];
            String verb = verbs[rand.nextInt(verbs.length)];
            String object = objects[rand.nextInt(objects.length)];
            String adverb = adverbs[rand.nextInt(adverbs.length)];

            System.out.println(subject + " " + verb + " " + object + " " + adverb + ".");
        }
    }
}
