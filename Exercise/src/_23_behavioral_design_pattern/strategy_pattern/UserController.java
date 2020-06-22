package _23_behavioral_design_pattern.strategy_pattern;

public class UserController extends User {
    private UserStorage userStorage;
    public UserController(UserStorage userStorage) {
        this.userStorage=userStorage;
    }
    public void store(){
        userStorage.store();
    }
}
