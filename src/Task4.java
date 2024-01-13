public class Task4 {
    public char ch;

    Task4(char ch) {
        this.ch = ch;
    }

    Task4(Task4 fourBase) {
        this.ch = fourBase.ch;
    }


    public static void main(String[] args) {
        Task4 fourBase = new Task4('a');
        Task4Sub1 fourDerivedOne = new Task4Sub1('d', "abcd");
        Task4Sub2 fourDerivedTwo = new Task4Sub2('f', "asdf", 555);

        Task4 fourBaseCopy = fourBase;
        Task4Sub1 fourDerivedOneCopy = fourDerivedOne;
        Task4Sub2 fourDerivedTwoCopy = fourDerivedTwo;

    }

}

class Task4Sub1 extends Task4 {

    public String str;

    Task4Sub1(char ch, String str) {
        super(ch);
        this.str = str;
    }

    Task4Sub1(Task4Sub1 fourDerivedOne) {
        super(fourDerivedOne.ch);
        this.str = fourDerivedOne.str;
    }

}

class Task4Sub2 extends Task4Sub1 {

    public int x;

    Task4Sub2(char ch, String str, int x) {
        super(ch, str);
        this.x = x;
    }

    Task4Sub2(Task4Sub2 fourDerivedTwo) {
        super(fourDerivedTwo.ch, fourDerivedTwo.str);
        this.x = fourDerivedTwo.x;
    }
}