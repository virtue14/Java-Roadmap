package final1;

public class MemberMain {
    public static void main(String[] args) {
        Member member = new Member("myId", "park");
        member.print();
        member.changeData("myId2", "kim");
        member.print();
    }
}
