    public class SortingAlgorithms
    {
        public static void selectionSort(int a[])
        {
            int minValueIndex;
            minValueIndex = 0;

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

            }


        }
        public static void insertionSort(int a[])
        {

            for (int numberIndex = 1; numberIndex < a.length; numberIndex++)
            {
                int currentIndex = numberIndex;
                while(currentIndex > 0 && a[currentIndex] < a[currentIndex - 1])
                {
                    int temp = a[currentIndex];
                    a[currentIndex] = a[currentIndex - 1];
                    a[currentIndex - 1] = temp;
                    currentIndex--;
                }

            }
        }

        public static void mergeSort(int a[])
        {
            if (a.length <= 1)
            {
                return;
            }

            int mid = a.length / 2;
            int[] left = new int[mid];
            int[] right = new int[a.length - mid];

            for (int i = 0; i < mid; i++)
            {
                left[i] = a[i];
            }
            for (int i = 0; i < a.length - mid; i++)
            {
                right[i] = a[mid + i];
            }


            mergeSort(left);
            mergeSort(right);
            merge(a,left,right);


        }
        public static void merge(int[] a, int[] left, int[] right)
        {
            int i, j, k;
            j = k = i = 0;

            while (i < left.length && j < right.length)
            {
                if (left[i] <= right[j])
                {
                    a[k] = left[i];
                    i++;
                }
                else
                {
                    a[k] = right[j];
                    j++;
                }
                k++;
            }

            while (i < left.length)
            {
                a[k] = left[i];
                i++;
                k++;
            }

            while (j < right.length)
            {
                a[k] = right[j];
                j++;
                k++;
            }
        }
    }
