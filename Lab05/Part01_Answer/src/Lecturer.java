class Lecturer extends Person {
    private String programme;


    public Lecturer(String name, int id, String programme) {
        super(name, id);
        this.programme = programme;
    }

    public String getProgramme() {
        return programme;
    }

    public void setProgramme(String programme) {
        this.programme = programme;
    }
}