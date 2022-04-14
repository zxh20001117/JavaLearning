package experiment3;

public class BookReview {
    public static void main(String[] args) {
        Book2 book = new Book2("Java in Two Semesters");
        for (int i = 0; i < 20; i++) {
            book.addRating((int) (Math.random() * 5) + 1);
        }
        System.out.println(book.getBookName() + " , " + book.getAverage());
    }
}
