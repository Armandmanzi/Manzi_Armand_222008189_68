// Define an interface E that specifies methods for loan eligibility and setting retirement age.
interface E {
    boolean isEligibleForLoan();

    void setRetirementAge();
}

// Create a base class Employees with attributes age, salary, and experience.
class Employees {
    double age;
    double salary;
    double experience;

    // Constructor to set initial values for age, salary, and experience.
    Employees(double age, double salary, double experience) {
        this.age = age;
        this.salary = salary;
        this.experience = experience;
    }

    // Method to display employee information.
    void employeesInfo() {
        System.out.println("Employee age: " + age + ", Salary: " + salary + ", Experience: " + experience);
    }
}

// Create a class Loan that extends Employees and implements the E interface.
class Loan extends Employees implements E {
    Loan(double age, double salary, double experience) {
        super(age, salary, experience);
    }

    // Implement the isEligibleForLoan method to check loan eligibility.
    @Override
    public boolean isEligibleForLoan() {
        return salary > 40000 && experience > 2;
    }

    // Implement the setRetirementAge method for loan applicants.
    @Override
    public void setRetirementAge() {
        System.out.println("Retirement age is set to 68 years for loan applicants.");
    }
}

// Create a class Retirement that extends Employees and implements the E
// interface.
class Retirement extends Employees implements E {
    Retirement(double age, double salary, double experience) {
        super(age, salary, experience);
    }

    // Implement the isEligibleForLoan method, not applicable for retirement
    // applicants.
    @Override
    public boolean isEligibleForLoan() {
        return false;
    }

    // Implement the setRetirementAge method for retirement applicants.
    @Override
    public void setRetirementAge() {
        if (experience >= 15) {
            System.out.println("Retirement age is set to 62 years for experienced employees.");
        } else {
            System.out.println("Retirement age is set to 65 years for other employees.");
        }
    }
}

public class EmployeeProgram {
    public static void main(String[] args) {
        // Create a Loan applicant and display information, check loan eligibility, and
        // set retirement age.
        Loan loanApplicant = new Loan(40, 45000, 3);
        loanApplicant.employeesInfo();
        boolean loanEligibility = loanApplicant.isEligibleForLoan();
        System.out.println("Eligible for Loan: " + loanEligibility);
        loanApplicant.setRetirementAge();

        // Create a Retirement applicant and display information, check loan
        // eligibility, and set retirement age.
        Retirement retirementApplicant = new Retirement(55, 55000, 20);
        retirementApplicant.employeesInfo();
        boolean retirementEligibility = retirementApplicant.isEligibleForLoan();
        System.out.println("Eligible for Loan: " + retirementEligibility);
        retirementApplicant.setRetirementAge();
    }
}
