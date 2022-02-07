package behavioral.template.runner;

import behavioral.template.TransferMoneyTask;

/**
 * Below class represents an implementation of Template Pattern.
 */
public class TemplateDemo {
    public static void main(String[] args) {
        TransferMoneyTask task = new TransferMoneyTask();
        task.execute();
    }
}
