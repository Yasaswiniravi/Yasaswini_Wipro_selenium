package Assignment5;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
class TimeServer {
    public static interface Client {
        void updateTime(LocalDateTime now);
    }
    private List<Client> clients = new ArrayList<>();
    public void registerClient(Client client) {
        clients.add(client);
    }
    public void notifyClients() {
        LocalDateTime now = LocalDateTime.now();
        for (Client c : clients) {
            c.updateTime(now);
        }
    }
}
class DigitalClock implements TimeServer.Client {
    public void updateTime(LocalDateTime now) {
        System.out.println("DigitalClock: Current time is " + now);
    }
}
class AnalogClock implements TimeServer.Client {
    public void updateTime(LocalDateTime now) {
        System.out.println("AnalogClock: Current time is " + now);
    }
}
public class CallbackHandling {
    public static void main(String[] args) {
        TimeServer server = new TimeServer();
        server.registerClient(new DigitalClock());
        server.registerClient(new AnalogClock());
        server.notifyClients();
    }
}
