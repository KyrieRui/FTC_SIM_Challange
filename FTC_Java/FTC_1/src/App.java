public class App {
    public static void main(String[] args) throws Exception {
        int x = 5;
        double y = 5.5;
        boolean z = true;
        String s = "Hello, FTC!";

        // if (x < 10) {
        //     System.out.println("x is:" + x);
        // } else {
        //     System.out.println("y is:" + y);
        // }

        for (int i = 0; i < 10; i++) {
            if (x < 10) {
                System.out.println("x is:" + x);
            } else {
                System.out.println("y is:" + y);
            }
            x++;
        }
    }
}
