package vault.model;
import java.util.ArrayList;
import java.util.List;

public class Vault {
    private String username;
    private int nextId;
    private List<VaultEntry> entries;

    // Vault object constructor
    public Vault(){
        this.entries = new ArrayList<>();
    }

    // Increment nextId to pass it as parameter to the id field in the vault entry object.
    public void incrementNextId(){
        this.nextId++;
    }

    // Getter methods
    public String getUsername(){
        return username;
    }

    public int getNextId(){
        return nextId;
    }

    public List<VaultEntry> getEntries(){
        return entries;
    }

    // Setter methods
    public void setUsername(String username){
        this.username = username;
    }

}
