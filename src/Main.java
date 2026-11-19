import java.util.Scanner;
public class Main
{
    static Scanner scanner = new Scanner(System.in);
    static int[] numbers;

    public static void main(String[] args)
    {
        arrayInput();

        System.out.println("\nYour array: ");
        for (int i = 0; i < numbers.length; i++)
        {
            System.out.print(numbers[i] + " ");
        }

        menu(numbers);

    }
    public static void arrayInput()
    {
        System.out.println("Enter the size of your array: ");
        int arraySize = scanner.nextInt();

        while (arraySize <= 0)
        {
            System.out.println("Enter the size of your array: ");
            arraySize = scanner.nextInt();
        }
        numbers = new int[arraySize];
        for (int i = 0; i < numbers.length; i++)
        {
            System.out.printf("Enter your number %d element of array: ", i+1);
            numbers[i] = scanner.nextInt();
        }

    }
    public static void menu(int numbers[])
    {

        System.out.print("""
                
                
                Choose a sorting algorithm that you'd like to do:
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
                SortingAlgorithms.selectionSort(numbers);
                displayArray(numbers);
                break;
            case 2:
                System.out.println("Insertion Sort selected");
                SortingAlgorithms.insertionSort(numbers);
                displayArray(numbers);
                break;
            case 3:
                System.out.println("Merge Sort selected");
                SortingAlgorithms.mergeSort(numbers);
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
