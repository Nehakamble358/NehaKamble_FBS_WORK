//2. WAP to initialize some amount in your account. 
//Then give choice to user for deposit or withdraw. 
//and display updated amount. Condition to withdraw 
//(if the balance is less than 3000 display
//can't withdraw the amount balance is not sufficient). ( using function )
#include <stdio.h>

int deposit(int balance, int amount) {
    balance = balance + amount;
    return balance;
}

int withdraw(int balance, int amount) {
    if (balance < 3000) {
        printf("Can't withdraw. Balance not sufficient.\n");
        return balance;      // no change
    } else {
        balance = balance - amount;
        return balance;
    }
}

int main() {
    int balance = 5000;   // initial amount
    int choice, amt;

    printf("1. Deposit\n2. Withdraw\n");
    printf("Enter your choice: ");
    scanf("%d", &choice);

    printf("Enter amount: ");
    scanf("%d", &amt);

    if (choice == 1) {
        balance = deposit(balance, amt);
    }
    else if (choice == 2) {
        balance = withdraw(balance, amt);
    }
    else {
        printf("Invalid Choice!\n");
    }

    printf("Updated Balance = %d", balance);

    return 0;
}
