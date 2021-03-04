package isp.lab9.exercise2;

public class SensorController implements Observer {

    @Override
    public void update(Object event, double valueSensor) {
        System.out.println("Received event and valueSensor: " +event.toString()+" "+valueSensor);

    }
}
