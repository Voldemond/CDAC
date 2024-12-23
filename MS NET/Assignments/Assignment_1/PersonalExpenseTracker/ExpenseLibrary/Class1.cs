namespace ExpenseLibrary
{
    public class Expense
    {
        public string Description { get; set; }
        public string Category { get; set; }
        public decimal Amount { get; set; }
        public DateTime Date { get; set; }

        public Expense(string description, string category, decimal amount, DateTime date)
        {
            Description = description;
            Category = category;
            Amount = amount;
            Date = date;
        }

        public override string ToString()
        {
            return $"{Date.ToShortDateString()} - {Description} ({Category}): ${Amount:F2}";
        }
    }
}
