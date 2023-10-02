package session7.challanges.EventSchedulerAndReminder;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Event {

    String eventName;
    String eventDescription;
    LocalDateTime eventDateTime;
    LocalDateTime reminderDateTime;



    public Event(String eventName, String eventDescription, LocalDateTime eventDateTime, LocalDateTime reminderDateTime) {
        this.eventName = eventName;
        this.eventDescription = eventDescription;
        this.eventDateTime = eventDateTime;
        this.reminderDateTime = reminderDateTime;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventDescription() {
        return eventDescription;
    }

    public void setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
    }

    public LocalDateTime getEventDateTime() {
        return eventDateTime;
    }

    public void setEventDateTime(LocalDateTime eventDateTime) {
        this.eventDateTime = eventDateTime;
    }

    public LocalDateTime getReminderDateTime() {
        return reminderDateTime;
    }

    public void setReminderDateTime(LocalDateTime reminderDateTime) {
        this.reminderDateTime = reminderDateTime;
    }
}
