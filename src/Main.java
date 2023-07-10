class LibraryItem{
    private int id;
    String title;
    int year;
    public  String libraryData(){
        return ("ID:"+getId()+"\nTitle:"+title+"\nYear:"+year);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
class Book extends LibraryItem{
    private String author;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void BookData() {
        System.out.println(libraryData()+ "\nAuthor:" + getAuthor());
    }
    }
class Magazine extends LibraryItem{
    int issue;
    public void magazineData(){
        System.out.println(libraryData()+"\nIssue:"+issue);
    }
}
public class Main {
    public static void main(String[] args) {

        Magazine magazine = new Magazine();
        magazine.setId(001);
        magazine.title = "Times of INDIA";
        magazine.year = 1999;
        magazine.issue = 150;
        magazine.magazineData();

        Book book = new Book();
        book.setId(002);
        book.title = "java";
        book.year = 1995;
        book.setAuthor("James Gosling ");
        book.BookData();
    }
}