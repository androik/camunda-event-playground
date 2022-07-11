package ch.leinweber.playground.processes.invitation.delegates;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

import static ch.leinweber.playground.processes.invitation.InvitationProcessConstants.Delegates.SEND_REMINDER_EMAIL_DELEGATE;

@Component(SEND_REMINDER_EMAIL_DELEGATE)
public class SendReminderEmailDelegate implements JavaDelegate {
    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {

    }
}
