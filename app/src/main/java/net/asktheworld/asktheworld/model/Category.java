package net.asktheworld.asktheworld.model;

/**
 * Created by magraf on 23.10.2017.
 */

public class Category {
    private string id;
    private string name;
    private string description;

    // TODO Constructor

    public string getId() { return id; }

    public void setId(string id) {
        // TODO Checks...
        this.id = id;
    }

    public string getName() {
        return name;
    }

    public void setName(string name) {
        this.name = name;
    }

    public string getDescription() {
        return description;
    }

    public void setDescription(string description) {
        this.description = description;
    }
}
