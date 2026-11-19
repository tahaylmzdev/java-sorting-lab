import java.util.Scanner;
public class Main
{
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
        int[] numbers = {20,2,12,6,25,4,11,19};

        for (int i = 0; i < numbers.length; i++)
        {
            System.out.print(numbers[i] + " ");
        }

        menu(numbers);

    }
    public static void menu(int numbers[])
    {

        System.out.print("""
                
                
                Choose a sorting algorithm:
                1. Selection Sort
                2. Insertion Sort
                3. Merge Sort
                Enter your choice: 
                """);
        int choice = scanner.nextInt();

        switch (choice)
        {
            case 1:
                System.out.println("Selection Sort selected");
                SortingAlgorithms.SelectionSort(numbers);
                displayArray(numbers);
                break;
            case 2:
                System.out.println("Insertion Sort selected");
                SortingAlgorithms.InsertionSort(numbers);
                displayArray(numbers);
                break;
            case 3:
                System.out.println("Merge Sort selected");
                SortingAlgorithms.MergeSort(numbers);
                displayArray(numbers);
                break;
            default:
                System.out.println("Invalid choice!");
                break;
        }
    }
    public static void displayArray(int a[])
    {
        System.out.println("Sorted array: ");
        for(int k = 0; k < a.length; k++)
        {
            System.out.print(a[k] + " ");
        }
        System.out.println(" ");
    }
}
