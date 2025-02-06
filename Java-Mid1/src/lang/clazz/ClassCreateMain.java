package lang.clazz;

public class ClassCreateMain {
    public static void main(String[] args) throws Exception {
        Class helloClass = Hello.class;
//        Class helloClass = Class.forName("lang.clazz.hello");

        Hello hello = (Hello) helloClass.getDeclaredConstructor().newInstance();
        String result = hello.Hello();
        System.out.println("result = " + result);
    }
}
