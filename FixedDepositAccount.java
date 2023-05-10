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
public class FixedDepositAccount extends BankAccount{
    double lockInPeriod;
    
    FixedDepositAccount(String name,int aadhar, char f, double lock)
    {
        super(f);
        super.openAccount(aadhar,name);
        lockInPeriod=lock;
    }
    
    void updateInterest()
    {
        if(lockInPeriod>5)
        {
            super.ROI=0.07;
            super.balance=super.balance+(super.ROI*super.balance);
            System.out.println("Updated Balance:"+super.balance);
        }
        else if(lockInPeriod<=5 && lockInPeriod>2)
        {
            super.ROI=0.065;
            super.balance=super.balance+(super.ROI*super.balance);
            System.out.println("Updated Balance:"+super.balance);
        }
        else if(lockInPeriod<=2 && lockInPeriod>1)
        {
            super.ROI=0.06;
            super.balance=super.balance+(super.ROI*super.balance);
            System.out.println("Updated Balance:"+super.balance);
        }
        else
            System.out.println("Error");
    }
    
    void closeAccount(int period)
    {
        if(period<lockInPeriod)
        {
            super.balance=super.balance-(0.05*super.balance);
            System.out.println("Balance :"+super.balance);
            super.balance=0;
        }
        else
        {
            System.out.println("Balance :"+super.balance);
            super.balance=0;
        }   
    }
    
    void display()
    {
        System.out.println("-------------------------------");
        System.out.println("Name:"+super.name);
        System.out.println("Account No.:"+super.accno);
        System.out.println("Amount:"+super.balance);
        System.out.println("Period:"+lockInPeriod);
        System.out.println("-------------------------------");
    }
}
