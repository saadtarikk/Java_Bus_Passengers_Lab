import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {
    private Bus bus;
    private Person person;
    private BusStop busStop;

    @Before
    public void before(){
        bus = new Bus("Glasgow", 20);
        person = new Person();
        busStop = new BusStop("John stop");
    }

    @Test
    public void canGetCapacity(){
        assertEquals(20, bus.getCapacity());
    }

    @Test
    public void canAddPersonToBus(){
        bus.addPassenger(person);
        assertEquals(1, bus.getPassengerCount());
    }

    @Test
    public void canRemovePassenger() {
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.removePassenger();
        assertEquals(2, bus.getPassengerCount());
    }
    @Test
    public void canPickUp(){
        busStop.addPerson(person);
        busStop.addPerson(person);
        busStop.addPerson(person);
        bus.pickUp(busStop);
        assertEquals(2, busStop.queueCount());
        assertEquals(1, bus.getPassengerCount());
    }
}
