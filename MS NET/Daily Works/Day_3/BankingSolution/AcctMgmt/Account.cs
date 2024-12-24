namespace AcctMgmt;

//Busincess entity: Account
//Account has state and behaviour and events
public delegate void AccountEventHandler();
public class Account
{

    //State : Properties
    public string AccountNumber { get; set; }
    public string AccountHolderName { get; set; }
    public float Balance { get; set; }

    //events : underbalance, overbalance, accountclosed, accountopened
    public event AccountEventHandler  UnderBalance, OverBalance, AccountClosed, AccountOpened;

    //behaviour
    public void OpenAccount( string accountHolderName, float balance)
    {
        //global unique identifier (128 bit number)
        this.AccountNumber = Guid.NewGuid().ToString();
        this.AccountHolderName = accountHolderName;
        this.Balance = balance;
        AccountOpened();  //trigger the event
    }

    public void CloseAccount()
    {
        //perform formatility to close the account
        AccountClosed(); //trigger the event
    }

    public void Deposit(float amount)
    {
        float BalanceTobeUpdated= this.Balance + amount;
        
        if(BalanceTobeUpdated > 25000)
        {
            OverBalance(); //trigger the event
            
        }
        this.Balance = BalanceTobeUpdated;
    }

    public void Withdraw(float amount)
    {
      float BalanceTobeUpdated= this.Balance -amount;
        if(BalanceTobeUpdated < 100){
            UnderBalance(); //trigger the event
            return;
        }
        this.Balance = BalanceTobeUpdated;
    }

    public void Transfer( string toAccountId, float amount)
    {
        this.Balance -= amount;
        //transfer the amount to the account with toAccountId
    }

}
