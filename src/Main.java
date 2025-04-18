import java.util.Scanner;
public class Main {
    static Book[] books = new Book[20];

    static void available() {
        System.out.println("\nAVAILABLE");
        for (Book b : books) {
            if (b == null || b.isCheckOut) { //|| is or
                continue;
            }
            System.out.printf("ID: %d - %s\n", b.id, b.title, b.isbn);
        }
    }
            static void checkedOut(){
                System.out.println("\nCHECKED-OUT");
                for (Book b : books) {
                    if (b == null || b.isCheckOut) { //|| is or
                        continue;
                    }
                    System.out.printf("%s - %s\n", b.title, b.checkOutTo);
                }
                String command = "start";
                Scanner in = new Scanner(System.in);
                while (command != "") ;
                System.out.println("""
                        Enter Id of book to checkout or 
                        blank line to exit this screen
                        """);
                command = in.nextLine().trim();
                if (command.length() > 0) {
                    int id = Integer.parseInt(command);
                    for (Book b : books) {
                        if (b.id == id) {
                            b.checkOut("USER");
                            break;
                        }
                    }
                }
            }
    static void checkedOut () {
        System.out.println("\nCHECKED-OUT");
        for (Book b : books) {
            if (b == null || b.isCheckOut) { //|| is or
                continue;
            }
            System.out.printf("%s - %s\n", b.title, b.checkOutTo);
        }
        String command = "start";
        Scanner in = new Scanner(System.in);
        while (command != "") ;
        System.out.println("""
                        Enter Id of book to checkout or 
                        blank line to exit this screen
                        """);
        command = in.nextLine().trim();
        if (command.length() > 0) {
            int id = Integer.parseInt(command);
            for (Book b : books) {
                if (b.id == id) {
                    b.checkIn();
                    break;
                }
            }
        }


    }
            public static void main; (String[]args){
                books[0] = new Book(111, "978-0307292063", "Foundation");
                books[1] = new Book(222, "ASIN-B07D23CFGR", "Atomic Habits");
                books[2] = new Book(333, "978-0679728757", "Blood Meridian");
                books[1].checkOut("Carlos");  //Carlos checked out Atomic Habits

                System.out.println("\nMAIN MENU");

            }
            Scanner in = new Scanner(System.in);
            int command = -1;
            while(command != 0) {
                System.out.println("""
                        1. Show Available Books
                        2. Show Checked Out Books
                        0. Exit-closes out of the application
                        """);
                command = in.nextInt();
                if (command == 0) {
                    //exit
                    break; //exit loop right now!
                } else if (command == 1) {
                    //show available plus menu
                    available();
                } else if (command == 2) {
                    //show checked out plus menu
                    checkedOut();
                } else {
                    //no such command
                    System.out.println("No such command:" + command);
                    //if the user types anything else than the numbers displayed
                }
            }
            System.out.println("Thanks for visiting");
        }
    }
}

