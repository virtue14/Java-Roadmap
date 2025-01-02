package scope;

public class Scope2 {
    public static void main(String[] args) {
        int m = 20;
        for (int i = 0; i < 2; i++) { // 블록 내부, for문 내부
            System.out.println("for m =" + m);
            System.out.println("for i =" + i);
        } // i생존 종료
//        System.out.println("main i =" + i); // 오류, i에 접근 불가
        System.out.println("main m =" + m);
    }
}
