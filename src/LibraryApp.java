import java.util.Scanner;

class Main {
    public static Library library = new Library();

    public static void main(String[] args) {
    	init();
        System.out.println("Welcome");
        Scanner sc = new Scanner(System.in);
        while(true) {
        	System.out.println("1. List members");
        	System.out.println("2. List books");
        	System.out.println("3. Display mailing address");
        	System.out.println("4. Quit");
        	int input = Integer.parseInt(sc.nextLine());
        	if(input == 1) {
        		for(int i = 0; i < library.members.length; i++) {
        			System.out.println( i +". " + library.members[i].name + "     " +  library.members[i].getAge() + " years old        " + library.members[i].address.toString());
        		}
        	} else if(input == 2) {
                for (int i = 0; i < library.books.length; i++){
                    System.out.println(library.books[i].title + ", " + library.books[i].author);
                }
        	} else if(input == 3) {
        		System.out.println(library.location.toString());
        	} else if(input == 4) {
        		break;
        	}
        }
    }
        

    public static void init() {
        Member[]members = new Member[3];
        Address address = new Address();
        Book[] books = new Book[3];

        for(int i = 0; i < 3; i++) {
            members[i] = new Member();
            books[i] = new Book();
        }
        members[0].name = "Demetrius";
        members[0].birthYear = 2001;
        
        members[1].name = "Victor";
        members[1].birthYear = 2000;
        
        members[2].name = "Gallo";
        members[2].birthYear = 1982;
        members[2].address.street = "green lane";
        members[2].address.city = "toronto";
        members[2].address.province = "ontario";
        members[2].address.postalCode = "L3T4T1";

        library.name = "The Cranium";
        library.location = address;

        books[0].title = "Teacher stalking 101";
        books[0].author = "Jaron B.";

        books[1].title = "The Giving Tree";
        books[1].author = "Shel Silverstein";

        books[2].title = "Book";
        books[2].author = "Author Writer";

        for(int i = 0; i < 3; i++) {
            library.addMember(members[i]);
            library.addBook(books[i]);
        }
    }

}
