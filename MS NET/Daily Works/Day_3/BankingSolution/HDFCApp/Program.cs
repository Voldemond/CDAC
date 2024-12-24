using  Taxation;
using AcctMgmt;
using  Notification;

Account account = new Account();
TaxManager taxManager = new TaxManager();
NotificationManager notificationManager = new NotificationManager();

//subscribe to the events
account.AccountOpened += notificationManager.SendEmailNotification;
account.AccountClosed += notificationManager.SendSMSNotification;
account.OverBalance += taxManager.PayServiceTax;
//account.OverBalance+=taxManager.PayGSTTax;
//account.OverBalance += taxManager.PayIncomeTax;

account.UnderBalance += notificationManager.SendWhatsAppNotification;

//open the account
account.OpenAccount("Raj", 100000);
account.Deposit(200000);
 