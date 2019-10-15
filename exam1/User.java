import java.util.*;

public class User {
    private String name;
    private User[] connections;
    private int numConnections;

    public User(final String name, final User[] connections, final int numConnections){
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
        return (name + " : " + connections);
    }
}