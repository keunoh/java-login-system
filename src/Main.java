import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        IDandPasswords iDandPasswords = new IDandPasswords();

        HashMap loginInfo = iDandPasswords.getLoginInfo();

        LoginPage loginPage = new LoginPage(loginInfo);
    }
}