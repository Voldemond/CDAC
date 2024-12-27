using Microsoft.AspNetCore.Mvc;
using OnlineShoppingPortal.Models;
using OnlineShoppingPortal.Services;
using System.Dynamic;
using System.Reflection.Metadata.Ecma335;


namespace OnlineShoppingPortal.Controllers
{
    public class ProductsController : Controller
    {
        //Dependency Injection
        private IProductService Service;

        public ProductsController(IProductService svc)
        {
            this.Service = svc;
        }
        //set of action methods
        public IActionResult Index()
        {
            //List of products
            List<Product> products= Service.GetAllProducts();
            //this.ViewBag.Products = Service.GetAllProducts();
            //this.ViewData["Products"] = products;


            this.TempData["Products"] =  "Hello  CDAC Data :Transflower";


            var theProduct=new Product();
           

            var obj = new { Products = products, Title = "List of Products", 
                        Message = "Welcome to the Online Shopping Portal",
                        Date = DateTime.Now };

            //obj.Email = "ravi.tambade@transflower.in";

            //ORM: Object Relational Mapping
            //EF Core: ORM
            //Dapper: Micro ORM
            //Entity Framework : ORM
            
            //Dynamic Data
            dynamic data = new ExpandoObject();
            data.Products = products;
            data.Title = "List of Products";
            data.Message = "Welcome to the Online Shopping Portal";
            data.Date = DateTime.Now;

            //ViewData : Dictionary
            //TempData: Session  // State full in concutive requests
            //ViewBag: Dynamic

            //return View();
            //return Json(products);
            return RedirectToAction("List");
        }

        public IActionResult List()
        {
            //List of products
            //List<Product> products=TempData["Products"] as List<Product>;
             string message = TempData["Products"] as string;
            //return View(message);
            message += " CDAC Mumbai";
            ViewBag.Message = message;
            return View();

            //return View(products);

        }
        public IActionResult Details(int id)
        {
            //Product details
            return View();
        }
    }
}
