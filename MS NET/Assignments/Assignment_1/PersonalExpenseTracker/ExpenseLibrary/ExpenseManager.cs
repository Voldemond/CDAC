using System;
using System.Collections.Generic;
using System.Linq;

namespace ExpenseLibrary
{
    public class ExpenseManager
    {
        private List<Expense> expenses = new List<Expense>();

        public void AddExpense(Expense expense)
        {
            expenses.Add(expense);
        }

        public List<Expense> GetAllExpenses()
        {
            return expenses;
        }

        public decimal CalculateTotalExpenses()
        {
            return expenses.Sum(e => e.Amount);
        }

        public List<Expense> FilterExpensesByCategory(string category)
        {
            return expenses.Where(e => e.Category.Equals(category, StringComparison.OrdinalIgnoreCase)).ToList();
        }
    }
}
