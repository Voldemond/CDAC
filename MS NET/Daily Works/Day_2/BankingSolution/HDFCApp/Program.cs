using  Taxation;

TaxManager manager = new TaxManager();
//direct call to the methods
/*manager.PayIncomeTax();
manager.PayServiceTax();
*/

//using delegate
//register the method with the delegate
TaxOperation taxOperation1 = new TaxOperation(manager.PayGSTTax);
TaxOperation taxOperation2 = new TaxOperation(manager.PayServiceTax);


//attach the method to the delegate

TaxOperation masterOperation = taxOperation1 + taxOperation2;
//invoke the method using the delegate
masterOperation();

TaxOperationWithParam taxOperation3 = new TaxOperationWithParam(manager.PayIncomeTax);
 
//invoke the method using the delegate
//delegate is nothing typesafe object oreinted function pointer
//delegate behaves like an object 
//which is a wrapper aroun for function pointer inside
////taxOperation1();
//taxOperation2();
//Multicast delegate
//TaxOperation operation = taxOperation1 + taxOperation2;

taxOperation1();
 

TaxCalculation taxCalculation = new TaxCalculation(manager.CalculateIncomeTax);
float tax = taxCalculation();
Console.WriteLine("Tax calculated: " + tax);

 


