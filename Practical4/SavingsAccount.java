/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical4;

/**
 *
 * @author SRCOEM
 */
public class SavingsAccount extends BankAccount implements Debitable{
    
    SavingsAccount(String name, int aadhar,char s)
    {
        super(s);
        super.openAccount(aadhar,name);
    }
    
    public void withdraw(double amount)
    {
        if(amount>super.balance){
            System.out.println("Not enough balance");
        }
        else
        {
            super.balance=super.balance-amount;
            System.out.println("Amount is withdrawn:"+amount);
        }
    }
    
    void display()
    {
        System.out.println("-------------------------------");
        System.out.println("Name:"+super.name);
        System.out.println("Account No.:"+super.accno);
        System.out.println("Balance:"+super.balance);
        System.out.println("-------------------------------");
    }
}
