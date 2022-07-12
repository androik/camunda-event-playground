package ch.leinweber.playground.processes.event;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class EventProcessConstants {

    public static final String ID = "";

    @NoArgsConstructor(access = AccessLevel.PRIVATE)
    public static class Delegates {
        public static final String SEND_REMINDER_EMAIL_DELEGATE = "SendReminderEmailDelegate";
        public static final String CLOSE_EVENT_DELEGATE = "CloseEventDelegate";
        public static final String CANCEL_EVENT_DELEGATE = "CancelEventDelegate";
    }

    public static class Events {
        public static final String EVENT_CREATED_START_EVENT = "EventErstelltStartEvent";
        public static final String REMINDER_EMAIL_SENT_END_EVENT = "";
        public static final String EVENT_CLOSED_END_EVENT = "";
        public static final String EVENT_CANCELED_END_EVENT = "";
    }

    @NoArgsConstructor(access = AccessLevel.PRIVATE)
    public static class Activities {

    }

}
