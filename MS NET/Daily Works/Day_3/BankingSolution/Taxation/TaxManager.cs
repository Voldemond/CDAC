namespace Taxation;

public delegate void  TaxOperation();
public delegate void  TaxOperationWithParam(float tax);
public delegate float  TaxCalculation();
public class TaxManager
{
    
    //  Event Handlers
    public void PayIncomeTax( )
    {
        Console.WriteLine("Paying Income tax...   30%");
    }

    public void PayServiceTax()
    {
        Console.WriteLine("Paying Service tax...");
    }

    public void PayGSTTax()
    {
        Console.WriteLine("Paying GST tax...");
    }


    public float CalculateIncomeTax()
    {
        return 1000;
    }
}
