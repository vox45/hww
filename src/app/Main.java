package src.app;

public class Main {
    public static void main(String[] args) {
        DataProvider provider = new DataProvider();
        Corrector corrector = new Corrector();

        String[] words = provider.getData();
        String correctedWords = corrector.correctWords(words);

        getOutput(correctedWords);
    }

    private static void getOutput(String output) {
        System.out.println(output);
    }
}
