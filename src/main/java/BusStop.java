import java.util.ArrayList;

public class BusStop {

    private String name;
    private ArrayList<Person> queue;

    public BusStop(String name) {
        this.name = name;
        this.queue = new ArrayList<>();
    }


    public void addPerson(Person person) {
        queue.add(person);
    }

    public int queueCount() {
        return queue.size();
    }

    public Person removeFromQueue() {
        return queue.remove(0);
    }


}
