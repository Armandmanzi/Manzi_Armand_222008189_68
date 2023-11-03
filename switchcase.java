public class switchcase {
    public static void main(String[] args) {
        char category;
        category = 'a';
        switch (category) {
            case 'a':
                System.out.println("this category is for motorcycles");
                break;
            case 'b':
                System.out.println("this category is for small vehicles not more than 5 passengers");
                break;
            case 'c':
                System.out.println("this category is for medium vehicles of transport");
                break;
            case 'd':
                System.out.println("this category is for large vehicles more than 8 passengers");
                break;
            case 'e':
                System.out.println("this category is for large transport vehicles ");
                break;
            case 'f':
                System.out.println("this category is for tructers machines");
                break;
            default:
                System.out.println("invalid category");
                break;
        }

    }
}
