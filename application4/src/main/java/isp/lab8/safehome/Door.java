package isp.lab8.safehome;

import static isp.lab8.safehome.DoorStatus.*;

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
