import java.util.*;

public class BookStorage {
    private static final Map<String, String> books = new HashMap<>();
    private static final Map<String, String> summaries = new HashMap<>();

    public static void saveBook(String title, String content) {
        books.put(title, content);
    }

    public static String getBookContent(String title) {
        return books.get(title);
    }

    public static void saveSummary(String title, String summary) {
        summaries.put(title, summary);
    }

    public static void viewSummaries() {
        if (summaries.isEmpty()) {
            System.out.println("No summaries available yet!");
        } else {
            for (Map.Entry<String, String> entry : summaries.entrySet()) {
                System.out.println("📖 " + entry.getKey() + " Summary:\n" + entry.getValue());
                System.out.println("--------------------------------");
            }
        }
    }
}
