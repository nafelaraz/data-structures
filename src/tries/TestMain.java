package tries;

public class TestMain {
    public static void main(String[] args) {
        Trie trie = createExampleTrie();
        System.out.println(trie);
    }

    private static Trie createExampleTrie() {
        Trie trie = new Trie();

        trie.insert("Programming");
        trie.insert("is");
        trie.insert("a");
        trie.insert("way");
        trie.insert("of");
        trie.insert("life");

        return trie;
    }
}
