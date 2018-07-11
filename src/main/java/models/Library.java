package models;


import javax.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="library")
public class Library {

    private int id;
    private Set<Borrower> borrowers;
    private Set<Book> books;

    public Library() {
        this.borrowers = new HashSet<Borrower>();
        this.books = new HashSet<Book>();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ids")
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    @OneToMany(mappedBy = "library", fetch = FetchType.LAZY)
    public Set<Borrower> getBorrowers() {return borrowers;}
    public void setBorrowers(Set<Borrower> borrowers) {this.borrowers = borrowers;}

    @OneToMany(mappedBy = "library", fetch = FetchType.LAZY)
    public Set<Book> getBooks() {return books;}
    public void setBooks(Set<Book> books) {this.books = books;}
}
