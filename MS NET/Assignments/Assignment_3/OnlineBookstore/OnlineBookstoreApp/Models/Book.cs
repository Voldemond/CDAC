using System;
using System.ComponentModel.DataAnnotations;

namespace OnlineBookstoreApp.Models
{
    public class Book 
    {
        [Required(ErrorMessage ="Title is required")]
        public string Title { get; set; }

        [Required(ErrorMessage ="Author is required")]
        public string Author { get; set; }

        [Required(ErrorMessage ="Price is required")]
        [Range(0.01, 1000.00, ErrorMessage ="Price must be between $0.01 and $1000.00")]
        public decimal Price { get; set; }

        [Required(ErrorMessage ="Published Date is required")]
        [DataType(DataType.Date)]
        public DateTime PublishedDate { get; set; }
        
    }
}