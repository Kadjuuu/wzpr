import java.time.LocalDateTime;

public class WorkoutSession {
    private int sessionId;
    private int userId;
    private LocalDateTime startTime;
    private LocalDateTime endTime;

    public WorkoutSession(int sessionId, int userId, LocalDateTime startTime, LocalDateTime endTime) {
        this.sessionId = sessionId;
        this.userId = userId;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public int getSessionId() {
        return sessionId;
    }

    public int getUserId() {
        return userId;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    @Override
    public String toString() {
        return "WorkoutSession{sessionId=" + sessionId + ", userId=" + userId + ", startTime=" + startTime + ", endTime=" + endTime + "}";
    }
}
