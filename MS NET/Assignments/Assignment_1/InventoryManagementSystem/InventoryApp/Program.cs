using InventoryLibrary;
using System;

namespace InventoryApp
{
    class Program
    {
        static void Main(string[] args)
        {
            var manager = new InventoryManager();

            while (true)
            {
                Console.WriteLine("\nInventory Management System");
                Console.WriteLine("1. Add Product");
                Console.WriteLine("2. List All Products");
                Console.WriteLine("3. Sell Product");
                Console.WriteLine("4. Calculate Total Inventory Value");
                Console.WriteLine("5. Exit");
                Console.Write("Choose an option: ");
                var choice = Console.ReadLine();

                switch (choice)
                {
                    case "1":
                        AddProduct(manager);
                        break;
                    case "2":
                        ListAllProducts(manager);
                        break;
                    case "3":
                        SellProduct(manager);
                        break;
                    case "4":
                        CalculateInventoryValue(manager);
                        break;
                    case "5":
                        return;
                    default:
                        Console.WriteLine("Invalid choice. Try again.");
                        break;
                }
            }
        }

        static void AddProduct(InventoryManager manager)
        {
            Console.Write("Enter Product ID: ");
            if (!int.TryParse(Console.ReadLine(), out int id))
            {
                Console.WriteLine("Invalid ID.");
                return;
            }

            Console.Write("Enter Product Name: ");
            string name = Console.ReadLine();

            Console.Write("Enter Product Price: ");
            if (!decimal.TryParse(Console.ReadLine(), out decimal price))
            {
                Console.WriteLine("Invalid Price.");
                return;
            }

            Console.Write("Enter Product Stock: ");
            if (!int.TryParse(Console.ReadLine(), out int stock))
            {
                Console.WriteLine("Invalid Stock.");
                return;
            }

            manager.AddProduct(id, name, price, stock);
            Console.WriteLine("Product added successfully.");
        }

        static void ListAllProducts(InventoryManager manager)
        {
            var products = manager.GetAllProducts();
            if (products.Count == 0)
            {
                Console.WriteLine("No products found.");
                return;
            }

            Console.WriteLine("\nProducts:");
            foreach (var product in products)
            {
                Console.WriteLine(product);
            }
        }

        static void SellProduct(InventoryManager manager)
        {
            Console.Write("Enter Product ID: ");
            if (!int.TryParse(Console.ReadLine(), out int productId))
            {
                Console.WriteLine("Invalid ID.");
                return;
            }

            Console.Write("Enter Quantity to Sell: ");
            if (!int.TryParse(Console.ReadLine(), out int quantity))
            {
                Console.WriteLine("Invalid Quantity.");
                return;
            }

            manager.SellProduct(productId, quantity);
        }

        static void CalculateInventoryValue(InventoryManager manager)
        {
            var totalValue = manager.CalculateInventoryValue();
            Console.WriteLine($"\nTotal Inventory Value: ${totalValue:F2}");
        }
    }
}
