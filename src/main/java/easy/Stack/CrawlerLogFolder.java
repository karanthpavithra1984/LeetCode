package easy.Stack;

import java.util.Stack;

public class CrawlerLogFolder {
    /**
     * Time Compexity o(n)
     * Space complexity o(n)
     * @param logs
     * @return
     */
    public int minOperations(String[] logs) {
        Stack<String> directoryDeck = new Stack<>();
        for(String log: logs){
            if(log.equals("../")){
                if(!directoryDeck.isEmpty()){
                    directoryDeck.pop();
                }
            }else if(!log.equals("./")){
                directoryDeck.push(log);
            }
        }

        return directoryDeck.size();
    }
}
