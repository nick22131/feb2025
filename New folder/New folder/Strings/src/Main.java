public class Main {
    public static void main(String[] args){
        // String message = new String() long
        String message = "  hello world" + "!!" ;
                System.out.println(message);
        System.out.println(message.startsWith("!!"));
        System.out.println(message.endsWith("!!"));
        System.out.println(message.length());
        System.out.println(message.indexOf("e"));
        System.out.println(message.replace("!", "*"));
        // target\replacement are parameters and i & * are arguments
        System.out.println(message);
        // note that here we can't mutate strings
        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());
        System.out.println(message.trim());

    }
}
