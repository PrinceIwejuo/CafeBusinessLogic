import java.util.ArrayList;

public class CafeUtilTest {
    public static void main(String[] args) {
        System.out.println("wassup twinn");
        CafeUtil appTest = new CafeUtil();
        // System.out.println(appTest.getStreakGoal());
        // double[] myArray = {4.0, 8.0, 8.0, 5.0, 9.0};
        // System.out.println(appTest.getOrderTotal(myArray)); 
        ArrayList<String> menuItems = new ArrayList<String>();
        menuItems.add("drip coffee");
        menuItems.add("cappucino");
        menuItems.add("latte");
        menuItems.add("mocha");
        // appTest.displayMenu(menuItems);
        ArrayList<String> customers = new ArrayList<String>();
        appTest.addCustomer(customers);
    }
}
