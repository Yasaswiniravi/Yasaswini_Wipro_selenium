package assignment7;

class Message {
    private String content;
    private boolean hasMessage = false;
    public synchronized String readMessage() {
        while (!hasMessage) { 
            try { wait(); } catch (InterruptedException e) {}
        }
        hasMessage = false; 
        notifyAll(); 
        return content;
    }
    public synchronized void writeMessage(String message) {
        while (hasMessage) { 
            try { wait(); } catch (InterruptedException e) {}
        }
        content = message;
        hasMessage = true; 
        notifyAll(); 
    }
}
class Writer extends Thread {
    private Message message;
    Writer(Message message) {
        this.message = message;
    }
    public void run() {
        String[] texts = { "Hello", "This is inter-thread", "communication", "done!", "bye" };
        for (String text : texts) {
            message.writeMessage(text);
            try { Thread.sleep(500); } catch (InterruptedException e) {}
        }
    }
}
class Reader extends Thread {
    private Message message;

    Reader(Message message) {
        this.message = message;
    }
    public void run() {
        String msg;
        do {
            msg = message.readMessage();
            System.out.println("Read: " + msg);
        } while (!msg.equals("bye"));
    }
}
public class waitnotifyalldemo {
    public static void main(String[] args) {
        Message sharedMessage = new Message();
        Writer writer = new Writer(sharedMessage);
        Reader reader1 = new Reader(sharedMessage);
        Reader reader2 = new Reader(sharedMessage); 
        writer.start();
        reader1.start();
        reader2.start();
    }
}

 