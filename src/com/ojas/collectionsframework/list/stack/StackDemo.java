package com.ojas.collectionsframework.list.stack;

public class StackDemo {
    public static void main(String[] args) {

        // Thread safe as it extends Vector legacy class.

        // hi
   /*     Stack<Integer> stack = new Stack<>();
        stack.push(11);
        stack.push(2);
        Integer poppedElement = stack.pop();
        System.out.println(poppedElement);

        stack.push(3);
        stack.push(4);
        stack.push(5);
        Integer peeked = stack.peek();
        System.out.println(peeked);
        System.out.println(stack);

        System.out.println(stack.isEmpty());
        System.out.println(stack.size());

        int search = stack.search(2);
        System.out.println(search);

        Collections.sort(stack);
        System.out.println(stack);

  */

//        We can use LinkedList<E> as stack as well
/*        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.addLast(2);
        linkedList.addLast(22);
        linkedList.addLast(24); // Push
        Integer last = linkedList.removeLast(); // Pop
        Integer last1 = linkedList.getLast(); // Peek
 */

        // Although we can use arraylist to perform stack operations it's not recommended as its not a good practice and
        // it leaves less readable code unlike Stack<> and LinkedList<>

        /*        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.get(arrayList.size() - 1); // Peek
        arrayList.remove(arrayList.size() - 1); // Pop
  */

    }
}
