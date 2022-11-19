package project;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println("Please log in:");
        System.out.println("Please enter in your first name");
        Scanner scanner = new Scanner(System.in);

        String firstName = scanner.nextLine();
        User u = new User();
        u.setFirstName(firstName);

        System.out.println("Please enter in your last name");
        String lastName = scanner.nextLine();
        u.setLastName(lastName);

        int option = 0;

        while(option != 4){
            System.out.println("Choose an option below!");
            System.out.println("1) Book a flight");
            System.out.println("2) View my flights");
            System.out.println("3) Cancel a flight");
            option = scanner.nextInt();

            switch(option){
                case 1:
                    System.out.println("Select a flight to book:");
                    Ticket t1 = new Ticket("Los Angelos", "Denver", "11/20/2022", "11:15 a.m.", "C46", 180.35);
                    Ticket t2 = new Ticket("Chicago", "Denver", "11/20/2022", "11:15 a.m.", "C46", 350.99);
                    Ticket t3 = new Ticket("New York", "Denver", "11/20/2022", "11:15 a.m.", "C46", 400.88);
                    Ticket t4 = new Ticket("Houston", "Denver", "11/20/2022", "11:15 a.m.", "C46", 75.85);
                    Ticket t5 = new Ticket("Santa Monica", "Denver", "11/20/2022", "11:15 a.m.", "C46", 211.20);
                    Ticket t6 = new Ticket("San Diego", "Denver", "11/20/2022", "11:15 a.m.", "C46", 250.75);

                    System.out.println("1) To " + t1.getToDestination() + " from " + t1.getFromPlace() + " on " + t1.getDate() + " at " + t1.getTime() + " for $" + t1.getPrice() );
                    System.out.println("2) To " + t2.getToDestination() + " from " + t2.getFromPlace() + " on " + t2.getDate() + " at " + t2.getTime() + " for $" + t2.getPrice() );
                    System.out.println("3) To " + t3.getToDestination() + " from " + t3.getFromPlace() + " on " + t3.getDate() + " at " + t3.getTime() + " for $" + t3.getPrice() );
                    System.out.println("4) To " + t4.getToDestination() + " from " + t4.getFromPlace() + " on " + t4.getDate() + " at " + t4.getTime() + " for $" + t4.getPrice() );
                    System.out.println("5) To " + t5.getToDestination() + " from " + t5.getFromPlace() + " on " + t5.getDate() + " at " + t5.getTime() + " for $" + t5.getPrice() );
                    System.out.println("6) To " + t6.getToDestination() + " from " + t6.getFromPlace() + " on " + t6.getDate() + " at " + t6.getTime() + " for $" + t6.getPrice() );

                    int flightChoice = scanner.nextInt();

                    switch(flightChoice) {
                        case 1:
                            u.setMyTicket(t1);
                            break;
                        case 2:
                            u.setMyTicket(t2);
                            break;
                        case 3:
                            u.setMyTicket(t3);
                            break;
                        case 4:
                            u.setMyTicket(t4);
                            break;
                        case 5:
                            u.setMyTicket(t5);
                            break;
                        case 6:
                            u.setMyTicket(t6);
                            break;
                    }

                break;

                case 2:
                    System.out.println("Viewing my flights...");
                    System.out.println(u.getFirstName() + " has a flight to " + u.getMyTicket().getToDestination());
                    break;

                case 3:
                    System.out.println("Viewing my flights...");
                    System.out.println(u.getFirstName() + " has a flight to " + u.getMyTicket().getToDestination());
                    System.out.print("Do you want to cancel this flight? (1) Yes (2) No");
                    int yesOrNo = scanner.nextInt();

                    if(yesOrNo == 1){
                        System.out.println("Flight has been cancelled");
                        u.getMyTicket().setToDestination("");
                        u.getMyTicket().setDate("");
                        u.getMyTicket().setFromPlace("");
                        u.getMyTicket().setPrice(0.0);
                        u.getMyTicket().setGate("");
                        u.getMyTicket().setTime("");

                    }

            }

        }



    }
}
