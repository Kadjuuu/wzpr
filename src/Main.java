import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        WorkoutManager manager = new WorkoutManager();
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

        while (true) {
            System.out.println("1. Register User");
            System.out.println("2. Record Workout Session");
            System.out.println("3. View Session History");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.print("Enter user name: ");
                    String name = scanner.nextLine();
                    User user = manager.registerUser(name);
                    System.out.println("Registered user: " + user);
                    break;
                case 2:
                    System.out.print("Enter user ID: ");
                    int userId = scanner.nextInt();
                    scanner.nextLine(); // consume newline
                    System.out.print("Enter session start time (yyyy-MM-dd HH:mm): ");
                    LocalDateTime startTime = LocalDateTime.parse(scanner.nextLine(), formatter);
                    System.out.print("Enter session end time (yyyy-MM-dd HH:mm): ");
                    LocalDateTime endTime = LocalDateTime.parse(scanner.nextLine(), formatter);
                    WorkoutSession session = manager.recordSession(userId, startTime, endTime);
                    System.out.println("Recorded session: " + session);
                    break;
                case 3:
                    System.out.print("Enter user ID: ");
                    int historyUserId = scanner.nextInt();
                    List<WorkoutSession> sessions = manager.getSessionHistory(historyUserId);
                    for (WorkoutSession s : sessions) {
                        System.out.println(s);
                    }
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
    }
}
