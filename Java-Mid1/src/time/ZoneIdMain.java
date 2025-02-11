package time;

import java.time.ZoneId;
import java.util.Set;

public class ZoneIdMain {
    public static void main(String[] args) {
        for (String availableString : ZoneId.getAvailableZoneIds()) {
            System.out.println("availableString = " + availableString);
            ZoneId zoneId = ZoneId.of(availableString);
            System.out.println(zoneId + " | " + zoneId.getRules());
        }

        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println("ZoneId.systemDefault = " + zoneId);

        ZoneId zoneId1 = ZoneId.of("Asia/Seoul");
        System.out.println("seoulZoneId = " + zoneId1);
    }
}
