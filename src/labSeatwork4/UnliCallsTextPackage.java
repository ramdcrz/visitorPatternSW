package labSeatwork4;

import java.util.*;

public class UnliCallsTextPackage implements UnliCallTextOffer {

    private static Map<String, String> unliMap = new HashMap<>();

    static {
        unliMap.put("Smart", "No unlimited calls and text");
        unliMap.put("Globe", "Unlimited calls and text");
        unliMap.put("Dito", "Unlimited calls and text");
    }

    @Override
    public String showUnliCallsTextOffer(String telcoName, boolean unliCallText) {
        return unliMap.getOrDefault(telcoName, "Unknown offer");
    }
}