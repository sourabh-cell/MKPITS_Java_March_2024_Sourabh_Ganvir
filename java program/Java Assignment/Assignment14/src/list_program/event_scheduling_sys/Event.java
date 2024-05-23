/*Develop an event scheduling system where users can add, remove, and search for events.
// Each event should have properties such as `eventId`, `eventName`, `location`,
// `date`, and `time`. Implement functionality to display all events, search for
 an event by `eventName`, and display events happening at a specific location.*/
package list_program.event_scheduling_sys;

import java.time.LocalDate;
import java.time.LocalTime;

public class Event {
   private int eventId;
   private String eventName;
   private String location;
   private LocalDate date;
   private LocalTime time;

    public Event(int eventId, String eventName, String location, LocalDate date, LocalTime time) {
        this.eventId = eventId;
        this.eventName = eventName;
        this.location = location;
        this.date = date;
        this.time = time;
    }

    public int getEventId() {
        return eventId;
    }

    public String getEventName() {
        return eventName;
    }

    public String getLocation() {
        return location;
    }

    public LocalDate getDate() {
        return date;
    }

    public LocalTime getTime() {
        return time;
    }

    @Override
    public String toString() {
        return "Event{" +
                "eventId=" + eventId +
                ", eventName='" + eventName + '\'' +
                ", location='" + location + '\'' +
                ", date=" + date +
                ", time=" + time +
                '}';
    }
}
