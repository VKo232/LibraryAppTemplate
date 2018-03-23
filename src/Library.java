/**
 * Library class
 */
public class Library {
	
	String name;
	Address location;
	Book[] books;
	Member[] members;
	
	public Library() {
		books = new Book[0];
		members = new Member[0];
		name = "";
		location = new Address();
		
	}

    /**
     * addBook(Book) : void
     * Creates a new array which is a copy of this.books, but, whose length is
     * this.books.length + 1, to be able to add the new book.
     *
     * this.books is then replaced by the new array.
     *
     * @param book
     *          A new book object to add to the books list
     */
	public void addBook(Book book) {
	    Book[] newArray = new Book[books.length + 1];
	    System.arraycopy(books, 0, newArray, 0, books.length);

	    books = newArray;
	    books[books.length -1] = book;
	    
	}





    /**
     * addMember(Member) : void
     * Creates a new array which is a copy of this.members, but, whose length is
     * this.members.length + 1, to be able to add the new member.
     *
     * this.members is then replaced by the new array.
     *
     * @param member
     *          A new member object to add to the members list
     */
	public void addMember(Member member) {
		
	    Member[] newArray = new Member[members.length + 1];
	    System.arraycopy(members, 0, newArray, 0, members.length);

	    members = newArray;
	    members[members.length -1] = member;
	}





}
