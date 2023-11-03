public class ifelse {

    public static void main(String[] args) {
        int iphoneversion = 11;
        if (iphoneversion == 10) {
            System.out.println("you are allowed ios 16.5");
        } else if (iphoneversion == 11) {
            System.out.println("you are allowed ios 17.2");
        } else if (iphoneversion == 12) {
            System.out.println("you are allowed ios 17.5");
        } else if (iphoneversion == 13) {
            System.out.println("you are allowed ios 17.7");
        } else {
            System.out.println("you are not allowed any version");
        }
    }
}