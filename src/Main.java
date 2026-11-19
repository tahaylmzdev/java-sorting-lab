import java.util.Scanner;
public class Main
{
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
        int[] numbers = {20,2,12,6,25};

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
                Enter your choice: """);
        int choice = scanner.nextInt();

        switch (choice)
        {
            case 1:
                System.out.println("Selection Sort selected");
                SortingAlgorithms.SelectionSort(numbers);
                break;
            case 2:
                System.out.println("Insertion Sort selected");
                SortingAlgorithms.InsertionSort(numbers);
                break;
            case 3:
                System.out.println("Merge Sort selected");
                System.out.println("Not implemented yet");
                break;
            default:
                System.out.println("Invalid choice!");
                break;
        }
    }
}
