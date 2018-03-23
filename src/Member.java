/**
 * Member class
 */

public class Member {
    String name;
    int birthYear;
    Address address;

    public Member() {
        birthYear = 0;
        name = "";
        address = new Address();
    }

    /**
     * getAge() : int
     * Instance method to calculate the member's age.
     * @return
     *          returns the member's age as an int.
     */
    
    public int getAge() {
        int age = 2018 - birthYear;
        return age;
    }

 /**
     * readBook(Book) : void
     * Will "read" a book give to the member.
     * "Reading" consists of printing out any appropriate message
     * containing the title of the book.
     *
     * @param book
     *          The book to read.
     */
    public void readBook(Book book) {
        String message = "The book you're reading is ";
        System.out.println(message + book.title + "!");
    }
}
