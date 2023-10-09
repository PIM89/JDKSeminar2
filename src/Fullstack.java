public class Fullstack extends Developer implements BackenderInterface, FrontenderInterface {

    Fullstack(String name){
        this.name = name;
    }
    @Override
    public void backenderWork() {
        System.out.println(name + " пишет серверный код!");
    }
    @Override
    public void frontenderWork() {
        System.out.println(name + " программирует экранные формы!");
    }
}
