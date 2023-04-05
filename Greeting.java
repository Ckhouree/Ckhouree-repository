public class Greeting {
    public static void main(String[] args) {
        String[] names = {"John", "Jane", "Tom", "Jerry"};
        for (String name : names) {
            if (name.startsWith("J") || name.startsWith("j")) {
                System.out.println("Goodbye " + name);
            } else {
                System.out.println("Hello " + name);
            }
        }
    }
}
