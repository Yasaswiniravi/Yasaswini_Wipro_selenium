package Assignment5;
/*4. Inner Class Encapsulation: Secure Locker
Encapsulate helper logic inside the class.
•	Implement a class Locker with private fields such as lockerId, isLocked, and passcode.
•	Use an inner private class SecurityManager to handle passcode verification logic.
•	Only expose public methods: lock(), unlock(String code), isLocked().
•	Password attempts should not leak verification logic externally—only success/failure.
•	Ensure no direct access to passcode or the inner SecurityManager from outside. */
public class Locker {
    private String lockerId;
    private boolean isLocked;
    private String passcode;
    public Locker(String lockerId, String passcode) {
        this.lockerId = lockerId;
        this.passcode = passcode;
        this.isLocked = false; 
    }
    private class SecurityManager {
        private boolean verify(String inputCode) {
            return passcode.equals(inputCode);
        }
    }
    public void lock() {
        isLocked = true;
        System.out.println("Locker is now locked.");
    }
    public void unlock(String code) {
        SecurityManager sm = new SecurityManager();
        if (sm.verify(code)) {
            isLocked = false;
            System.out.println("Locker unlocked successfully.");
        } else {
            System.out.println("Incorrect passcode. Access denied.");
        }
    }
    public boolean isLocked() {
        return isLocked;
    }
    public static void main(String[] args) {
        Locker myLocker = new Locker("L001", "1234");
        System.out.println("Is locker locked? " + myLocker.isLocked());
        myLocker.lock(); 
        System.out.println("Is locker locked? " + myLocker.isLocked());
        myLocker.unlock("0000"); 
        System.out.println("Is locker locked? " + myLocker.isLocked());
        myLocker.unlock("1234"); 
        System.out.println("Is locker locked? " + myLocker.isLocked());
    }
}

