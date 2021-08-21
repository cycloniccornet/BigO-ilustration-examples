
public class SelectionSort {

    static void sort(int[] array) {
        int count = 0;
        System.out.println("Assorteret liste: "+ListForSort.printList(array));
        for (int i = 0;i<array.length-1;i++) {
            int current = i;
            for (int j = i+1;j<array.length;j++) {
                if (array[j] < array[current]) {
                    current = j;
                }
                count++;
                System.out.println("Iteration nr. "+count +": "+ListForSort.printList(array));
            }
            int temp = array[current];
            array[current] = array[i];
            array[i] = temp;
        }
        System.out.println("\nSortering færdig på \u001B[31m"+count+"\u001B[0m iterationer: \u001B[32m"+ListForSort.printList(array)+"\u001B[0m\n");
    }
}
