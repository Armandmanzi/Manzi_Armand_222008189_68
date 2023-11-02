public class simpleinterest {
    public double interest(double principle, double rate, double time) {
        return (principle * rate * time) / 100;
    }

    public static void main(String[] args) {
        simpleinterest interestObject = new simpleinterest();
        double totalsimpleinterest = interestObject.interest(100000, 5, 5);
        System.out.println("the simple interest of Mr Bob is:" + totalsimpleinterest);
    }
}
