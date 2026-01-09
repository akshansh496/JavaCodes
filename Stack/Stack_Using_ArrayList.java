package Stack;

import java.util.ArrayList;

public class Stack_Using_ArrayList {
    static class Stack{
        static ArrayList<Integer> list=new ArrayList<>();


        public static boolean isEmpty(){
            return list.size()==0;
        }

        // push
        public static void push(int data){
            list.add(data);
        }

        // pop

        public static int pop(){
            if(isEmpty()) return -1;
            int top=list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }

        // peek

        public static int peek(){
            if(isEmpty()) return -1;
            return  list.get(list.size()-1);
        }

    }
    public static void main(String[] args) {
        Stack obj=new Stack();
        obj.push(1);
        obj.push(2);
        obj.push(3);

        while(!obj.isEmpty()){
            System.out.println(obj.peek());  
            obj.pop();
        }
    }
}
