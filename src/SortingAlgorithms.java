    public class SortingAlgorithms
    {
        public static void SelectionSort(int a[])
        {
            int minValueIndex;
            minValueIndex = 0;
            for(int k = 0; k < a.length; k++)
            {
                System.out.print(a[k] + " ");
            }
            System.out.println(" ");

            for(int selectedIndex = 0; selectedIndex < a.length - 1; selectedIndex++)
            {
                minValueIndex = selectedIndex;
                for(int compareIndex = selectedIndex + 1; compareIndex < a.length; compareIndex++)
                {
                    if (a[compareIndex] < a[minValueIndex])
                    {
                        minValueIndex = compareIndex;
                    }
                }
                if (minValueIndex != selectedIndex)
                {
                    int temp = a[selectedIndex];
                    a[selectedIndex] = a[minValueIndex];
                    a[minValueIndex] = temp;
                }

                for(int k = 0; k < a.length; k++)
                {
                    System.out.print(a[k] + " ");
                }
                System.out.println(" ");
            }


        }
        public static void InsertionSort(int a[])
        {
            for(int k = 0; k < a.length; k++)
            {
                System.out.print(a[k] + " ");
            }
            System.out.println(" ");

            for (int numberIndex = 1; numberIndex < a.length; numberIndex++)
            {
                int currentIndex = numberIndex;
                while(currentIndex > 0 && a[currentIndex] < a[currentIndex - 1])
                {
                    if (a[currentIndex] < a[currentIndex - 1])
                    {
                        int temp = a[currentIndex];
                        a[currentIndex] = a[currentIndex - 1];
                        a[currentIndex - 1] = temp;
                    }
                    currentIndex--;
                }
                for(int k = 0; k < a.length; k++)
                {
                    System.out.print(a[k] + " ");
                }
                System.out.println(" ");

            }
        }
    }
