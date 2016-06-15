public class HelloWorld {
    public static String hello(String name){
        // Perhaps it would be "safer" to do a null check separately first...
        String concat = name == null || name.isEmpty() ? "World" : name;
        return "Hello, " + concat + "!";
    }
}
