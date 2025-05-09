public class Main {
    public static void main(String[] args) {
        Author author = new Author("Александр", "Блок");
        Author author1 = new Author("Владимир", "Маяковский");
        Book book = new Book("Седое утро", author, 1920);
        Book book1 = new Book("Про это", author1, 1923);

        book1.setYearBookPublication(1924);
    }
}