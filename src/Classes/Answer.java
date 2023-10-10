package Classes;

import java.util.HashMap;

public class Answer {
    private static HashMap<String, Boolean> options = new HashMap<String, Boolean>();

    public HashMap<String, Boolean> getOptions() {
        return options;
    }

    public void setOptions(HashMap<String, Boolean> options) {
        Answer.options = options;
    }
}
