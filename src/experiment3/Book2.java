package experiment3;

public class Book2 {
    private final String bookName;
    private final int[] ratings;

    public Book2(String bookName) {
        this.bookName = bookName;
        ratings = new int[5];
    }

    public String getBookName() {
        return bookName;
    }

    public void addRating(int score) {
        if (score < 1 || score >= 6) {
            return;
        }
        ratings[score - 1] += 1;
    }

    public double getAverage() {
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += ratings[i] * (i + 1.0);
        }
        return sum / (ratings[0]+ratings[1]+ratings[2]+ratings[3]+ratings[4]);
    }
}
