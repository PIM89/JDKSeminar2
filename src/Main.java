public class Main {
    public static void main(String[] args) {
        Fullstack fullstack = new Fullstack("Вася");
        fullstack.backenderWork();
        fullstack.frontenderWork();
        System.out.println();

        Developer developer = new Frontender("Олег");
        if (developer instanceof Frontender) {
            ((Frontender) developer).developGUI();
        }
    }
}