using Microsoft.AspNetCore.Mvc;
using OnlineBookstoreApp.Models;
using System.Collections.Generic;

namespace OnlineBookstoreApp.Controllers
{
    public class BookController : Controller
    {
        private static List<Book> books = new List<Book>();

        public IActionResult List()
        {
            return View(books);
        }

        public IActionResult Add()
        {
            return View();
        }

        [HttpPost]
        public IActionResult Add(Book model)
        {
            if (ModelState.IsValid)
            {
                books.Add(model);
                return RedirectToAction("List");
            }
            return View(model);
        }

        [NonAction]
        private string FormatBookInfo(Book book)
        {
            return $"{book.Title} by {book.Author}, published on {book.PublishedDate:yyyy-MM-dd}";
        }
    }
}
