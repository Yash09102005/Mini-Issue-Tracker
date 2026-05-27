package com.day5;

import com.day5.dao.BugDAO;
import com.day5.model.Bug;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BugDAO dao = new BugDAO();

        while (true) {

            System.out.println("\n===== ISSUE TRACKER =====");

            System.out.println("1. Add Bug");
            System.out.println("2. View Bugs");
            System.out.println("3. Update Status");
            System.out.println("4. Delete Bug");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter title: ");
                    String title = sc.nextLine();

                    System.out.print("Enter description: ");
                    String desc = sc.nextLine();

                    System.out.print("Enter status: ");
                    String status = sc.nextLine();

                    Bug bug = new Bug(title, desc, status);

                    dao.addBug(bug);

                    break;

                case 2:

                    dao.viewBugs();

                    break;

                case 3:

                    System.out.print("Enter Bug ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter new status: ");
                    String newStatus = sc.nextLine();

                    dao.updateStatus(id, newStatus);

                    break;

                case 4:

                    System.out.print("Enter Bug ID: ");
                    int deleteId = sc.nextInt();

                    dao.deleteBug(deleteId);

                    break;

                case 5:

                    System.out.println("Exiting...");

                    System.exit(0);

                default:

                    System.out.println("Invalid Choice");
            }
        }
    }
}