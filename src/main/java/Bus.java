import java.util.ArrayList;

public class Bus {

    private String destination;
    private int capacity;
    private ArrayList<Person> people;

    public Bus(String destination, int capacity) {
        this.destination = destination;
        this.capacity = capacity;
        this.people = new ArrayList<>();
    }

    public int getCapacity() {
        return capacity;
    }

    public void addPassenger(Person person) {
        if(this.getPassengerCount() < this.capacity)
            this.people.add(person);
    }

    public int getPassengerCount() {
        return people.size();
    }


    public void removePassenger() {
        this.people.remove(0);
    }


    public void pickUp(BusStop busStop) {
        Person person = busStop.removeFromQueue();
        this.addPassenger(person);
    }
}
