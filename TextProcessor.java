public class TextProcessor {
    public static String summarizeText(String text) {
        String[] sentences = text.split("\\. ");
        if (sentences.length <= 3) {
            return text; // If text is already short, return as is
        }
        StringBuilder summary = new StringBuilder();
        for (int i = 0; i < Math.min(3, sentences.length); i++) {
            summary.append(sentences[i]).append(". ");
        }
        return summary.toString().trim();
    }
}
