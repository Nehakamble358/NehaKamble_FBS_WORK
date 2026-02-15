#include <stdio.h>
#include <string.h>
#include <stdlib.h>

#define MAX 100

struct Book {
    int id;
    char name[50];
    char author[50];
    char category[30];
    float price;
    float rating;
};

struct Book *library;
int count = 0;


int isDuplicateId(int id) {
    for(int i = 0; i < count; i++) {
        if(library[i].id == id) {
            return 1;  
        }
    }
    return 0; 
}


void addBook() {
    if(count >= MAX) {
        printf("Library full! Cannot add more books.\n");
        return;
    }

    int id;
    while(1) {
        printf("Enter Book ID: ");
        scanf("%d", &id);

        if(isDuplicateId(id)) {
            printf("Duplicate ID! Not allowed.\n");
        } else {
            break; 
        }
    }
    library[count].id = id;

    printf("Enter Book Name: ");
    scanf(" %[^\n]", library[count].name);

    printf("Enter Author Name: ");
    scanf(" %[^\n]", library[count].author);

    printf("Enter Category: ");
    scanf(" %[^\n]", library[count].category);

    printf("Enter Price: ");
    scanf("%f", &library[count].price);

    printf("Enter Rating: ");
    scanf("%f", &library[count].rating);

    count++;
    printf("Book added successfully!\n");
}


void removeBook() {
    int id, found = -1;
    printf("Enter Book ID to remove: ");
    scanf("%d", &id);

    for(int i=0; i<count; i++) {
        if(library[i].id == id) {
            found = i;
            break;
        }
    }

    if(found == -1) {
        printf("Book not found!\n");
    } else {
        for(int i=found; i<count-1; i++) {
            library[i] = library[i+1];
        }
        count--;
        printf("Book removed successfully!\n");
    }
}


void searchBookById() {
    int id;
    printf("Enter Book ID to search: ");
    scanf("%d", &id);

    for(int i=0; i<count; i++) {
        if(library[i].id == id){
            printf("Found: ID=%d, Name=%s, Author=%s, Category=%s, Price=%.2f, Rating=%.1f\n",
                library[i].id, library[i].name, library[i].author, library[i].category,
                library[i].price, library[i].rating);
            return;
        }
    }
    printf("Book not found!\n");
}

// Search book by Name
void searchBookByName() {
    char name[50];
    printf("Enter Book Name to search: ");
    scanf(" %[^\n]", name);

    for(int i=0; i<count; i++){
        if(strcmp(library[i].name, name) == 0) {
            printf("Found: ID=%d, Name=%s, Author=%s, Category=%s, Price=%.2f, Rating=%.1f\n",
                library[i].id, library[i].name, library[i].author, library[i].category,
                library[i].price, library[i].rating);
            return;
        }
    }
    printf("Book not found!\n");
}

void showAuthorBooks() {
    char author[50];
    int found = 0;
    printf("Enter Author Name: ");
    scanf(" %[^\n]", author);

    for(int i=0; i<count; i++) {
        if(strcmp(library[i].author, author) == 0) {
            printf("ID=%d, Name=%s, Category=%s, Price=%.2f, Rating=%.1f\n",
                   library[i].id, library[i].name, library[i].category,
                   library[i].price, library[i].rating);
            found = 1;
        }
    }
    if(!found) printf("No books found by this author.\n");
}


void showCategoryBooks() {
    char category[30];
    int found = 0;
    printf("Enter Category: ");
    scanf(" %[^\n]", category);

    for(int i=0; i<count; i++) {
        if(strcmp(library[i].category, category) == 0) {
            printf("ID=%d, Name=%s, Author=%s, Price=%.2f, Rating=%.1f\n",
                   library[i].id, library[i].name, library[i].author,
                   library[i].price, library[i].rating);
            found = 1;
        }
    }
    if(!found) printf("No books found in this category.\n");
}

// Update book (Price/Rating)
void updateBook() {
    int id, choice, found = -1;
    printf("Enter Book ID to update: ");
    scanf("%d", &id);

    for(int i=0; i<count; i++) {
        if(library[i].id == id) {
            found = i;
            break;
        }
    }

    if(found == -1) {
        printf("Book not found!\n");
        return;
    }

    printf("Update: 1. Price  2. Rating\nEnter choice: ");
    scanf("%d", &choice);
    if(choice == 1) {
        printf("Enter new Price: ");
        scanf("%f", &library[found].price);
    } else if(choice == 2) {
        printf("Enter new Rating: ");
        scanf("%f", &library[found].rating);
    } else {
        printf("Invalid choice!\n");
        return;
    }
    printf("Book updated successfully!\n");
}


void displaySortedBooks() {
    struct Book temp;

    
    for(int i=0; i<count-1; i++) {
        for(int j=i+1; j<count; j++) {
            if(library[i].price < library[j].price) {
                temp = library[i];
                library[i] = library[j];
                library[j] = temp;
            }
        }
    }

    printf("\nTop 3 Books by Price:\n");
    for(int i=0; i<count && i<3; i++) {
        printf("ID=%d, Name=%s, Price=%.2f\n", library[i].id, library[i].name, library[i].price);
    }

   
    for(int i=0; i<count-1; i++) {
        for(int j=i+1; j<count; j++) {
            if(library[i].rating < library[j].rating) {
                temp = library[i];
                library[i] = library[j];
                library[j] = temp;
            }
        }
    }

    printf("\nTop 3 Books by Rating:\n");
    for(int i=0; i<count && i<3; i++) {
        printf("ID=%d, Name=%s, Rating=%.1f\n", library[i].id, library[i].name, library[i].rating);
    }
}


void displayAllBooks() {
    if(count == 0) {
        printf("No books in library.\n");
        return;
    }
    printf("\nAll Books in Library:\n");
    for(int i=0; i<count; i++) {
        printf("ID=%d, Name=%s, Author=%s, Category=%s, Price=%.2f, Rating=%.1f\n",
               library[i].id, library[i].name, library[i].author,
               library[i].category, library[i].price, library[i].rating);
    }
}


int main() {
    int choice;
    library = malloc(MAX * sizeof(struct Book));
    if(library == NULL) {
        printf("Memory allocation failed!\n");
        return 1;
    }

    do {
        printf("\n===== Book Management System =====\n");
        printf("1. Add Book\n");
        printf("2. Remove Book\n");
        printf("3. Search Book by ID\n");
        printf("4. Search Book by Name\n");
        printf("5. Show Books by Author\n");
        printf("6. Show Books by Category\n");
        printf("7. Update Book (Price/Rating)\n");
        printf("8. Display Sorted Books (by Price & Rating)\n");
        printf("9. Display All Books\n");
        printf("0. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);

        switch(choice) {
            case 1: addBook();
			 break;
            case 2: removeBook(); 
			break;
            case 3: searchBookById(); 
			break;
            case 4: searchBookByName();
			 break;
            case 5: showAuthorBooks(); 
			break;
            case 6: showCategoryBooks(); 
			break;
            case 7: updateBook(); 
			break;
            case 8: displaySortedBooks();
			 break;
            case 9: displayAllBooks(); 
			break;
            case 0: printf("Exiting...\n"); 
			break;
            default: printf("Invalid choice! Try again.\n");
        }
    } while(choice != 0);

    free(library);
    return 0;
}
