class exceptionLimit  extends Exception {
    public exceptionLimit (String msg) {
        super(msg);
    }
}

public class LimitExceed {
    public static void main(String[] args) {
        try {
            checkSpeed(80);
            checkSpeed(160); 
        } catch (exceptionLimit  e) {
            System.out.println(e.getMessage());
        }
    }

    public static void checkSpeed(int speed) throws exceptionLimit  {
        if (speed > 120) {
            throw new exceptionLimit ("limit exceeded: " + speed + " km/h");
        }
        System.out.println("Speed limit: " + speed + " km/h");
    }
}
