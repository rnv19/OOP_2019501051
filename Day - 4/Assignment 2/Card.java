/**
 * This class discusses about the Card Object. The attributes of the contact object
 * are as follows.
 * title : title of the book
 * author : author of the book
 * subject : subject of the book
 * 
 * @author rnv sundeep
 */ 

//  Your code goes here... For Card class
class Card {
    String TitleOfBook;
    String AuthorOfBook;
    String SubjectOfBook;

    public Card() {
    }    
    public Card(String TitleOfBook, String AuthorOfBook, String SubjectOfBook) {
        this.TitleOfBook = TitleOfBook;
        this.AuthorOfBook = AuthorOfBook;
        this.SubjectOfBook = SubjectOfBook;
    }
    public void Set_Title(String TitleOfBook) {
        this.TitleOfBook = TitleOfBook;
    }

    public void Set_Author(String AuthorOfBook) {
        this.AuthorOfBook = AuthorOfBook;
    }

    public void Set_Subject(String SubjectOfBook) {
        this.SubjectOfBook = SubjectOfBook;
    }

    public String Get_Title() {
        return this.TitleOfBook;
    }
    public String Get_Author() {
        return this.AuthorOfBook;
    }
    public String Get_Subject() {
        return this.SubjectOfBook;
    }
    public String toString() {
        return "Book Title :" + this.TitleOfBook + " , " + "Author of Book :" + this.AuthorOfBook + " , " + "Subject of Book :" + this.SubjectOfBook;
    }
}