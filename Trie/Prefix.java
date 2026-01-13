package Trie;

public class Prefix {
    static class Node{
        Node Children[]=new Node[26];
        boolean EndOfWord;
        int freq;

        public Node(){
            for(int i=0;i<26;i++){
                Children[i]=null;
            }
            freq=0;
        }
    }

    public static Node root=new Node();

    public static void insert(String word){
        Node curr=root;
        for(int level=0;level<word.length();level++){
            int idx=word.charAt(level)-'a';
            if(curr.Children[idx]==null){
                curr.Children[idx]=new Node();
            }
            curr.Children[idx].freq++;
            curr=curr.Children[idx];
        }
        curr.EndOfWord=true;
    }

    static String getUniquePrefix(String word) {
        Node curr = root;
        StringBuilder prefix = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            curr = curr.Children[idx];
            prefix.append(word.charAt(i));

            if (curr.freq == 1) {  // first unique node
                break;
            }
        }

        return prefix.toString();
    }


    public static void main(String[] args) {
        String arr[]={"zebra","dog","duck","dove"};
        for(String word:arr){
            insert(word);
        }
        for(String word:arr){
            System.out.println(getUniquePrefix(word));
        }
    }
}
