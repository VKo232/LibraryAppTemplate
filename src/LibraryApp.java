import java.util.Scanner;

public class LibraryApp {
    private static Library library = new Library();

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
        			System.out.println( i +". "library.members[i].name + "     " +  library.members[i].getAge() + " years old        " + library.members[i].address.toString());
        		}
        	} else if(input == 2) {
        		
        	} else if(input == 3) {
        		
        	} else if(input == 4) {
        		break;
        	}
        }
    }
}
