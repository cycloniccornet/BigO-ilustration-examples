
public class BubbleSort {

    static void sort(int[] array) {
        System.out.println("Assorteret liste: "+ListForSort.printList(array));
        int count = 0;
        for (int i = 0;i<array.length-1;i++) {
            for (int j = 0;j<array.length-1;j++) {
                if (array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
                count++;
                System.out.println("Iteration nr. "+count +": "+ListForSort.printList(array));
            }
        }
        System.out.println("\nSortering færdig på \u001B[31m"+count+"\u001B[0m iterationer: \u001B[32m"+ListForSort.printList(array)+"\u001B[0m\n");
    }

    static void sortWithBreak(int[] array) {
        boolean byt;
        int count = 0;
        while (true) {
            byt = false;
            for (int i = 0;i<array.length-1;i++) {
                if (array[i+1] < array[i]) {
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    byt = true;
                }
                count++;
                System.out.println("Iteration nr. "+count +": "+ListForSort.printList(array));
            }
            if (!byt) {
                System.out.println("Ingen byt - stopper...");
                break;
            }
        }
        System.out.println("\nSortering færdig på \u001B[31m"+count+"\u001B[0m iterationer: \u001B[32m"+ListForSort.printList(array)+"\u001B[0m\n");
    }
}
