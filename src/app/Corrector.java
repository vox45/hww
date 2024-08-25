package src.app;

public class Corrector {
    public String correctWords(String[] words) {
        StringBuilder correctedWords = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            String word = words[i];

            // Исправляем слова
            switch (word) {
                case "brange":
                    word = "orange";
                    break;
                case "onibn":
                    word = "onion";
                    break;
                // Можно добавить другие случаи по необходимости
            }

            correctedWords.append(i + 1).append(") ").append(word).append("\n");
        }

        return correctedWords.toString();
    }
}
