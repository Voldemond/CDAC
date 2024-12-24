namespace InventoryLibrary
{
    public class Product
    {
        public int ID { get; set; }
        public string Name { get; set; }
        public decimal Price { get; set; }
        public int Stock { get; set; }

        // Constructor to initialize the product
        public Product(int id, string name, decimal price, int stock)
        {
            ID = id;
            Name = name;
            Price = price;
            Stock = stock;
        }

        // Method to calculate total value of all items in stock
        public decimal CalculateTotalValue(params int[] quantities)
        {
            if (quantities.Length == 0)
            {
                return Price * Stock; // Default to total stock value if no quantities provided
            }

            return quantities.Sum(q => q * Price);
        }

        public override string ToString()
        {
            return $"ID: {ID}, Name: {Name}, Price: ${Price:F2}, Stock: {Stock}";
        }
    }
}
