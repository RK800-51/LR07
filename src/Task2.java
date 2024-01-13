public class Task2 {
    private String str;

    Task2(String str) {
        set(str);
    }

    public void set() {

    }

    public int set(String newValue) {
        str = newValue;
        return newValue.length();
    }

    public static void main(String[] args) {
        Task2 test = new Task2("init super");
        Task2Sub test1 = new Task2Sub("init sub", 10);
    }
}

class Task2Sub extends Task2 {
        public int x;

        Task2Sub(String str, int x) {
            super(str);
            this.x = x;
        }

        public void set() {

        }

        public int set(String newValue) {
            super.set(newValue);
            return newValue.length();
        }

        public void set(int newValue) {
            x = newValue;
        }

        public void set(String str, int x) {
            super.set(str);
            this.x = x;
        }

        public void description() {
            //super.description();
            System.out.printf("x:%s\n", x);
        }

    }
