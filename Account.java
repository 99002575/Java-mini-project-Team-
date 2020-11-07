
import java.util.*;

public class Account {

  Scanner input = new Scanner(System.in);
  DecimalFormat moneyFormat = new DecimalFormat();

  public int setCustomerNumber(int customerNumber){
    this.customerNumber = customerNumber;
    return customerNumber;
  }

  public int getCustomerNumber(){
    return customerNumber;
  }

  public int setPinNumber(int pinNumber){
    this.pinNumber = pinNumber;
    return pinNumber;
  }

  public int getPinNumber(){
    return pinNumber;
  }

  public double getCheckingBalance(){
    return checkingBalance;
  }

  public double getSavingBalance(){
    return savingBalance;
public void getCheckingWithdrawInput(){
    System.out.println("Current Account Balance: " + moneyFormat.format(checkingBalance));
    System.out.print("Amount you want to withdraw from Current Account: ");
    double amount =input.nextDouble();

 
//withdrawal
    if((checkingBalance-amount)>=0){
      calcCheckingWithdraw(amount);
      System.out.println("New Current Account Balance: " + moneyFormat.format(checkingBalance));
      }else{
        System.out.println("Balance Cannot be Negative." + "\n");
        }
    }

 

    public void getsavingWithdrawInput(){
      System.out.println("Saving Account Balance: " + moneyFormat.format(savingBalance));
      System.out.print("Amount you want to withdraw from saving Account: ");
      double amount =input.nextDouble();

 

      if((savingBalance-amount)>=0){
        calcSavingWithdraw(amount);
        System.out.println("New saving Account Balance: " + moneyFormat.format(savingBalance));
        }else{
        System.out.println("Balance Cannot be Negative." + "\n");
        }
      }

///// deposition of amount
public void getCheckingDepositInput(){
        System.out.println("Checking Account Balance: " + moneyFormat.format(checkingBalance));
        System.out.print("Amount you want to Deposit from Checking Account: ");
        double amount =input.nextDouble();

 

        if((checkingBalance+amount)>=0){
          calcCheckingDeposit(amount);
          System.out.println("New Checking Account Balance: " + moneyFormat.format(checkingBalance));
          }else{
          System.out.println("Balance Cannot be Negative." + "\n");
          }
        }

 

        public void getSavingDepositInput(){
          System.out.println("Saving Account Balance: " + moneyFormat.format(savingBalance));
          System.out.print("Amount you want to Deposit from saving Account: ");
          double amount =input.nextDouble();

 

          if((savingBalance+amount)>=0){
            calcSavingDeposit(amount);
            System.out.println("New saving Account Balance: " + moneyFormat.format(savingBalance));
            }else{
            System.out.println("Balance Cannot be Negative." + "\n");
            }
          }
