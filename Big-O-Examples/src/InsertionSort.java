
public class InsertionSort {

    static void sort(int[] array) {
        int count = 0;
        System.out.println("Assorteret liste: "+ListForSort.printList(array));
        for (int i=1;i<array.length;++i) {
            int current = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > current) {
                array[j + 1] = array[j];
                j = j - 1;
                count++;
                System.out.println("Iteration nr. "+count+": "+ListForSort.printList(array));
            }
            array[j + 1] = current;
        }
        System.out.println("\nSortering færdig på \u001B[31m"+count+"\u001B[0m iterationer: \u001B[32m"+ListForSort.printList(array)+"\u001B[0m\n");
    }
}
