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
public class Card{
    private String title;
    private String author;
    private String subject;

    public Card(final String title, final String author, final String subject) {
        this.title = title;
        this.author = author;
        this.subject = subject;
    }
    public String getTitle(String name){
        return title;
    }  
    public String getAuthor(String name){
        return author;
    }

    public String getSubject(String name){
        return subject;
    }

    // public void setName(final String newName){
    //     this.name = newName;
    // }

    // public void setEmail(final String newEmail){
    //     this.email = newEmail;
    // }

    // public void setPhoneNumber(final String newPhoneNumber){
    //     this.phoneNumber = newPhoneNumber;
    // }

    public String toString(){
        return ("{ Title = " + title + ", Author = " + author + ", Subject = " + subject+ " }");
    }
}