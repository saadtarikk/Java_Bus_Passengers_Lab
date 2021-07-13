import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    private BusStop busStop;
    private Bus bus;
    private Person person;

    @Before
    public void before(){
        busStop = new BusStop("Non stop");
        bus = new Bus("Glasgow", 20);
        person = new Person();
    }

    @Test
    public void canAddPersonToQueue(){
        busStop.addPerson(person);
        assertEquals(1, busStop.queueCount());
    }

    @Test
    public void canRemovePersonFromQueue(){
        busStop.addPerson(person);
        busStop.addPerson(person);
        busStop.addPerson(person);
        busStop.removeFromQueue();
        assertEquals(2, busStop.queueCount());
    }


}
