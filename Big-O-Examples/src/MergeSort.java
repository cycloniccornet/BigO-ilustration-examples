
public class MergeSort {
    static int count = 0;

    public static void mergeSort(int[] array, int arraySize) {
        if (arraySize < 2) {
            return;
        }
        int halfSizeArray = arraySize / 2;
        int[] leftArray = new int[halfSizeArray];
        int[] rightArray = new int[arraySize - halfSizeArray];

        for (int i = 0; i < halfSizeArray; i++) {
            leftArray[i] = array[i];
        }
        for (int i = halfSizeArray; i < arraySize; i++) {
            rightArray[i - halfSizeArray] = array[i];
        }
        count++;
        System.out.println("Iteration nr. "+count+": "+ListForSort.printList(array));
        mergeSort(leftArray, halfSizeArray);
        mergeSort(rightArray, arraySize - halfSizeArray);

        merge(array, leftArray, rightArray, halfSizeArray, arraySize - halfSizeArray);
        if (array.length == ListForSort.getSize()) {
            System.out.println("\nSortering færdig på \u001B[31m"+count+"\u001B[0m iterationer: \u001B[32m"+ListForSort.printList(array)+"\u001B[0m\n");
        }
    }
    public static void merge(int[] originalArray, int[] leftArray, int[] rightArray, int left, int right) {

        int leftArrayCount = 0, rightArrayCount = 0, originalArrayCount = 0;
        // Kør begge arrays igennem og læg dem sammen til det originale array.
        while (leftArrayCount < left && rightArrayCount < right) {
            if (leftArray[leftArrayCount] <= rightArray[rightArrayCount]) {
                originalArray[originalArrayCount++] = leftArray[leftArrayCount++];
            }
            else {
                originalArray[originalArrayCount++] = rightArray[rightArrayCount++];
            }
        }
        // Tjek om det ene array er større end det andet, og tag det tal og læg ind i den originale array.
        while (leftArrayCount < left) {
            originalArray[originalArrayCount++] = leftArray[leftArrayCount++];
        }
        while (rightArrayCount < right) {
            originalArray[originalArrayCount++] = rightArray[rightArrayCount++];
        }
        count++;
        System.out.println("Iteration nr. "+count+": "+ListForSort.printList(originalArray));
    }

    public static void resetCount() {
        count = 0;
    }
}
