package vault.model;

public class VaultEntry {
    private final int id;
    private String service, entryAccountName, entryPassword, entryNotes;

    // Vault entry object constructor
    public VaultEntry(int id, String service, String entryAccountName, String entryPassword, String entryNotes){
        this.id = id;
        this.service = service;
        this.entryAccountName = entryAccountName;
        this.entryPassword = entryPassword;
        this.entryNotes = entryNotes;
    }

    // Getter methods
    public int getId(){
        return id;
    }

    public String getService(){
        return service;
    }

    public String getEntryAccountName(){
        return entryAccountName;
    }

    public String getEntryPassword(){
        return entryPassword;
    }

    public String getEntryNotes(){
        return entryNotes;
    }

    // Setter methods
    public void setService(String service){
        this.service = service;
    }

    public void setEntryAccountName(){
        this.entryAccountName = entryAccountName;
    }

    public void setEntryPassword(){
        this.entryPassword = entryPassword;
    }

    public void setEntryNotes(){
        this.entryNotes = entryNotes;
    }

}
