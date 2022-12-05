import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.List;
import java.util.Scanner;

public class Main {
    public Main() throws FileNotFoundException {
        FileInputStream input = new FileInputStream("C:/Users/dasha/IdeaProjectsLab15/src/serialized.dat");
        Scanner sc = new Scanner(input);
        Book currentBook = new Book();
        String author = sc.nextLine();
        String title = sc.nextLine();
        String issueYear = sc.nextLine();
        Integer pageNumber = sc.nextInt();


    }
}
class Book implements Serializable {
    private String author;
    public void Author(String author){
        this.author = author;
    }
    String title;
    public void Title(String title){
        this.title = title;
    }
    String issueYear;
    public void IssueYear(String issueYear){
        this.issueYear = issueYear;
    }
    Integer pageNumber;
    public void PageNumber(Integer pageNumber){
        this.pageNumber = pageNumber;
    }
    Integer bookmark;
    private static final long serialVersionUID = 1L;
}
class ReadingLibrary{
    public void addMyReadBooks(List<Book> books, String serializedFilePath){

    }
    public List<Book> getMyRealizedBooks(String serializedFilePath){
        List<Book> books = null;
    }
    public void displayMyBooks(List<Book> books){

    }
}
