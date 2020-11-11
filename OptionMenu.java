import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.*;
import java.io.IOException;

public class OptionMenu extends Account {
  Scanner menuInput= new Scanner(System.in);
  DecimalFormat moneyFormat=new DecimalFormat("'$'###,##0.00");

  HashMap<Integer,Integer> data= new HashMap<Integer,Integer>();

  public void getLogin() throws IOException {
    int x=1;
    do{
      try {
         data.put(101, 101);
         data.put(102, 102);

         System.out.println("Welcome to the ATM Project!");
         System.out.println("Enter your customer Number");
         setCustomerNumber(menuInput.nextInt());
      private int customerNumber;
//         private int pinNumber;
         System.out.print("Enter your PIN Number: ");
         setPinNumber(menuInput.nextInt());
         }
         catch (Exception e) {
           System.out.println("\n"+ "Invalid Character(s). Only Numbers."+"\n");
           x=2;
         }
      
         int cn=getCustomerNumber();
         int pn=getPinNumber();
         if(data.containsKey(cn) && data.get(cn)==pn){
             getAccountType();
         }else
         System.out.println("\n" + "Wrong Customer Number or Pin Number" + "\n");
    }while(x==1);
  }

  public void getAccountType(){
    System.out.println("Select the Account you Want to Access: ");
    System.out.println(" Type 1 - Current Account");
    System.out.println(" Type 2 - Savings Account");
    System.out.println(" Type 3 - Exit");

    int selection= menuInput.nextInt();

    switch (selection) {
      case 1:
      getChecking();
      break;

      case 2:
      getSaving();
      break;

      case 3:
      System.out.println("Thank You for using this ATM project, bye.....  \n");
      break;

      default:
      System.out.println("\n" + "Invalid Choice..." + "\n");
      getAccountType();
    }
  }

  public void getChecking(){
    System.out.println("Current Account: ");
    System.out.println(" Type 1 - View Balance");
    System.out.println(" Type 2 - Withdraw Funds");
    System.out.println(" Type 3 - Deposit Funds");
    System.out.println(" Type 4 - Exit");
    System.out.print("Choice: ");

    int selection = menuInput.nextInt();

    switch (selection) {
      case 1:
      System.out.println("Current Account Balance: " + moneyFormat.format(getCheckingBalance()));
      getAccountType();
      break;

      case 2:
      getCheckingWithdrawInput();
      getAccountType();
      break;

      case 3:
      getCheckingDepositInput();
      getAccountType();
      break;

      case 4:
      System.out.println("Thank You for using this ATM project, bye....");
      break;

      default:
      System.out.println("\n" + "Invalid Choice..." + "\n");
      getChecking();
    }
  }


 ///////

}

