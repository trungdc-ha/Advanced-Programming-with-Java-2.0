package _23_behavioral_design_pattern.strategy_pattern;

public class MySQLStorage implements UserStorage {
    @Override
    public void store() {
        System.out.println("Exported a SQL file.");
    }
}
