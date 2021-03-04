package isp.lab9.exercise3;


import static isp.lab9.exercise3.DoorStatus.CLOSE;
import static isp.lab9.exercise3.DoorStatus.OPEN;

public class Door {

    DoorStatus status;

    public void lockDoor() {
        this.status = CLOSE;
    }

    public void unlockDoor() {
        this.status = OPEN;
    }

    public DoorStatus getStatus() {
        return status;
    }

    public void setStatus(DoorStatus status) {
        this.status = status;
    }
}
