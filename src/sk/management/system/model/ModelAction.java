package sk.management.system.model;



import sk.management.system.view.profile.EventAction;

public class ModelAction {

    public Transaction getTransaction() {
        return transaction;
    }

    public void setTransaction(Transaction transaction) {
        this.transaction = transaction;
    }

    public EventAction getEvent() {
        return event;
    }

    public void setEvent(EventAction event) {
        this.event = event;
    }

    public ModelAction(Transaction transaction, EventAction event) {
        this.transaction = transaction;
        this.event = event;
    }

    public ModelAction() {
    }

    private Transaction transaction;
    private EventAction event;
}
