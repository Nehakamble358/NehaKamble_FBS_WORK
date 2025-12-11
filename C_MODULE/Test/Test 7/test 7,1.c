//1. Write a program to prompt user to enter userid and password. After verifying userid and
//password display a 4 digit random number and ask user to enter the same. If user enters the
//same number then show him success message otherwise failed.
#include <stdio.h>
#include <stdlib.h>

void main() {
    char uid[20], pass[20];
    int otp, userOtp;

    printf("Enter User ID: ");
    scanf("%s", uid);

    printf("Enter Password: ");
    scanf("%s", pass);

    // Check userid and password
    if (strcmp(uid, "admin") == 0 && strcmp(pass, "1234") == 0) {
        
        // Generate 4 digit random number
        srand(time(0));
        otp = rand() % 9000 + 1000;   // ensures 4-digit OTP

        printf("Your 4-digit number is: %d\n", otp);

        printf("Enter the same number: ");
        scanf("%d", &userOtp);

        if (userOtp == otp)
            printf("Login Success!\n");
        else
            printf("Login Failed! Incorrect number.\n");
    }
    else {
        printf("Invalid User ID or Password!\n");
    }

}