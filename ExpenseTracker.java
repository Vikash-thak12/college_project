import java.io.*;
import java.time.LocalDate;
import java.util.*;

public class ExpenseTracker {
    private List<Expense> expenses;
    private static final String FILE_NAME = "expenses.txt";

    public ExpenseTracker() {
        expenses = new ArrayList<>();
        loadExpensesFromFile();
    }

    public void addExpense(String desc, double amt, String category, LocalDate date) {
        int id = expenses.size() + 1;
        Expense e = new Expense(id, desc, amt, category, date);
        expenses.add(e);
        saveExpenseToFile(e);
        System.out.println("Expense added.");
    }

    public void viewAllExpenses() {
        if (expenses.isEmpty()) {
            System.out.println("No expenses found.");
            return;
        }
        System.out.println("=== All Expenses ===");
        for (Expense e : expenses) {
            System.out.println(e);
        }
    }

    public void showSummaryByMonth(int year, int month) {
        double total = 0;
        Map<String, Double> categoryTotal = new HashMap<>();

        for (Expense e : expenses) {
            if (e.getDate().getYear() == year && e.getDate().getMonthValue() == month) {
                total += e.getAmount();
                categoryTotal.put(
                    e.getCategory(),
                    categoryTotal.getOrDefault(e.getCategory(), 0.0) + e.getAmount()
                );
            }
        }

        if (total == 0) {
            System.out.println("No expenses found for this month.");
            return;
        }

        System.out.println("=== Monthly Summary ===");
        for (String cat : categoryTotal.keySet()) {
            System.out.println(cat + ": ₹" + categoryTotal.get(cat));
        }
        System.out.println("Total: ₹" + total);
    }

    private void saveExpenseToFile(Expense e) {
        try (FileWriter fw = new FileWriter(FILE_NAME, true)) {
            fw.write(e.toCSV() + "\n");
        } catch (IOException ex) {
            System.out.println("Failed to save to file.");
        }
    }

    private void loadExpensesFromFile() {
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = br.readLine()) != null) {
                expenses.add(Expense.fromCSV(line));
            }
        } catch (IOException e) {
            // File not found? No problem — will create on first save.
        }
    }
}
