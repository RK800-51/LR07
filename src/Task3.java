public class Task3 {
    public int x;

    Task3(int x) {
        set(x);
    }

    public void set(int newValue) {
        x = newValue;
    }

    public String toString() {
        String className = getClass().getSimpleName();
        return className + " x:" + x;
    }

    public static void main(String[] args) {
        Task3 test = new Task3(10);
        Task3Sub1 test1 = new Task3Sub1(15, 'a');
        Task3Sub2 test2 = new Task3Sub2(100, 'c', "abc");

        System.out.println(test.toString());
        System.out.println(test1.toString());
        System.out.println(test2.toString());
    }
}

class Task3Sub1 extends Task3 {

    public char ch;

    Task3Sub1(int x, char ch) {
        super(x);
        this.ch = ch;
    }

    public void set(int x, char ch) {
        super.set(x);
        this.ch = ch;
    }

    public String toString() {
        String className = getClass().getSimpleName();
        return className + " x:" + super.x + " ch:" + ch;
    }

}

class Task3Sub2 extends Task3Sub1 {

    public String str;

    Task3Sub2(int x, char ch, String str) {
        super(x, ch);
        this.str = str;
    }

    public void set(int x, char ch, String str) {
        super.set(x, ch);
        this.str = str;
    }

    public String toString() {
        String className = getClass().getSimpleName();
        return className + " x:" + super.x + " ch:" + super.ch + " str:" + str;
    }

}