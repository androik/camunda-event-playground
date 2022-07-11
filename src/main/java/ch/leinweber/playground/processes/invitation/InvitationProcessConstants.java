package ch.leinweber.playground.processes.invitation;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class InvitationProcessConstants {

    public final String ID = "EinladungVerarbeitenProcess";

    @NoArgsConstructor(access = AccessLevel.PRIVATE)
    public static class Delegates {
        public static final String SEND_INVITATION_EMAIL_DELEGATE = "SendInvitationEmailDelegate";
        public static final String SEND_REMINDER_EMAIL_DELEGATE = "SendReminderEmailDelegate";
        public static final String APPROVE_PARTICIPANT_DELEGATE = "ApproveParticipantDelegate";
        public static final String DECLINE_PARTICIPANT_DELEGATE = "DeclineParticipantDelegate";
        public static final String REPORT_PARTICIPANT_WITHOUT_RESPONSE_DELEGATE = "ReportParticipantWithoutResponseDelegate";
    }

    @NoArgsConstructor(access = AccessLevel.PRIVATE)
    public static class Gateways {
        public static final String INVITATION_ACCEPTED_GATEWAY = "TerminAkzeptiertGateway";
    }

    public static class Events {
        public static final String EVENT_RECEIVED_START_EVENT = "EventEingegangenStartEvent";
        public static final String REMINDER_SENT_END_EVENT = "ErinnerungGesendetEndEent";
        public static final String PARTICIPANT_APPROVED_END_EVENT = "TeilnehmerHatZugesagtEndEvent";
        public static final String PARTICIPANT_DECLINED_END_EVENT = "TeilnehmerHatAbgelehntEndEvent";
        public static final String PARTICIPANT_HAS_NOT_ANSWERED_END_EVENT = "TeilnehmerHatNichtGeantwortetEndEvent";
    }

}
