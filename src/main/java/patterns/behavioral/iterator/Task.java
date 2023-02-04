package patterns.behavioral.iterator;

public class Task implements Container<String> {
    String[] tasks = {"Java", "Spring", "Hibernate", "Maven"};
    @Override
    public Iterator<String> getIterator() {
        return new TaskIterator();
    }

    private class TaskIterator implements Iterator<String>{
        int index = 0;
        @Override
        public boolean hasNext() {
            return index < tasks.length;
        }

        @Override
        public String getNext() {
            return tasks[index++];
        }
    }
}
