package enumration.test;

public enum AuthGrade {
    GUEST(1, "손님"),
    LOGIN(2, "로그인 회원"),
    ADMIN(3, "관리자");


    private final int level;
    private final String disceiption;

    AuthGrade(int level, String disceiption) {
        this.level = level;
        this.disceiption = disceiption;
    }

    public int getLevel() {
        return level;
    }

    public String getDisceiption() {
        return disceiption;
    }
}
