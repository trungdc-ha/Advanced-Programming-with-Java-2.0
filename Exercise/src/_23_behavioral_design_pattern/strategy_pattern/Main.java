package _23_behavioral_design_pattern.strategy_pattern;

public class Main {
    public static void main(String[] args) {
        User user1 = new UserController(new XMLStorage());
        user1.store();
        User user2 = new UserController(new MySQLStorage());
        user2.store();
    }



}
