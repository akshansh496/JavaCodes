package Trie;

public class Trie {
    static class Node{
        Node Children[]=new Node[26];
        boolean EndOfWord=false;
        
        Node(){
            for(int i=0;i<26;i++){
                Children[i]=null;
            }
        }
    }
    public static Node root=new Node();

    public static void insert(String word){//O(L) L-length of largest word
        Node curr=root;
        for(int level=0;level<word.length();level++){
            int idx=word.charAt(level)-'a';
            if(curr.Children[idx]==null){
                curr.Children[idx]=new Node();
            }
            curr=curr.Children[idx];
        }
        curr.EndOfWord=true;
    }

    public static boolean search(String word){
        Node curr=root;
        for(int level=0;level<word.length();level++){
            int idx=word.charAt(level)-'a';
            if(curr.Children[idx]==null) return false;
            curr=curr.Children[idx];
        }
        return curr.EndOfWord==true;
    }
        
    public static void main(String[] args) {
        String words[]={"the","a","there","their","any","thee"};
        for(String word: words){
            insert(word);
        }
        System.out.println(search("the"));   // true
        System.out.println(search("there")); // true
        System.out.println(search("their")); // true
        System.out.println(search("any"));   // true
        System.out.println(search("an"));    // false
        System.out.println(search("thor"));  // false

    }
}
