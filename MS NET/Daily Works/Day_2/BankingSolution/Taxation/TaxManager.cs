namespace Taxation;

public delegate void  TaxOperation();
public delegate void  TaxOperationWithParam(float tax);
public delegate float  TaxCalculation();
public class TaxManager
{
    public void PayIncomeTax(float tax)
    {
        Console.WriteLine("Paying Income tax...");
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
