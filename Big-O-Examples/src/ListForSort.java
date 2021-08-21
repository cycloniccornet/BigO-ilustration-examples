import java.util.Random;

public class ListForSort {
    static Random random = new Random();
    static int[] array;
    static int size = 8;
    static int boundary = 100;

    public ListForSort() {
        newRandomList();
    }

    public static int[] getArray() {
        newRandomList();
        return array;
    }

    public static void newRandomList() {
        array = new int[size];
        for (int i = 0; i<size;i++) {
            array[i] = random.nextInt(boundary);
        }
    }

    public static String printList(int[] arr) {
        StringBuilder list = new StringBuilder();
        for (int i = 0;i<=arr.length-1;i++) {
            if (i==arr.length-1) {
                list.append(arr[i]);
            } else {
                list.append(arr[i]).append(" - ");
            }
        }
        return list.toString();
    }

    public static int getSize() {
        return size;
    }
}
