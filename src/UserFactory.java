public class UserFactory {
    private static int idCounter = 1;

    public User createUser(String name) {
        return new User(idCounter++, name);
    }
}
