import java.util.Scanner;

public class LibraryManagement {

    static int[] bookId = new int[100];
    static String[] bookName = new String[100];
    static String[] status = new String[100];

    static int count = 0;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        while(true) {

            System.out.println("\n===== Library Management =====");
            System.out.println("1. Add Book");
            System.out.println("2. Display Books");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch(choice) {

                case 1:
                    System.out.print("Enter Book ID: ");
                    bookId[count] = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Book Name: ");
                    bookName[count] = sc.nextLine();

                    status[count] = "Available";

                    count++;

                    System.out.println("Book Added Successfully");
                    break;

                case 2:

                    if(count == 0) {
                        System.out.println("No Books Available");
                    }

                    for(int i=0;i<count;i++) {

                        System.out.println("ID: "+bookId[i]
                        +" Name: "+bookName[i]
                        +" Status: "+status[i]);
                    }

                    break;

                case 3:

                    System.out.print("Enter Book ID to Issue: ");
                    int issueId = sc.nextInt();

                    for(int i=0;i<count;i++) {

                        if(bookId[i] == issueId) {

                            status[i] = "Issued";
                            System.out.println("Book Issued");
                        }
                    }

                    break;

                case 4:

                    System.out.print("Enter Book ID to Return: ");
                    int returnId = sc.nextInt();

                    for(int i=0;i<count;i++) {

                        if(bookId[i] == returnId) {

                            status[i] = "Available";
                            System.out.println("Book Returned");
                        }
                    }

                    break;

                case 5:
                    System.out.println("Program Ended");
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice");
            }

        }

    }
}