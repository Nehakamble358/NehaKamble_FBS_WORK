package PolymorephismDemo;

import java.time.LocalDate;
import java.time.Period;

class BankAccount {

    int accNo;
    String accHolderName;
    double currentBalance;
    static double interestRate = 12;

    static {
        System.out.println("~~~~~~~Static block~~~~~~~~~");
    }

    {
        System.out.println("~~~~~~~Instance block~~~~~~~~~");
    }

    BankAccount(int a, String n, double c) {
        this.accNo = a;
        this.accHolderName = n;
        this.currentBalance = c;
    }

    void setAccNo(int a) {
        this.accNo = a;
    }

    void setAccHolderName(String a) {
        this.accHolderName = a;
    }

    void setCurrentBalance(double a) {
        this.currentBalance = a;
    }

    static void setInterestRate(double a) {
        interestRate = a;
    }

    int getAccNo() {
        return this.accNo;
    }

    String getAccHolderName() {
        return this.accHolderName;
    }

    double getCurrentBalance() {
        return this.currentBalance;
    }

    double getInterestRate() {
        return interestRate;
    }

    void display() {
        System.out.println("Account No: " + accNo);
        System.out.println("Account Holder: " + accHolderName);
        System.out.println("Current Balance: ₹" + currentBalance);
        System.out.println("Interest Rate: " + interestRate + "%");
    }

    void withdraw(double amount) {
        System.out.println("Generic withdrawal method.");
    }
}

// --------------------- Saving Account ---------------------
class SavingAcc extends BankAccount {

    int minBal;

    SavingAcc(int a, String n, double c, int minBal) {
        super(a, n, c);
        this.minBal = minBal;
    }

    void withdraw(double amount) {
        if (currentBalance - amount >= minBal) {
            currentBalance -= amount;
            System.out.println("Withdrawal successful! Remaining balance: ₹" + currentBalance);
        } else {
            System.out.println("Cannot withdraw. Minimum balance ₹" + minBal + " must be maintained.");
        }
    }
}

// --------------------- Current Account ---------------------
class CurrentAcc extends BankAccount {

    double withdrawLimit;

    CurrentAcc(int a, String n, double c, double w) {
        super(a, n, c);
        this.withdrawLimit = w;
    }

    void withdraw(double amount) {
        if (amount > withdrawLimit) {
            System.out.println("Withdrawal failed: Amount exceeds the withdrawal limit ₹" + withdrawLimit);
        } else if (amount > currentBalance) {
            System.out.println("Insufficient balance.");
        } else {
            currentBalance -= amount;
            System.out.println("Withdrawal successful! Remaining balance: ₹" + currentBalance);
        }
    }
}

// --------------------- Salary Account ---------------------
class SalaryAcc extends BankAccount {

    LocalDate date;

    SalaryAcc(int a, String n, double c) {
        super(a, n, c);
        date = LocalDate.of(2025, 11, 13);
    }

    void withdraw(double amount) {
        LocalDate today = LocalDate.now();
        Period pd = Period.between(date, today);
        int months = pd.getMonths() + (pd.getYears() * 12);

        if (months <= 2) {
            System.out.println("Cannot withdraw within 2 months of account opening.");
            return;
        }

        if (amount > currentBalance) {
            System.out.println("Insufficient balance.");
            return;
        }

        currentBalance -= amount;
        System.out.println("Withdrawal successful! Remaining balance: ₹" + currentBalance);
    }
}

// --------------------- Main Test Class ---------------------
class TestBankAcc {
    public static void main(String[] args) {
        System.out.println("------------------Main---------------------------");

        SavingAcc s1 = new SavingAcc(101, "Neha", 5000, 1000);
        s1.display();
        s1.withdraw(2000);

        System.out.println("------------------------------------------");

        CurrentAcc c1 = new CurrentAcc(102, "Diksha", 8000, 3000);
        c1.display();
        c1.withdraw(2500);

        System.out.println("------------------------------------------");

        SalaryAcc sal1 = new SalaryAcc(103, "Janvi", 10000);
        sal1.display();
        sal1.withdraw(1000);
    }
}