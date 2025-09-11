//3.
#include <stdio.h>
struct Task {
    int id;
    char description[100];
    char status[20];
};

struct Task tasks[20];
int taskCount = 0;

// Function to read string safely
void readString(char *str, int size) {
    scanf(" %[^\n]", str);   // reads input including spaces
}

// Add Task
void addTask() {
    if (taskCount >= 20) {
        printf("Task list is full!\n");
        return;
    }
    printf("Enter Task ID: ");
    scanf("%d", &tasks[taskCount].id);

    printf("Enter Description: ");
    readString(tasks[taskCount].description, 100);

    printf("Enter Status: ");
    readString(tasks[taskCount].status, 20);

    taskCount++;
    printf("Task added!\n");
}

// Update Task
void updateTask() {
    if (taskCount == 0) {
        printf("No tasks available to update!\n");
        return;
    }

    int id, i, found = 0;
    printf("Enter Task ID to update: ");
    scanf("%d", &id);

    for (i = 0; i < taskCount; i++) {
        if (tasks[i].id == id) {
            found = 1;
            int choice;
            printf("1. Update Description\n2. Update Status\nEnter choice: ");
            scanf("%d", &choice);

            if (choice == 1) {
                printf("Enter new description: ");
                readString(tasks[i].description, 100);
                printf("Description updated!\n");
            } else if (choice == 2) {
                printf("Enter new status: ");
                readString(tasks[i].status, 20);
                printf("Status updated!\n");
            } else {
                printf("Invalid choice!\n");
            }
            break;
        }
    }

    if (!found) {
        printf("Task with ID %d not found!\n", id);
    }
}

// Display Tasks
void displayTasks() {
    if (taskCount == 0) {
        printf("No tasks yet!\n");
        return;
    }
    printf("\n--- To Do List ---\n");
    int i;
    for (i = 0; i < taskCount; i++) {
        printf("ID: %d\nDescription: %s\nStatus: %s\n",
               tasks[i].id, tasks[i].description, tasks[i].status);
    }
}

int main() {
    int choice;
    do {
        printf("\n1. Add Task\n2. Update Task\n3. Display Tasks\n4. Exit\n");
        printf("Enter choice: ");
        scanf("%d", &choice);

        if (choice == 1) addTask();
        else if (choice == 2) updateTask();
        else if (choice == 3) displayTasks();
    } while (choice != 4);

    return 0;
}