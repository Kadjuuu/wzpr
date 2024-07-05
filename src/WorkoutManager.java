import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime;

public class WorkoutManager {
    private List<User> users = new ArrayList<>();
    private List<WorkoutSession> sessions = new ArrayList<>();
    private UserFactory userFactory = new UserFactory();
    private WorkoutSessionBuilder sessionBuilder = new WorkoutSessionBuilder();

    public User registerUser(String name) {
        User user = userFactory.createUser(name);
        users.add(user);
        return user;
    }

    public WorkoutSession recordSession(int userId, LocalDateTime startTime, LocalDateTime endTime) {
        WorkoutSession session = sessionBuilder.buildSession(userId, startTime, endTime);
        sessions.add(session);
        return session;
    }

    public List<WorkoutSession> getSessionHistory(int userId) {
        List<WorkoutSession> userSessions = new ArrayList<>();
        for (WorkoutSession session : sessions) {
            if (session.getUserId() == userId) {
                userSessions.add(session);
            }
        }
        return userSessions;
    }

    public List<User> getUsers() {
        return users;
    }
}
