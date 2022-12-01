public class numericMethods {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        System.out.println(Integer.max(x, y)); // 20
        System.out.println(Integer.compare(x, y)); // -1

        String number = "200";
        Integer a = Integer.valueOf(number); // valueOf return an Integer object
        int b = Integer.parseInt(number); // parseInt return an integer value of the argument

        System.out.println(a);
        System.out.println(b);
    }
}
