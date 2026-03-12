package easy.Array;

import java.util.HashMap;
import java.util.Map;

public class Logger {
    Map<String, Integer> messageTimeStamp = new HashMap<>();

    public Logger() {
        messageTimeStamp = new HashMap<>();
    }

    public boolean shouldPrintMessage(int timestamp, String message) {
        if (messageTimeStamp.containsKey(message) && messageTimeStamp.get(message) > timestamp) {
            return false;
        }

        messageTimeStamp.put(message, timestamp + 10);
        return true;
    }
}
