public class Book {
    private String title;
    private Author author;
    private int yearBookPublication;

    public Book (String title, Author author, int yearBookPublication) {
        this.title = title;
        this.author = author;
        this.yearBookPublication = yearBookPublication;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYearBookPublication() {
        return yearBookPublication;
    }

    public void setYearBookPublication(int year) {
        this.yearBookPublication = year;
    }
}
