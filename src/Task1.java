public class Task1 {
    private String str;

    Task1(String str) {
        this.str = str;
    }

    public String toString() {
        String className = getClass().getSimpleName();
        return className + ":" + str;
    }

    public static void main(String[] args) {
        Task1Sub Task1Sub1 = new Task1Sub("test1");
        Task1Sub Task1Sub2 = new Task1Sub("test1", "test2");

        String result1 = Task1Sub1.toString();
        String result2 = Task1Sub2.toString();

        System.out.println(result1);
        System.out.println();
        System.out.println(result2);
    }
}

class Task1Sub extends Task1 {
    private String strSub;

    Task1Sub(String str) {
        super(str);
    }

    Task1Sub(String str1, String str2) {
        super(str1);
        strSub = str2;
    }

    public String toString() {
        String className = getClass().getSimpleName();
        return super.toString() + "\n" + className + ":" + strSub;
    }
}
