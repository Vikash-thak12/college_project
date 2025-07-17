# 💸 Java Terminal-Based Expense Tracker

A simple and powerful **console-based expense tracking application** built in **pure Java**. This project helps you log, view, and analyze your personal expenses directly from the terminal. Data is stored locally in a file for persistence.

---

## 📌 Features

- ✅ Add a new expense with description, amount, category, and date
- 📄 View all previously added expenses in a tabular format
- 📊 Get monthly summaries grouped by category
- 💾 Data saved locally to `expenses.txt` file
- 📂 File I/O based persistence (no database required)
- ⌛ Built using Java 8+ and follows clean OOP design principles

---

## 🚀 Getting Started

### 1. **Clone the Repository**
```bash
git clone https://github.com/Vikash-thak12/java-expense-tracker.git
cd java-expense-tracker
```

### 2. **Compile the Program**
```bash
javac Expense.java ExpenseTracker.java Main.java
```

### 3. **Run the Application**
```bash
java Main
```

### 4. **🧱 Project Structure**
```bash
java-expense-tracker/
├── Expense.java            // Data model class
├── ExpenseTracker.java     // Core logic (add, view, summary)
├── Main.java               // Entry point + user menu
├── expenses.txt            // Auto-generated storage file
├── .gitignore              // Ignores .class files and data
└── README.md               // You're reading it :)
```

