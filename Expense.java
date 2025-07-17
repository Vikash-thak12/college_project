import java.time.LocalDate;

public class Expense {
    private int id;
    private String description;
    private double amount;
    private String category;
    private LocalDate date;

    public Expense(int id, String description, double amount, String category, LocalDate date) {
        this.id = id;
        this.description = description;
        this.amount = amount;
        this.category = category;
        this.date = date;
    }

    public int getId() { return id; }
    public String getDescription() { return description; }
    public double getAmount() { return amount; }
    public String getCategory() { return category; }
    public LocalDate getDate() { return date; }

    public String toCSV() {
        return id + "," + description + "," + amount + "," + category + "," + date;
    }

    @Override
    public String toString() {
        return id + " | " + description + " | ₹" + amount + " | " + category + " | " + date;
    }

    public static Expense fromCSV(String line) {
        String[] parts = line.split(",");
        return new Expense(
            Integer.parseInt(parts[0]),
            parts[1],
            Double.parseDouble(parts[2]),
            parts[3],
            LocalDate.parse(parts[4])
        );
    }
}
