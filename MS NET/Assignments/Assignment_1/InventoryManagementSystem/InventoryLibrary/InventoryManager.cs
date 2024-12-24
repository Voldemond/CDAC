using System;
using System.Collections.Generic;
using System.Linq;

namespace InventoryLibrary
{
    public class InventoryManager
    {
        private List<Product> products = new List<Product>();

        // Add product to the inventory
        public void AddProduct(int id, string name, decimal price, int stock)
        {
            var product = new Product(id, name, price, stock);
            products.Add(product);
        }

        // List all products
        public List<Product> GetAllProducts()
        {
            return products;
        }

        // Method to sell products and reduce stock
        public void SellProduct(int productId, int quantity)
        {
            // Local Function to validate stock
            bool ValidateStock(Product product, int qty)
            {
                return product.Stock >= qty;
            }

            var product = products.FirstOrDefault(p => p.ID == productId);
            if (product == null)
            {
                Console.WriteLine("Product not found.");
                return;
            }

            if (!ValidateStock(product, quantity))
            {
                Console.WriteLine("Insufficient stock.");
                return;
            }

            product.Stock -= quantity;
            Console.WriteLine($"Sold {quantity} of {product.Name}. Remaining stock: {product.Stock}");
        }

        // Calculate the total value of all products in stock
        public decimal CalculateInventoryValue()
        {
            return products.Sum(p => p.Price * p.Stock);
        }
    }
}
