public class Book {

    private String author;
    private String title;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    static Book of(String author, String title) {
        return new Book(author, title);
    }

    public static void main(String[] args) {
        displayAuthorAndTitle();

    }
        public static void displayAuthorAndTitle() {
            Book book = Book.of("Isaac Assimov", "The Galaxy");
            System.out.println(Book.of("Isaac Assimov", "The Galaxy"));
        }
    }

