//import java.util.Stack;
//
//public class JJ {
//    public static void main(String[] args) {
//        Stack<Integer> stack = new Stack<>();
//        Stack<Integer> reversedStack = new Stack<>();
//        stack.add(4);
//        stack.add(-7);
//        stack.add(8);
//        stack.add(39);
//        stack.add(-139);
//        stack.add(-5);
//        stack.add(-10);
//        stack.add(0);
//
////        Iterator<Integer> itr = stack.iterator();
//        Stack<Integer> sorted = new Stack<>();
//        Stack<Integer> newstack = new Stack<>();
////        System.out.println(itr.next());
////        System.out.println(stack);
////        int min = stack.peek();
////        System.out.println("----" + min);
////        System.out.println("----" + stack.push(stack.peek()));
//        System.out.println(stack);
////        System.out.println(stack);
//
////        System.out.println("min = " + findMinimum(min, reverseStack(stack,reversedStack)));
////        System.out.println(sorting(stack));
////        System.out.println(stack);
//
//        System.out.println(newsort(stack, newstack));
//    }
//
//    private static Stack<Integer> sorting(Stack<Integer> stack) {
//        if (!stack.empty()) {
//            int temp = stack.pop();
//            sorting(stack);
////            sortinsert(stack, temp);
//        }
//
//
//        if (!stack.empty()) {
////            Iterator<Integer> newitr = stack.iterator();
//            int min = findMinimum(stack.peek(), stack);
////            System.out.println(min);
//            if (min != stack.peek()) {
////                sorted.push(min);
//            }
////            return sorting(stack, sorted);
//
//        }
//        return null;
//    }
//
//    private static Integer findMinimum(int min, Stack<Integer> stack) {
//        System.out.println(stack);
//        System.out.println(min);
//        System.out.println(stack.peek());
////        if (!stack.empty()) {
////            if (min > stack.peek()) {
////                min = stack.pop();
////            } else if (min == stack.peek()) {
////                return min;
////            }
////            stack.pop();
////            if (!stack.empty())
////                return findMinimum(min, stack);
////        }
//        if (!stack.empty()) {
////            System.out.println("peek = " + stack.peek());
////            System.out.println(min);
////            System.out.println(stack.peek());
//            if (min > stack.peek()) {
//                min = stack.peek();
//                System.out.println("temp min = " + min);
////                stack.push(stack.pop());
////                System.out.println("max =" + max);
//            } else if (min == stack.peek()) {
//                return min;
//            }
////            System.out.println("yes");
////            stack.pop();
//            if (!stack.empty())
//                findMinimum(min, stack); //!!!! attention for without return && with return //reflexsion
//        }
////        System.out.println("no");
//        return min;
//    }
//
//    private static Stack<Integer> newsort(Stack<Integer> stack, Stack<Integer> newstack) {
//        if (!stack.empty()) {
//            int element = stack.pop();
//
//
////            System.out.println("==" + newss(stack, element, newstack));
//
//            newstack.push(element);
////            System.out.println("++" + newstack);
//            return newsort(stack, newstack);
//        }
//        return newstack;
//
////
////
////
////        while (!stack.empty())
////        {
////            int element = stack.pop();
////            while (!newstack.empty() && newstack.peek() < element)
////            {
////                stack.push(newstack.pop());
////                System.out.println("==" + stack);
////            }
////            newstack.push(element);
////            System.out.println("++" + newstack);
////
////        }
//////        while (!newstack.empty())
//////        {
//////            stack.push(newstack.pop());
//////        }
//////        System.out.println("==" + stack);
//////        System.out.println("==" + newstack);
////
////        return stack;
//    }
//
//    private static void newss(Stack<Integer> newstack, int element) {
//        if (!newstack.empty() && newstack.peek() < element) {
//            newstack.push(newstack.pop());
//            return;
//        }
//        newss();
//    }
//
//
//}
