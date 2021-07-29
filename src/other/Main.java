package other;

//Тут всякое)

public class Main {
    public static void main(String[] args) {

        //Тестируем мою очередь и стек
        MyQueue<String> queue = new MyQueue<>();
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

        MyStack<Integer> stack = new MyStack<>();
        stack.add(100);
        stack.add(1000);
        stack.add(10000);
        stack.add(100000);
        stack.add(1000000);
        System.out.println(stack.remote());
        System.out.println(stack.remote());
        System.out.println(stack.remote());
        System.out.println(stack.remote());
        System.out.println(stack.remote());
    }
}
