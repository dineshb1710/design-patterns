package behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

public class BrowserHistory {

    private List<String> browserHistoryList = new ArrayList<>();

    public void addHistory(String history) {
        browserHistoryList.add(history);
    }

    public BrowserHistoryIterator getIterator() {
        return new BrowserHistoryIterator(this);
    }

    public class BrowserHistoryIterator implements Iterator<String> {

        private int index;
        private BrowserHistory browserHistory;

        public BrowserHistoryIterator(BrowserHistory browserHistory) {
            this.browserHistory = browserHistory;
        }

        @Override
        public void next() {
            index++;
        }

        @Override
        public boolean hasNext() {
            return index < browserHistoryList.size();
        }

        @Override
        public String current() {
            return browserHistoryList.get(index);
        }
    }
}
