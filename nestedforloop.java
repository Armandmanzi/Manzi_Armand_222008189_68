public class nestedforloop {

    public static void main(String[] args) {
        int n = 9;

        // Nested loops to generate a multiplication table
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int product = i * j;
                System.out.print(i + " x " + j + " = " + product + "\t");
            }
            System.out.println(); // Move to the next row
        }
    }
}
