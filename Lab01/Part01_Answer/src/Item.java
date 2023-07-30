class Item {
    protected int location;
    protected String description;
    // Constructor for the Item class
    public Item(int location, String description) {
        this.location = location;
        this.description = description;
    }
    // Getter for the location variable
    public int getLocation() {
        return location;
    }
    // Setter for the location variable
    public void setLocation(int location) {
        this.location = location;
    }
    // Getter for the description variable
    public String getDescription() {
        return description;
    }
    // Setter for the description variable
    public void setDescription(String description) {
        this.description = description;
    }
}
