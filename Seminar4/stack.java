package Seminar4;
// Реализовать стэк с помощью массива. 
// Нужно реализовать методы:
// size(), empty(), push(), peek(), pop(). 

class Stack<T> {
  
    private T[] array;
    private int index = 0;

    public Stack(int length) {
        this.index = 0;
        this.array = (T[]) new Object[length];
    }

    public int size() {
        return this.index;
    }

    public boolean empty() {
        System.out.print("Массив пуст: ");
        return this.size() == 0;
    }

    public void push(T value) {
        if (this.index < this.array.length) {
            this.array[index++] = value;
        } else {
            System.out.println("Индекс массива выходит за пределы (+1)");
        }
    }

    public T peek() {
        if(size()>0) {
            return this.array[index - 1];
        } else {
            System.out.println("Элемент массивая не найден");
        }
        return null;
    }

    public T pop() {
        if (this.index > 0) {
            return this.array[--index];
        } else {
            System.out.println("Индекс массива выходит за пределы (-1)");
        }
        return null;
    }

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>(5);
        System.out.println("size: " + stack.size());
        System.out.println(stack.empty());
        stack.push("Элемент массива 1");
        stack.push("Элемент массива 2");
        stack.push("Элемент массива 3");
        System.out.println(stack.empty());
        System.out.println(stack.peek());
        stack.push("Элемент массива 4");
        stack.push("Элемент массива 5");
        stack.push("Элемент массива 6");
        System.out.println("size: " + stack.size());
        while (stack.size() > 0) {
            System.out.print(stack.pop() + ", ");
        }
        System.out.println();
        System.out.println(stack.pop());
        System.out.println(stack.peek());
    }
}
