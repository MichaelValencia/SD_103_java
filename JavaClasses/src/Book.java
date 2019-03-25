public class Book {
    private String title;
    private String author;
    private String genre;
    private int pages;
    private boolean avaiableHardCover;

    public String getTitle() {
        return title;
    }


    public String getGenre() {
        return genre;
    }

    public int getPages() {
        return pages;
    }

    public String getAuthor() {
        return author;
    }


    public boolean isAvaiableHardCover() {
        return avaiableHardCover;
    }

    public void setAvaiableHardCover(boolean avaiableHardCover) {
        this.avaiableHardCover = avaiableHardCover;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", genre='" + genre + '\'' +
                ", pages=" + pages +
                ", avaiableHardCover=" + avaiableHardCover +
                '}';
    }

    public Book(String title, String author, String genre, int pages, boolean avaiableHardCover) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.pages = pages;
        this.avaiableHardCover = avaiableHardCover;
    }
}
