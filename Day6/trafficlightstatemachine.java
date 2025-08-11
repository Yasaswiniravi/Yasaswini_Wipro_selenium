package Assignment6;
interface State {
    State next(); 
}
enum TrafficLight implements State {
    RED {
        public State next() {
            return GREEN;
        }
    },
    GREEN {
        public State next() {
            return YELLOW;
        }
    },
    YELLOW {
        public State next() {
            return RED;
        }
    };
}
public class trafficlightstatemachine {
    public static void main(String[] args) {
        State light = TrafficLight.RED; 
        for (int i = 0; i < 6; i++) {
            System.out.println(light);
            light = light.next(); 
        }
    }
}
