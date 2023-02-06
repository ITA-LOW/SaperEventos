import java.util.*;
public class EventoSaper{
    public static void main(String[] args) {
        
    }

    class Event {
    private String name;
    private Date startDate;
    private Date endDate;
    private String location;
    private String[] organizers;
    private String details;
    private String folder;
    private int rating;
    private String[] participants;

    public Event(String name, Date startDate, Date endDate, String location, String[] organizers, String details, String folder) {
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
        this.location = location;
        this.organizers = organizers;
        this.details = details;
        this.folder = folder;
    }

    public void registerParticipant(String participant) {
        participants = Arrays.copyOf(participants, participants.length + 1);
        participants[participants.length - 1] = participant;
    }

    public void rateEvent(int stars) {
        rating = stars;
    }
    /*
    public void displayAgenda(Date start, Date end) {
        for (Event event : events) {
        if (event.startDate.compareTo(start) >= 0 && event.startDate.compareTo(end) <= 0) {
            System.out.println(event.name + ": " + event.startDate + " to " + event.endDate + " at " + event.location);
        }
        }
    }
    */
    public void displayParticipants() {
        System.out.println("Participants for event " + name + ":");
        for (String participant : participants) {
        System.out.println(participant);
        }
    }

    public void generateCertificate(String participant) {
        System.out.println("Certificate for " + participant + " for event " + name + ":");
        System.out.println("Name of event: " + name);
        System.out.println("Date: " + startDate + " to " + endDate);
        System.out.println("Location: " + location);
        System.out.println("Organizers: " + Arrays.toString(organizers));
    }
    }

    class Campus {
    private String name;
    private Event[] events;

    public Campus(String name) {
        this.name = name;
    }

    public void addEvent(Event event) {
        events = Arrays.copyOf(events, events.length + 1);
        events[events.length - 1] = event;
    }

    public void linkEvent(Event event) {
        event.location = name;
    }

    public void displayEvents() {
        System.out.println("Events at campus " + name + ":");
        for (Event event : events) {
        System.out.println(event.name + ": " + event.startDate + " to " + event.endDate + " at " + event.location);
        }
    }
    }

    class EventManager {
    private Event[] events;

    public void addEvent(Event event) {
        events = Arrays.copyOf(events, events.length + 1);

    }
    }
}
