public class string {
    public static void main(String[] args) {
        String name = "Risma";
        System.out.println(name);

        // get the char
        char secondChar = name.charAt(2);
        System.out.println(secondChar);

        // use special character
        // ref: https://www.informit.com/articles/article.aspx?p=30241&seqNum=3
        String greeting = "Hello, Risma\nHow are you?";
        System.out.println(greeting);

        // format
        System.out.println(String.format("Hello %s", name));

        // get the length of a string
        System.out.println(greeting.length());
    }
}
