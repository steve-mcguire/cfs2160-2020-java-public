package Week22.animal;

public class AnimalMain {
    public static void main(String[] args) {
        Eagle eagle = new Eagle(2);
        System.out.println(eagle.hunt());

        Snake snake = new Snake(0);
        System.out.println(snake.flee());
        System.out.println(snake.hunt());

        Mouse mouse = new Mouse(4);
        System.out.println(mouse.flee());
    }
}
