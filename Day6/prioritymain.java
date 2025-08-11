package Assignment6;
enum PriorityLevel {
    LOW(1),
    MEDIUM(2),
    HIGH(3),
    CRITICAL(4);
    private int severityCode;
    PriorityLevel(int code) {
        this.severityCode = code;
    }
    public int getSeverityCode() {
        return severityCode;
    }

    public boolean isUrgent() {
        return severityCode >= 3; 
    }
}
public class prioritymain {
    public static void main(String[] args) {
        for (PriorityLevel level : PriorityLevel.values()) {
            System.out.println(
                level + " | Severity Code: " + level.getSeverityCode() +
                " | Urgent? " + level.isUrgent()
            );
        }
    }
}
