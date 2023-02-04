package patterns.behavioral.iterator;

public class Main {
    public static void main(String[] args) {
        Task task = new Task();
        Iterator<String> iterator = task.getIterator();
        while (iterator.hasNext()){
            System.out.print(iterator.getNext() + " ");
        }
    }
}
