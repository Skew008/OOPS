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
public class BankAccount {
    static int fd=55000;
    static int sa=11000;
    int accno;
    int aadharno;
    String name;
    double ROI;
    double balance;
    
    BankAccount(char c)
    {
        if(c=='F')
        {
            fd=fd+1;
            accno=fd;
        }
        else if(c=='S')
        {
            sa=sa+1;
            accno=sa;
        }
    }
  
    
    void openAccount(int aadhar, String name)
    {
        aadharno=aadhar;
        this.name=name;
        balance=0;
        ROI=0.04;
    }
    
    void deposit(int amount)
    {
        balance=balance+amount;
        System.out.println("Updated Balance:"+balance);
    }
    
    void closeAccount()
    {
        System.out.println("Balance in account:"+balance);
        balance=0;
    }
    
    void updateInterest()
    {
        balance=balance+(ROI*balance);
    }
}
