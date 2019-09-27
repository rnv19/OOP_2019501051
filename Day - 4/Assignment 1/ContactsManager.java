/**
 * This class maintains the contacts of your friends / relations / wellwishers
 * 
 * et.
 * 
 * The following are the opertaions that this ContactManager application can
 * perform.
 *  an create a contact of your choice
 *  Creates a contact and k the ContactManager list. You can sea ct based on 
 * he name in the ContactManager list. You can search fo contact by email. Se
 * rch for a contact  You can delete a contact by name. Search for a contact b
 * sed o the contact and delete from the C 
 *  or Siva Sankar
 */

class ContactsManager {

    /**
     * Define a variable myFriends which is an array that can hold 
     * the contacts of your friends.
     */
    Contact[] myFriends;
    /**
     * Define a variable friendsCount of type int maintain the number of 
     * contacts of your friends.
     */
    int friendsCount;

    /**
     * When the object of ContactManager is created, the constructor should 
     * constrcut the object initialy with the following requirements.
     * 
     * 1. Initializes the friendsCount to 0 as there no contacts in the list.
     * 2. myFriends with array initial size of 500
     */
    public ContactsManager(){
        int x = 500;
        this.friendsCount = 0;
        this.myFriends = new Contact[x]; 
    }

    /**
     * The addContact method takes in a parameter of type contact object and 
     * adds this to the contact list.
     * @param contact, to be added.
     */
    public void addContact(Contact contact) {
        //  Your code goes here....
        myFriends[friendsCount++] = contact;

        //  Nothing to be returned... As this method is void...
    }
 
    /**
     * This method search for the contact based on the name of your friend and gives the
     * first occurance of the contact in your friends list.
     * @param searchName, the name of the contact to be searched in the friends list.
     * @return the contact of the friend, null otherwise.
     */
    public Contact searchContact(String searchName) {
        //  Your code goes here....
        for (int i=0; i< friendsCount; i++){
            if (myFriends[i].getName().equals(searchName)){
                return myFriends[i];
            }
        }
        return null;
    }
    /**
     * This method search for the contact based on the email of your friend 
     * and gives the first occurance of the contact in your friends list.
     * @param searchName, the email of the contact to be searched in the friends list.
     * @return the contact of the friend, null otherwise.
     */
    public Contact searchContactByEmail(String email) {
        //  Your code goes here....
        for (int i=0; i< friendsCount; i++){
            if (myFriends[i].getEmail().equals(email)){
                return myFriends[i];
            }
        }
        return null;
    }

    /**
     * This method deletes the contact based on the name of your friend and returns
     * true on success and false if failure in deleting the contact.
     * 
     * @param searchName, the name of the contact to be searched in the friends list.
     * @return true if contact has been removed successfully and false otherwise.
     */
    public boolean deleteContact(String searchName) {
        //  Your code goes here....
        for (int i=0; i < friendsCount; i++){
            if (myFriends[i].getName().equals(searchName)){
                for (int j = i; j < friendsCount-1; j++){
                    myFriends[j] = myFriends[j+1];
                }
                friendsCount--;
                myFriends[friendsCount] = null;
                return true;
            }
        }
        return false;
    }

    // Any additional method that you want to implement by yourself.

    //  Happy Coding... Have Fun.....
}