package ui;
import db.Worker;
import java.util.Scanner;

public class Ui {

    public int menu() {

        System.out.println(1 + " - Add worker, " + 2 + " - Update worker, " + 3 + " - Delete worker, " +
                4 + " - Show all workers, " + 5 + " - Show workers by name, " + 6 + " - Exit");

        Scanner scanner = new Scanner(System.in);
        int selectedOption = 0;

        while (true) {
            try {
                selectedOption = Integer.parseInt(scanner.nextLine());
                if(selectedOption < 1 || selectedOption > 6) {
                    System.out.println("Menu item does not exist, try again");
                    continue;
                }
                break;
            } catch (Exception e) {
                System.out.println("Enter valid item number");
            }
        }
        return selectedOption;
    }

    public int getId(){
        Scanner scanner = new Scanner(System.in);
        int selectedId = 0;
        while (true) {
            try {
                System.out.println("Insert Worker ID");
                selectedId = Integer.parseInt(scanner.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("Enter valid ID");
            }
        }
        return selectedId;
    }

    public Worker getWorker(){
        Worker worker = new Worker();
        Scanner scanner = new Scanner(System.in);
        while (worker.name == null) {
            System.out.println("Insert worker's name");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                System.out.println("Name cannot be empty");
                continue;
            }
            worker.name = name;
        }

        String age;
        while (true) {
            try{
                System.out.println("Insert worker's age");
                age = scanner.nextLine();
                if (age.isEmpty()) {
                    System.out.println("Age cannot be empty");
                    continue;
                }
                worker.age = Integer.parseInt(age);
                break;
            } catch (Exception e) {
                System.out.println("Enter a number");
            }
        }

        while (worker.address == null) {
            System.out.println("Insert worker's address");
            String address = scanner.nextLine();
            if (address.isEmpty()) {
                System.out.println("Address cannot be empty");
                continue;
            }
            worker.address = address;
        }

        String salary;
        while (true) {
            try{
                System.out.println("Insert worker's salary");
                salary = scanner.nextLine();
                if (salary.isEmpty()) {
                    System.out.println("salary cannot be empty");
                    continue;
                }
                worker.salary = Integer.parseInt(salary);
                break;
            } catch (Exception e) {
                System.out.println("Enter a number");
            }
        }
        return worker;
    }

    public void updateWorker (Worker w) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert worker's name");
        String name = scanner.nextLine();
        if (!name.isEmpty()) {
            w.name = name;
        }

        System.out.println("Insert worker's age");
        String age = scanner.nextLine();
        if (!age.isEmpty()) {
            w.age = Integer.parseInt(age);
        }

        System.out.println("Insert worker's address");
        String  address = scanner.nextLine();
        if (!address.isEmpty()) {
            w.address = address;
        }

        System.out.println("Insert worker's salary");
        String salary = scanner.nextLine();
        if (!salary.isEmpty()) {
            w.salary = Integer.parseInt(salary);
        }
    }

    public String  showWorkerByName() {
        Scanner scanner = new Scanner(System.in);
        Worker worker;
        String name;
        String selectedWorker;
        while (true) {
            System.out.println("Insert worker's name");
            selectedWorker = scanner.nextLine();
            if(selectedWorker.isEmpty()) {
                System.out.println("Name cannot be empty");
                continue;
            }
            break;
        }
        return selectedWorker;
    }
}
