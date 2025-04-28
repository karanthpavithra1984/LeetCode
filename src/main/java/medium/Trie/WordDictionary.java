package medium.Trie;

import java.util.HashMap;
import java.util.Map;

class WordDictionary {
    TrieN trieNode;

    public WordDictionary() {
        this.trieNode = new TrieN();
    }

    public void addWord(String word) {
        TrieN current = this.trieNode;

        for(Character character: word.toCharArray()){
            if(!current.children.containsKey(character)){
                current.children.put(character, new TrieN());
            }

            current = current.children.get(character);
        }

        current.isWord= true;
    }

    public boolean search(String word) {
        return recursiveSearch(word,trieNode);
    }

    private boolean recursiveSearch(String word,TrieN trieNode){
        TrieN current = trieNode;
        for (Character c : word.toCharArray()) {
            if (c.equals('.')) {
                //Check for each character after
                for (Character key : current.children.keySet()) {
                    //Make sure you check for one pass , dont have to go to all
                    if (recursiveSearch(word.substring(word.indexOf(c) + 1),
                            current.children.get(key))) {
                        return true;
                    }
                }
            }
            if (!current.children.containsKey(c)) {
                return false;
            }
            current = current.children.get(c);
        }

        return current.isWord;
    }



}

class TrieN {
    Map<Character, TrieN> children;
    boolean isWord;

    TrieN(){
        this.children = new HashMap<>();
        this.isWord = false;
    }
}

