public class Task5 {
    protected String str;

    Task5(String str) {
        this.str = str;
    }

    public String toString() {
        String className = getClass().getSimpleName();
        return className + " str:" + str;
    }

    public static void main(String[] args) {
        Task5 fiveBase = new Task5("FiveBase");
        Task5Sub1 fiveDerivedOne = new Task5Sub1("FiveDerivedOne", 10);
        Task5Sub2 fiveDerivedTwo = new Task5Sub2("FiveDerivedTwo", 'a');

        System.out.println(fiveBase.toString());
        System.out.println(fiveDerivedOne.toString());
        System.out.println(fiveDerivedTwo.toString());


        Task5 fiveBaseDerived = new Task5Sub1("FiveBase FiveDerivedOne", 100500);

        System.out.println();
        System.out.println(fiveBaseDerived.toString());
    }
}

class Task5Sub1 extends Task5 {

    protected int x;

    Task5Sub1(String str, int x) {
        super(str);
        this.x = x;
    }

    public String toString() {
        String className = getClass().getSimpleName();
        return className + " str:" + super.str + " x:" + x;
    }
}

class Task5Sub2 extends Task5 {

    protected char ch;

    Task5Sub2(String str, char ch) {
        super(str);
        this.ch = ch;
    }

    public String toString() {
        String className = getClass().getSimpleName();
        return className + " str:" + super.str + " ch:" + ch;
    }

}