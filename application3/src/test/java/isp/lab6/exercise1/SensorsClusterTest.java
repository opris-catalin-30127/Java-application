package isp.lab6.exercise1;

import org.junit.Test;

import static isp.lab6.exercise1.SENSOR_TYPE.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.ArrayList;

public class SensorsClusterTest {

    @Test
    public void TestAddSensor() {
        SensorsCluster sensorsCluster = new SensorsCluster(new ArrayList<>());
        sensorsCluster.addSensor(PRESSURE, "1");
        assertEquals(1, sensorsCluster.getSensors().size());
        assertEquals("1", sensorsCluster.getSensors().get(0).getId());
        assertEquals(null, sensorsCluster.getSensors().get(0).getSensorType());
    }

    @Test
    public void Test() {
        SensorsCluster sensorsCluster = new SensorsCluster(new ArrayList<>());
        sensorsCluster.addSensor(HUMIDITY, "1");
        assertEquals(1, sensorsCluster.getSensors().size());
        assertEquals("1", sensorsCluster.getSensors().get(0).getId());
        assertEquals(null, sensorsCluster.getSensors().get(0).getSensorType());
        sensorsCluster.addSensor(TEMPERATURE, "2");
        assertEquals(2, sensorsCluster.getSensors().size());
        assertEquals("2", sensorsCluster.getSensors().get(1).getId());
        assertEquals(null, sensorsCluster.getSensors().get(1).getSensorType());
    }
}

