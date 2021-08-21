import java.util.Scanner;

public class GUI {
    Scanner scan = new Scanner(System.in);
    int choice = -1;

    public void showOptions() {
        do {
            System.out.print("┌---------------------------------┐\n| Hvordan skal listen sorteres?   |\n|                                 |\n| (1) - BubbleSort                |\n" +
                    "| (2) - BubbleSort, med break     |\n| (3) - SelectionSort             |\n| (4) - MergeSort                 |\n" +
                    "| (5) - InsertionSort             |\n|                                 |\n| (9) - Exit                      |\n└---------------------------------┘\n==> ");
            choice = scan.nextInt();
            switch (choice) {
                case 1:
                    BubbleSort.sort(ListForSort.getArray());
                    break;
                case 2:
                    BubbleSort.sortWithBreak(ListForSort.getArray());
                    break;
                case 3:
                    SelectionSort.sort(ListForSort.getArray());
                    break;
                case 4:
                    MergeSort.mergeSort(ListForSort.getArray(), ListForSort.getSize());
                    MergeSort.resetCount();
                    break;
                case  5:
                    InsertionSort.sort(ListForSort.getArray());
                    break;
            }
        } while (choice != 9);
    }
}
