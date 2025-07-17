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

### 5. **🖥️ Menu Interface (Sample)**
```bash
=== EXPENSE TRACKER ===
1. Add Expense
2. View All Expenses
3. View Monthly Summary
4. Exit
Choose: _
```

### 6. **💡 Sample Usage**
```bash
Description: Groceries
Amount: 450.75
Category: Food
Date (yyyy-mm-dd): 2025-07-15
Expense added.
```

---

## 🛠️ Tech Stack

| Technology | Purpose                             |
|------------|-------------------------------------|
| Java 8+    | Core programming language           |
| OOP        | Encapsulation, modular classes      |
| File I/O   | Read/write expense data to file     |
| LocalDate  | Handle and store date information   |
| Collections| Store and process expense lists     |

---


## 📈 Future Enhancements

- [ ] Export monthly reports to CSV
- [ ] Add expense editing and deletion
- [ ] Add category budgets and alerts
- [ ] Password protection / encryption
- [ ] Multi-user support

---

## 🤝 Contribution

Pull requests are welcome!  
For major changes, please open an issue first to discuss what you would like to change or improve.

---

## 📜 License

This project is licensed under the **MIT License** – feel free to use, modify, and distribute.

---

## 🙋‍♂️ Author

**Vikash Thakur**  
📧 thakvikash324@gmail.com  
🌐 https://vikashdev.me/





