package ch.leinweber.playground.processes.invitation.delegates;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

import static ch.leinweber.playground.processes.invitation.InvitationProcessConstants.Delegates.APPROVE_PARTICIPANT_DELEGATE;

@Component(APPROVE_PARTICIPANT_DELEGATE)
public class ApproveParticipantDelegate implements JavaDelegate {
    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {

    }
}
