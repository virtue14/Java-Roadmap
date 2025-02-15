package nested;

public class ShodwingMain {

    public int value = 1;

    class Inner {
        public int value = 2;

        void go() {
            int value = 3;
            System.out.println("value = " + value);
            System.out.println("this.value = " + this.value);
            System.out.println("ShodwingMain.value" + ShodwingMain.this.value);
        }
    }

    public static void main(String[] args) {
        ShodwingMain main = new ShodwingMain();
        Inner inner = main.new Inner();
        inner.go();
    }
}
