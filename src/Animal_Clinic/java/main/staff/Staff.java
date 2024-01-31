package main.staff;

public abstract class Staff {
    protected String fullname;
    protected Position position;


    public Staff(String fullname, Position position) {
        this.fullname = fullname;
        this.position = position;
    }


}
