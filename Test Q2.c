// 2 
#include <stdio.h>
int deposit(int balance) {
    int amount;
    printf("Enter amount to deposit: ");
    scanf("%d", &amount);
    balance += amount;
    return balance;
}

int withdraw(int balance) {
    int amount;
    if (balance < 3000) {
        printf("Can't withdraw, balance is less than 3000.\n");
        return balance;
    }
    printf("Enter amount to withdraw: ");
    scanf("%d", &amount);
    if (balance - amount < 3000) {
        printf("Can't withdraw, balance would go below 3000.\n");
    } else {
        balance -= amount;
        printf("Withdrawal successful!\n");
    }
    return balance;
}

void main() {
    int balance = 5000;   // Initial balance
    int choice;

    printf("Initial Balance: %d\n", balance);
    printf("1. Deposit\n2. Withdraw\nEnter choice: ");
    scanf("%d", &choice);

    if (choice == 1) {
        balance = deposit(balance);
    } else if (choice == 2) {
        balance = withdraw(balance);
    } else {
        printf("Invalid choice!\n");
    }

    printf("Updated Balance: %d\n", balance);
}