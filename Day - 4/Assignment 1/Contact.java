/**
 * This class discusses about the Contact Object. The attributes of the contact object
 * are as follows.
 * name : Name of the person / friend.
 * email : mail id of the person / friend.
 * phoneNumber : Phone Number of the person / friend.
 * 
 * @author Siva Sankar
 */

//  Your code goes here... For Contact class
public class Contact{
    private String name;
    private String email;
    private String phoneNumber;

    public Contact(final String name, final String email,
    final String phoneNumber){
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public void setName(final String newName){
        this.name = newName;
    }

    public void setEmail(final String newEmail){
        this.email = newEmail;
    }

    public void setPhoneNumber(final String newPhoneNumber){
        this.phoneNumber = newPhoneNumber;
    }

    public String toString(){
        return ("{ Name = " +name+ ", Email = " +email+ ", Phone Number = " +phoneNumber+ " }");
    }
}