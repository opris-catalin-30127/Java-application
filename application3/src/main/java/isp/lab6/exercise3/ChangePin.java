package isp.lab6.exercise3;

public class ChangePin {
    private String oldPin;

    private String newPin;

    public ChangePin(String oldPin, String newPin) {
        this.oldPin = oldPin;
        this.newPin = newPin;
    }

    public void setOldPin(String oldPin) {
        this.oldPin = oldPin;
    }

    public void setNewPin(String newPin) {
        this.newPin = newPin;
    }

    public String getOldPin() {
        return oldPin;
    }

    public String getNewPin() {
        return newPin;
    }
}

