import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearBookPublication == book.yearBookPublication && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, yearBookPublication);
    }

    @Override
    public String toString() {
        return '\"' + title + '\"' + ", " + author + ", год издания: " + yearBookPublication;
    }
}
