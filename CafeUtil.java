import java.util.ArrayList;


public class CafeUtil {
    public int getStreakGoal()
    {
        System.out.println("getting streak");
        
        int totalSum = 0;
        for(int sum = 1; sum <=10; sum++){
            // System.out.println(sum);
            totalSum += sum;
        }
        // System.out.println(totalSum);
        return totalSum;
        
    }
    public double getOrderTotal(double[] prices)
    {
        double total = 0;
        for(int i = 0; i < prices.length; i++){
            System.out.println(prices[i]);
            total += prices[i];
        }
        return total;
    }
    public void displayMenu(ArrayList<String> menuItems){
        for(int i = 0; i < menuItems.size(); i++){
            System.out.println(i + " " + menuItems.get(i));
            
        }
    }
    public void addCustomer(ArrayList<String> customers){
        System.out.println("Please enter your name: ");
        String userName = System.console().readLine();
        System.out.println("Hello, " + userName + " ");
        System.out.println("There are " + customers.size() + "people in front of you");
        customers.add(userName);
        System.out.println(customers);

    }
}