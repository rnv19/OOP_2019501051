import java.lang.reflect.Array;
import java.util.*;

final class CardCatalog{
    int size = 0;

    private CardCatalog() {
        this.title = new Card[10];
        this.author = new Card[10];
        this.subject = new Card[10];
    }

    public void main(String[] args){
    }
    
    public void AddACard(Card card) {
        if (size != title.length){
            title[size] = card;
            author[size] = card;
            subject[size] = card;
            size++;
        } else{
            title1 = Arrays.copyOf(title, size*2);
            title = 
            title[size] = card;
            author[size] = card;
            subject[size] = card;
            size++;
        }

    }
    
    public Card getATitle(String searchName){
        for (int i=0; i < size; i++){
            if (title.getTitle(searchName).equals(searchName)){
                return title.getTitle[i];
        }
        }
        return null;
    }

    public Card getAnAuthor(String searchName){
        for (int i=0; i < size; i++){
            if (author.getAuthor(searchName).equals(searchName)){
                return author.getAuthor[i];
        }
        }
        return null;
    }
    public Card getSubject(String searchName){
        for (int i=0; i < size; i++){
            if (subject.getSubject(searchName).equals(searchName)){
                return subject.getAuthor[i];
        }
        }
        return null;
    }
    public Card removeATitle(String searchName){
        for (int i=0; i < size; i++){
            if (title.getTitle(searchName).equals(searchName)){
                for (int j=i; j< size -1; j++){
                    title[j] = title[j+1];
                }
                title[size] = null;
                return true;
        }
        }
        return null;
        for (int i=0; i < size; i++){
            if (title.getAuthor(searchName).equals(searchName)){
                for (int j=i; j< size -1; j++){
                    title[j] = title[j+1];
                }
                title[size] = null;
                return true;
        }
        }
        return null;
        for (int i=0; i < size; i++){
            if (title.getSubject(searchName).equals(searchName)){
                for (int j=i; j< size -1; j++){
                    title[j] = title[j+1];
                }
                size--;
                title[size] = null;
                return true;
        }
        }
        return null;
    }        

}
    