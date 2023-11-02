public class compoundInterest {
    public static void main(String[] args) {
        BobLoan loan = new BobLoan(500000, 18, 3, 12);// creation of object
        double totalamount = loan.Amount();
        System.out.println("Mr Bob will have paid:" + totalamount);
    }
}

// global variables declaration
class BobLoan {
    double principal;
    double rate;
    double time;
    double monthsperyear;

    // method which assign its variables to global variables
    public BobLoan(double principal, double rate, double time, double monthsperyear) {
        this.principal = principal;
        this.rate = rate / 100;
        this.time = time;
        this.monthsperyear = monthsperyear;
    }

    // method to calculate compound interest
    public double Amount() {
        return principal * Math.pow(1 + (rate / monthsperyear), monthsperyear * time);
    }
}