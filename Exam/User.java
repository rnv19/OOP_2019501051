import java.util.*;

public class User {
    public String name;
    public User[] connections;
    public int numConnections;

    public User(final String name){
        this.name = name;
        this.connections = connections;
        this.numConnections = numConnections;
    }
    
    public String getName(){
        return name;
    }

    public User[] getConnections(){
        return connections;
    }

    public int getNumConnections(){
        return numConnections;
    }

    public void setName(){
        this.name = name;
    }

    public void setConnections(){
        this.connections = connections;
    }

    public void setNumConnections(){
        this.numConnections = numConnections;
    }

    public String toString(){
        return (name + ":" + connections);
    }
}