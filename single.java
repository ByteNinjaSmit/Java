import java.util.Scanner;


class BaseClass {
    public float cgpa;
    
    // Method to accept CGPA
    public void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter CGPA: ");
        cgpa = sc.nextFloat();
        sc.close();
    }
}


class DerivedClass extends BaseClass {
    public float percentage;
    
    // Method to calculate and display the percentage
    public void showPer() {
        percentage = cgpa * 10; // Typically, CGPA to percentage is CGPA * 10
        System.out.println("Your Percentage is: " + percentage + "%");
    }
}

// Main class to run the program
public class single {
    public static void main(String[] args) {
        DerivedClass d = new DerivedClass();
        d.accept();
        d.showPer();
    }
}

