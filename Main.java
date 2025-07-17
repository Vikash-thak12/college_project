import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ExpenseTracker tracker = new ExpenseTracker();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== EXPENSE TRACKER ===");
            System.out.println("1. Add Expense");
            System.out.println("2. View All Expenses");
            System.out.println("3. View Monthly Summary");
            System.out.println("4. Exit");
            System.out.print("Choose: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume leftover newline

            switch (choice) {
                case 1:
                    System.out.print("Description: ");
                    String desc = sc.nextLine();
                    System.out.print("Amount: ");
                    double amt = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Category: ");
                    String cat = sc.nextLine();
                    System.out.print("Date (yyyy-mm-dd): ");
                    String dateStr = sc.nextLine();
                    LocalDate date = LocalDate.parse(dateStr);
                    tracker.addExpense(desc, amt, cat, date);
                    break;

                case 2:
                    tracker.viewAllExpenses();
                    break;

                case 3:
                    System.out.print("Enter year (e.g. 2025): ");
                    int year = sc.nextInt();
                    System.out.print("Enter month (1-12): ");
                    int month = sc.nextInt();
                    tracker.showSummaryByMonth(year, month);
                    break;

                case 4:
                    System.out.println("Goodbye!");
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
