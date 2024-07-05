import java.time.LocalDateTime;

public class WorkoutSessionBuilder {
    private static int sessionIdCounter = 1;

    public WorkoutSession buildSession(int userId, LocalDateTime startTime, LocalDateTime endTime) {
        return new WorkoutSession(sessionIdCounter++, userId, startTime, endTime);
    }
}
