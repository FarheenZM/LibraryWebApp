package models;


import java.util.HashSet;
import java.util.Set;

public class Library {

    private int id;
    private Set<Borrower> borrowers;

    public Library() {
        this.id = id;
        this.borrowers= new HashSet<Borrower>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Set<Borrower> getBorrowers() {
        return borrowers;
    }

    public void setBorrowers(Set<Borrower> borrowers) {
        this.borrowers = borrowers;
    }


}
