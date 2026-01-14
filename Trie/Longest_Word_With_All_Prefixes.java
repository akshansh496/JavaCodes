package Trie;

//Find the longest string in words such that every prefix of it is also in words.
class Longest_Word_With_All_Prefixes{
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

    public static void insert(String word){
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

    public static String ans="";
    public static void longestWord(Node root,StringBuilder temp){
        if(root==null) return;

        for(int i=0;i<26;i++){
            if(root.Children[i]!=null && root.Children[i].EndOfWord==true){
                char ch=(char)(i+'a');
                temp.append(ch);
                if(temp.length()>ans.length())
                ans=temp.toString();
            longestWord(root.Children[i], temp);
            temp.deleteCharAt(temp.length()-1);//backtrack
            }
        }
    }

    public static void main(String[] args) {
        String words []= {"a", "banana", "app", "appl", "ap", "apply", "apple"};
        for(String word:words){
            insert(word);
        }
        longestWord(root, new StringBuilder(""));
        System.out.println(ans);
    }
}

