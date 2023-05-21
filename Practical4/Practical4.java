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
public class Practical4 {

    public static void main(String[] args) {
        FixedDepositAccount ob1 = new FixedDepositAccount("Shreyansh", 4523645, 'F', 3);
        FixedDepositAccount ob2 = new FixedDepositAccount("Saurabh", 45236432, 'F', 6);
        SavingsAccount ob3 = new SavingsAccount("Shreyansh", 4523645, 'S');
        SavingsAccount ob4 = new SavingsAccount("Saurabh", 4523632, 'S');
        
        ob1.deposit(34000);
        ob2.deposit(20000);
        ob3.deposit(500000);
        ob4.deposit(1000000);
        
        ob1.display();
        ob2.display();
        ob3.display();
        ob4.display();
        
        ob3.updateInterest();
        ob3.updateInterest();
        ob3.updateInterest();
        
        ob3.display();
        ob4.display();
        
        ob3.withdraw(4555);
        ob3.display();
        
        ob3.closeAccount();
    }
}
