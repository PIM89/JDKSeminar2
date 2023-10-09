public class Frontender extends Developer implements FrontenderInterface {

    Frontender(String name) {
        this.name = name;
    }

    @Override
    public void frontenderWork() {
        System.out.println(name + " программирует экранные формы!");
    }

    public void developGUI() {
        System.out.println(name + " cоздаёт графический интерфейс!");
    }
}
