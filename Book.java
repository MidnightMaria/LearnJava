public class Book {
    String title, author;

    public Book(String title, String author){
        this.title = title;
        this.author = author;
    }

    public Book(String title){
        this.title = title;
        this.author = "Unknown";
    }

    public void showBookInfo() {
        System.out.println("title: " + this.title);
        System.out.println("author: " + this.author);
    }
}
