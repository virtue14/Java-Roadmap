package array;

public class Array1Ref4 {
    public static void main(String[] args) {
//        int[] students; // 배열 변수 선언
//        students = new int[5];// 배열 생성

        int[] students = {90, 80, 70, 60, 50, 40, 30, 20, 10};

        // 변수 값 사용
        for (int i = 0; i < students.length; i++) {
            System.out.println("학생" + (i + 1) + "의 점수: " + students[i]);

        }

    }
}
