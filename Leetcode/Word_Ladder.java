package Leetcode;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class Word_Ladder {

    public static int dfs(String beginWord, String endWord, List<String> wordList) {
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < wordList.size(); i++) {
            set.add(wordList.get(i));
        }
        if (!set.contains(endWord)) {
            return 0;
        }
        set.remove(beginWord);
        int ans = helper(beginWord, endWord, set);

        return ans == Integer.MAX_VALUE ? 0 : ans;
    }

    public static int helper(String beginWord, String endWord, Set<String> set) {
        if (beginWord.equals(endWord)) {
            return 1;
        }
        StringBuilder str = new StringBuilder(beginWord);
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < beginWord.length(); i++) {
            char originalChar = str.charAt(i);
            for (char x = 'a'; x <= 'z'; x++) {
                str.setCharAt(i, x);
                String neighbour = str.toString();
                if (set.contains(neighbour)) {
                    set.remove(neighbour);
                    int result = helper(neighbour, endWord, set);
                    if (result != Integer.MAX_VALUE) {
                        ans = Math.min(ans, 1 + result);
                    }
                    set.add(neighbour);
                }
            }
            str.setCharAt(i, originalChar);
        }
        return ans;
    }

    public static int bfs(String beginWord, String endWord, List<String> wordList) {
        Set<String> set = new HashSet<>(wordList);
        if (!set.contains(endWord)) {
            return 0;
        }
        set.remove(beginWord);
        Queue<String> q = new LinkedList<>();
        q.add(beginWord);
        int level = 1;
        while (!q.isEmpty()) {
            int size = q.size();
            for (int j = 0; j < size; j++) {
                String word = q.poll();
                if (word.equals(endWord)) {
                    return level;
                }
                StringBuilder str = new StringBuilder(word);
                for (int i = 0; i < word.length(); i++) {
                    char originalChar = str.charAt(i);
                    for (char x = 'a'; x <= 'z'; x++) {
                        str.setCharAt(i, x);
                        String neighbour = str.toString();

                        if (set.contains(neighbour)) {
                            q.add(neighbour);
                            set.remove(neighbour);
                        }
                    }
                    str.setCharAt(i, originalChar);
                }
            }
            level++;
        }
        return 0;
    }

    public static void main(String[] args) {

        String beginWord = "hit";
        String endWord = "cog";

        List<String> wordList = List.of(
                "hot", "dot", "dog", "lot", "log", "cog"
        );

        int dfsAns = dfs(beginWord, endWord, wordList);
        int bfsAns = bfs(beginWord, endWord, wordList);

        System.out.println("DFS Answer: " + dfsAns);
        System.out.println("BFS Answer: " + bfsAns);
    }
}
