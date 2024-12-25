using Microsoft.AspNetCore.Mvc;
using UserAuthMVCApp.Models;
using UserAuthMVCAPP.Models;


namespace UserAuthMVCApp.Controllers
{
    public class AccountController : Controller
    {
        private static List<User> users = new List<User>(); 

       
        public IActionResult Register()
        {
            return View();
        }

      
        [HttpPost]
        public IActionResult Register(User model)
        {
            if (ModelState.IsValid)
            {
                users.Add(model); 
                return RedirectToAction("Login");
            }
            return View(model);
        }

     
        public IActionResult Login()
        {
            return View();
        }

       
        [HttpPost]
        public IActionResult Login(LoginViewModel model)
        {
            if (ModelState.IsValid)
            {
                var user = users.FirstOrDefault(u => u.Email == model.Email && u.Password == model.Password);
                if (user != null)
                {
                    TempData["Message"] = $"Welcome, {user.FullName}!";
                    return RedirectToAction("Dashboard");
                }

                ModelState.AddModelError(string.Empty, "Invalid login credentials.");
            }
            return View(model);
        }

      
        public IActionResult Dashboard()
        {
            if (TempData["Message"] != null)
            {
                ViewBag.Message = TempData["Message"];
                return View();
            }
            return RedirectToAction("Login");
        }

        
        public IActionResult Logout()
        {
            TempData.Clear();
            return RedirectToAction("Login");
        }
    }
}
