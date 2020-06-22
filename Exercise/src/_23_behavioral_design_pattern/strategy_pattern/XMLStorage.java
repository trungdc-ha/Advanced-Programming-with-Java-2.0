package _23_behavioral_design_pattern.strategy_pattern;

public class XMLStorage implements UserStorage {
    @Override
    public void store() {
        System.out.println("Exported a XML file");
    }
}
