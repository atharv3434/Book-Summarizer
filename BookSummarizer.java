import java.util.Scanner;

public class BookSummarizer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("📚 AI-Powered Book Summarizer 📖");

        while (true) {
            System.out.println("\n1. Add a Book");
            System.out.println("2. Summarize a Book");
            System.out.println("3. View All Summaries");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("\nEnter Book Title: ");
                    String title = sc.nextLine();
                    System.out.println("Enter Book Content (Paste or Type): ");
                    String content = sc.nextLine();
                    BookStorage.saveBook(title, content);
                    System.out.println("✅ Book added successfully!");
                    break;

                case 2:
                    System.out.print("\nEnter Book Title to Summarize: ");
                    String bookTitle = sc.nextLine();
                    String bookContent = BookStorage.getBookContent(bookTitle);
                    if (bookContent == null) {
                        System.out.println("❌ Book not found!");
                    } else {
                        String summary = TextProcessor.summarizeText(bookContent);
                        BookStorage.saveSummary(bookTitle, summary);
                        System.out.println("\n📖 Summary:\n" + summary);
                    }
                    break;

                case 3:
                    System.out.println("\n📜 All Summaries:");
                    BookStorage.viewSummaries();
                    break;

                case 4:
                    System.out.println("Exiting... Keep reading! 📚");
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice, try again!");
            }
        }
    }
}
