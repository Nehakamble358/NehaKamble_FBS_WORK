package downcasting;

interface Student {
    void display();
}

// abstract class
abstract class ExamStudent implements Student {

    int rollNo;
    String name;
    double marks;

    ExamStudent() {}

    ExamStudent(int rollNo, String name, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    public void display() {
        System.out.println("Roll No : " + rollNo);
        System.out.println("Name : " + name);
        System.out.println("Marks : " + marks);
    }
}

// Science Student
class Science extends ExamStudent {

    double practicalMarks;

    Science(int rollNo, String name, double marks, double practicalMarks) {
        super(rollNo, name, marks);
        this.practicalMarks = practicalMarks;
    }

    public void display() {
        super.display();
        System.out.println("Practical : " + practicalMarks);
    }
}

// Commerce Student
class Commerce extends ExamStudent {

    double accountsMarks;

    Commerce(int rollNo, String name, double marks, double accountsMarks) {
        super(rollNo, name, marks);
        this.accountsMarks = accountsMarks;
    }

    public void display() {
        super.display();
        System.out.println("Accounts : " + accountsMarks);
    }
}

// Arts Student
class Arts extends ExamStudent {

    double historyMarks;

    Arts(int rollNo, String name, double marks, double historyMarks) {
        super(rollNo, name, marks);
        this.historyMarks = historyMarks;
    }

    public void display() {
        super.display();
        System.out.println("History : " + historyMarks);
    }
}

// Main class
class DemoStudent {

    public static void main(String[] args) {

        calculateResult(new Science(1, "Ruchika", 65, 25));
        calculateResult(new Commerce(2, "Achal", 50, 30));
        calculateResult(new Arts(3, "Saloni", 60, 28));
    }

    static void calculateResult(Student s) {

        if (s instanceof Science) {
            Science sc = (Science) s;   
            sc.marks += sc.practicalMarks;
            System.out.println("\nScience Result Calculated\n");
            sc.display();
        }
        else if (s instanceof Commerce) {
            Commerce c = (Commerce) s;  
            c.marks += c.accountsMarks;
            System.out.println("\nCommerce Result Calculated\n");
            c.display();
        }
        else if (s instanceof Arts) {
            Arts a = (Arts) s;   
            a.marks += a.historyMarks;
            System.out.println("\nArts Result Calculated\n");
            a.display();
        }
    }
}
