package Week22;

public class Main {
    public static void main(String[] args) {
        Eagle e = new Eagle(2);
        Snake s = new Snake(0);
        Mouse m = new Mouse(4);

        System.out.println(e.prey());
        System.out.println(m.flee());
        System.out.println(s.flee());
        System.out.println(s.prey());

    }
}
