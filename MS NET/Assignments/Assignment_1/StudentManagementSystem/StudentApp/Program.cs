using StudentLibrary;
using System;

namespace StudentApp
{
    class Program
    {
        static void Main(string[] args)
        {
            var manager = new StudentManager();

            while (true)
            {
                Console.WriteLine("\nStudent Management System");
                Console.WriteLine("1. Add Student");
                Console.WriteLine("2. List All Students");
                Console.WriteLine("3. Exit");
                Console.Write("Choose an option: ");
                var choice = Console.ReadLine();

                switch (choice)
                {
                    case "1":
                        AddStudent(manager);
                        break;
                    case "2":
                        ListAllStudents(manager);
                        break;
                    case "3":
                        return;
                    default:
                        Console.WriteLine("Invalid choice. Try again.");
                        break;
                }
            }
        }

        static void AddStudent(StudentManager manager)
        {
            Console.Write("Enter Roll Number: ");
            if (!int.TryParse(Console.ReadLine(), out int rollNumber))
            {
                Console.WriteLine("Invalid Roll Number.");
                return;
            }

            Console.Write("Enter Name: ");
            string name = Console.ReadLine();

            Console.Write("Do you want to enter individual subject marks? (y/n): ");
            string response = Console.ReadLine()?.ToLower();

            if (response == "y")
            {
                Console.Write("Enter marks for Subject 1: ");
                if (!double.TryParse(Console.ReadLine(), out double subject1))
                {
                    Console.WriteLine("Invalid Marks.");
                    return;
                }

                Console.Write("Enter marks for Subject 2: ");
                if (!double.TryParse(Console.ReadLine(), out double subject2))
                {
                    Console.WriteLine("Invalid Marks.");
                    return;
                }

                Console.Write("Enter marks for Subject 3: ");
                if (!double.TryParse(Console.ReadLine(), out double subject3))
                {
                    Console.WriteLine("Invalid Marks.");
                    return;
                }

                manager.AddStudent(rollNumber, name, 0, true, subject1, subject2, subject3);
            }
            else
            {
                Console.Write("Enter Total Marks: ");
                if (!double.TryParse(Console.ReadLine(), out double marks))
                {
                    Console.WriteLine("Invalid Marks.");
                    return;
                }

                manager.AddStudent(rollNumber, name, marks);
            }

            Console.WriteLine("Student added successfully.");
        }

        static void ListAllStudents(StudentManager manager)
        {
            var students = manager.GetAllStudents();
            if (students.Count == 0)
            {
                Console.WriteLine("No students found.");
                return;
            }

            Console.WriteLine("\nStudent Records:");
            foreach (var student in students)
            {
                Console.WriteLine(student);
            }
        }
    }
}
