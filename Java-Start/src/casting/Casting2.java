package casting;

public class Casting2 {
    public static void main(String[] args) {
        double doubleValue = 1.;
        int intValue = 0;

//        intValue = doubleValue; // 컴파일 오류 발생
        intValue = (int) doubleValue; // 컴파일 오류가 발생하지 않음
        System.out.println("intValue = " + intValue);
    }
}
