package other;

//Тут всякое)

public class Main {
    public static void main(String[] args) {

        //Тестируем мою очередь и стек
        MyQueue queue = new MyQueue();
        String s = "abc";
        String s1 = "abcd";
        String s2 = "abcdf";
        String s3 = "abcdfe";
        String s4 = "abcdefg";
        queue.add(s);
        queue.add(s1);
        queue.add(s2);
        queue.add(s3);
        queue.add(s4);
        System.out.println(queue.remote());
        System.out.println(queue.remote());
        System.out.println(queue.remote());
        System.out.println(queue.remote());
        System.out.println(queue.remote());

        System.out.println();

        MyStack stack = new MyStack();
        stack.add(s);
        stack.add(s1);
        stack.add(s2);
        stack.add(s3);
        stack.add(s4);
        System.out.println(stack.remote());
        System.out.println(stack.remote());
        System.out.println(stack.remote());
        System.out.println(stack.remote());
        System.out.println(stack.remote());
    }
}
