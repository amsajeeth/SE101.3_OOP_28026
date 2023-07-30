class InterfaceImplemented implements MyFirstInterface {

    int x = 20; // This is a separate instance variable in the class, not related to the interface variable x

    // Overriding all the abstract methods
    public void display() {
        x = 50;
        System.out.println("New Value of x is: " + x);
    }
}
