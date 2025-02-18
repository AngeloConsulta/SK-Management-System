package sk.management.system.view.profile;

import sk.management.system.model.Transaction;

public interface EventAction {

    public void delete(Transaction transaction);

    public void update(Transaction transaction);
}
