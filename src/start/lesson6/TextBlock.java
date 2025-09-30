package start.lesson6;

public class TextBlock {
    static void main() {
        String name1 = "Vasiliy";
        String name2 = "Petr";
        String text = """
                Hello, what is your name?
                My name is %s, what is yours?
                My name is %s.""".formatted(name1, name2);
        System.out.println(text);
    }
}
