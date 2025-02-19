package sk.management.system.view.profile;

import sk.management.system.model.Transaction;

public interface EventAction {

    public boolean delete(Transaction transaction);

    public boolean update(Transaction transaction);
}
