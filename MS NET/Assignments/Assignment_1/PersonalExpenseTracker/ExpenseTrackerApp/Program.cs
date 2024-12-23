using ExpenseLibrary;
using System;

namespace ExpenseTrackerApp
{
    class Program
    {
        static void Main(string[] args)
        {
            ExpenseManager manager = new ExpenseManager();

            while (true)
            {
                Console.WriteLine("\nPersonal Expense Tracker");
                Console.WriteLine("1. Add Expense");
                Console.WriteLine("2. List All Expenses");
                Console.WriteLine("3. Calculate Total Expenses");
                Console.WriteLine("4. Filter Expenses by Category");
                Console.WriteLine("5. Exit");
                Console.Write("Choose an option: ");
                var choice = Console.ReadLine();

                switch (choice)
                {
                    case "1":
                        AddExpense(manager);
                        break;
                    case "2":
                        ListAllExpenses(manager);
                        break;
                    case "3":
                        CalculateTotalExpenses(manager);
                        break;
                    case "4":
                        FilterExpensesByCategory(manager);
                        break;
                    case "5":
                        return;
                    default:
                        Console.WriteLine("Invalid choice. Try again.");
                        break;
                }
            }
        }

        static void AddExpense(ExpenseManager manager)
        {
            Console.Write("Enter description: ");
            string description = Console.ReadLine();

            Console.Write("Enter category: ");
            string category = Console.ReadLine();

            Console.Write("Enter amount: ");
            if (!decimal.TryParse(Console.ReadLine(), out decimal amount))
            {
                Console.WriteLine("Invalid amount.");
                return;
            }

            Console.Write("Enter date (yyyy-mm-dd): ");
            if (!DateTime.TryParse(Console.ReadLine(), out DateTime date))
            {
                Console.WriteLine("Invalid date.");
                return;
            }

            var expense = new Expense(description, category, amount, date);
            manager.AddExpense(expense);
            Console.WriteLine("Expense added successfully.");
        }

        static void ListAllExpenses(ExpenseManager manager)
        {
            var expenses = manager.GetAllExpenses();
            if (expenses.Count == 0)
            {
                Console.WriteLine("No expenses found.");
                return;
            }

            Console.WriteLine("\nExpenses:");
            foreach (var expense in expenses)
            {
                Console.WriteLine(expense);
            }
        }

        static void CalculateTotalExpenses(ExpenseManager manager)
        {
            var total = manager.CalculateTotalExpenses();
            Console.WriteLine($"\nTotal Expenses: ${total:F2}");
        }

        static void FilterExpensesByCategory(ExpenseManager manager)
        {
            Console.Write("Enter category: ");
            string category = Console.ReadLine();

            var filtered = manager.FilterExpensesByCategory(category);
            if (filtered.Count == 0)
            {
                Console.WriteLine("No expenses found in this category.");
                return;
            }

            Console.WriteLine($"\nExpenses in category '{category}':");
            foreach (var expense in filtered)
            {
                Console.WriteLine(expense);
            }
        }
    }
}
