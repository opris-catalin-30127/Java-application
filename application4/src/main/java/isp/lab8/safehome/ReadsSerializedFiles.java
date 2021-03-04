package isp.lab8.safehome;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadsSerializedFiles {
    private List<AccessLog> accessLogs = new ArrayList<>();
    public ReadsSerializedFiles() {
    }

    public void deserialize(String file) {

        try (final FileInputStream fileInputStream = new FileInputStream(file)) {
            try (final ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
                AccessLog accessLog = (AccessLog) objectInputStream.readObject();
                accessLogs.add(accessLog);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.getStackTrace();
        }
        }
    public void display() {
        for (AccessLog accessLog : accessLogs ) {
            System.out.println(accessLog.toString());
        }
    }
}

