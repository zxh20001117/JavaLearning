package experiment3;

public class Book {
    private final String bookName;
    private int numRated5;
    private int numRated4;
    private int numRated3;
    private int numRated2;
    private int numRated1;

    public Book(String bookName) {
        this.bookName = bookName;
    }

    public String getBookName() {
        return bookName;
    }

    public void addRating(int score) {
        if (score < 1 || score >= 6) {
            return;
        }
        switch (score) {
            case 1:
                numRated1 += 1;
                break;
            case 2:
                numRated2 += 1;
                break;
            case 3:
                numRated3 += 1;
                break;
            case 4:
                numRated4 += 1;
                break;
            case 5:
                numRated5 += 1;
                break;
        }
    }

    public double getAverage() {
        return (numRated5 * 5.0 + numRated4 * 4.0 + numRated3 * 3.0 + numRated2 * 2.0 + numRated1 * 1.0) /
                (numRated5+numRated4+numRated3+numRated2+numRated1);
    }
}
