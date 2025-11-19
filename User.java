import java.util.ArrayList;

public class User extends Person {
    private String password;
    private String role;
    private ArrayList<String> borrowedBooks;

    public User(String id, String name, String password, String role) {
        super(id, name);
        this.password = password;
        this.role = role;
        this.borrowedBooks = new ArrayList<>();
    }

    @Override
    public void displayInfo() {
        System.out.println("UserID: " + id + " | Name: " + name + " | Role: " + role);
        if (!borrowedBooks.isEmpty()) {
            System.out.println("Borrowed books: " + borrowedBooks);
        } else {
            System.out.println("Borrowed books: none");
        }
    }

    public String getPassword() { return password; }
    public String getRole() { return role; }
    public ArrayList<String> getBorrowedBooks() { return borrowedBooks; }

    public void borrowBook(String bookId) {
        borrowedBooks.add(bookId);
    }

    public void returnBook(String bookId) {
        borrowedBooks.remove(bookId);
    }

    public void setName(String newName) { this.name = newName; }
    public void setPassword(String newPass) { this.password = newPass; }
    public void setRole(String newRole) { this.role = newRole; }
}