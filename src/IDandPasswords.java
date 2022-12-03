import java.util.HashMap;

public class IDandPasswords {

    HashMap<String, String> loginInfo = new HashMap<>();

    IDandPasswords() {

        loginInfo.put("Bro", "pizza");
        loginInfo.put("Brometheus", "PASSWORD");
        loginInfo.put("BroCode", "abc123");
    }

    protected HashMap getLoginInfo() {
        return loginInfo;
    }
}
