import java.util.Comparator;

public class SortByPriority implements Comparator<Task> {
    @Override
    public int compare(Task o1, Task o2) {
        if (o1.getPriority() > o2.getPriority()) return 1;
        if (o1.getPriority() < o2.getPriority()) return -1;
        if (o1.getPriority() == o2.getPriority()) {
            String stringOne = o1.getName();
            char charOne = stringOne.charAt(0);
            String stringTwo = o2.getName();
            char charTwo = stringTwo.charAt(0);
            if (charOne > charTwo) return 1;
            if (charOne < charTwo) return -1;
            return 0;
        }
        return 0;
    }
}

