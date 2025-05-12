package medium.Trie;

import java.util.HashMap;
import java.util.Map;

/**
 * Space complexity is o(t) where t is the number of words inserted
 */

public class Trie {
    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    /**
     * Time Complexity , o(n) - where n is the length of the word
     * HashMap put and get is o(1), but if there are hash collisions it could be more
     *
     * @param word
     */
    public void insert(String word) {
        TrieNode current = root;
        for (Character character : word.toCharArray()) {
            if (!current.children.containsKey(character)) {
                current.children.put(character, new TrieNode());
            }
            current = current.children.get(character);
        }

        current.isWord = true;
    }

    /**
     * Search is o(n) if the word is found
     *
     * @param word
     * @return
     */

    public boolean search(String word) {
        TrieNode current = root;

        for (Character character : word.toCharArray()) {
            if (!current.children.containsKey(character)) {
                return false;
            }
            current = current.children.get(character);
        }

        return current.isWord;
    }

    /**
     * Same as above
     *
     * @param prefix
     * @return
     */

    public boolean startsWith(String prefix) {
        TrieNode current = root;

        for (Character character : prefix.toCharArray()) {
            if (!current.children.containsKey(character)) {
                return false;
            }

            current = current.children.get(character);
        }

        return true;
    }
}

class TrieNode {
    Map<Character, TrieNode> children;
    boolean isWord;

    public TrieNode() {
        this.children = new HashMap<>();
        this.isWord = false;
    }
}
