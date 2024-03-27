package Unit7.Lesson23;

import java.util.*;
/**
 *  Description of the Class
 *
 * @author     Your Name Here
 * @created    Month Day, Year
 */
public class Sorts
{
    private long steps;

    /**
     *  Description of Constructor
     *
     * @param  list  Description of Parameter
     */
    Sorts()
    {
        steps = 0;
    }

    /**
     *  Description of the Method
     *
     * @param  list  reference to an array of integers to be sorted
     */
    public void bubbleSort(int[] list)
    {
        int nextInd; 
        boolean sorted = true;
        steps += 2;
        while (true) {
            steps += 3;
            sorted = true;
            for(int i = 0; i < list.length-1; i++) {
                steps += 3;
                if (list[i] > list[i+1]) {
                    nextInd = list[i+1];
                    list[i+1] = list[i];
                    list[i] = nextInd;
                    sorted = false;
                    steps += 4;
                }
            }
            steps++;
            if (sorted) {
                break;
            }
        }
    }

    /**
     *  Description of the Method
     *
     * @param  list  reference to an array of integers to be sorted
     */
    public void selectionSort(int[] list)
    {
        int smallest, smallestInd, temp;
        for (int i = 0; i < list.length - 1; i++) {
            smallest = list[i];
            smallestInd = i;
            steps+=5;
            for (int j = i; j < list.length; j++) {
                steps+=3;
                if (list[j] < smallest) {
                    smallest = list[j];
                    smallestInd = j;
                    steps+=2;
                }
            }
            temp = list[i];
            list[i] = smallest;
            list[smallestInd] = temp;
            steps+=3;
        }
    }

    /**
     *  Description of the Method
     *
     * @param  list  reference to an array of integers to be sorted
     */
    public void insertionSort(int[] list)
    {
        steps++;
        for (int outer = 1; outer < list.length; outer++)
        {
            steps+=4;
            int position = outer;
            int key = list[position];

            // Shift larger values to the right
            steps++;
            while (position > 0 && list[position - 1] > key)
            {
                list[position] = list[position - 1];
                position--;
                steps+=2;
            }
            list[position] = key;
            steps++;
        }
    }

    /**
     *  Takes in entire vector, but will merge the following sections
     *  together:  Left sublist from a[first]..a[mid], right sublist from
     *  a[mid+1]..a[last].  Precondition:  each sublist is already in
     *  ascending order
     *
     * @param  a      reference to an array of integers to be sorted
     * @param  first  starting index of range of values to be sorted
     * @param  mid    midpoint index of range of values to be sorted
     * @param  last   last index of range of values to be sorted
     */
    private void merge(int[] a, int first, int mid, int last)
    {
        int index1 = first; int index2 = mid+1;
        int temp;
        steps+=3;
        while (index1 < last && index2 <= last) {
            steps++;
            if (a[index1] <= a[index2]) { //nothing happens keep iterating
                index1++;
                steps++;
            }
            else if (a[index2] < a[index1]) { 
                temp = a[index2];
                for (int j = index2; j >= index1; j--) { //move array up starting at index2
                    try {
                        a[j] = a[j-1];
                    } catch (Exception e) {};
                    steps+=3;
                }
                a[index1] = temp;
                index1++;
                index2++;
                steps+=6;
            }
        }
    }

    /**
     *  Recursive mergesort of an array of integers
     *
     * @param  a      reference to an array of integers to be sorted
     * @param  first  starting index of range of values to be sorted
     * @param  last   ending index of range of values to be sorted
     */
    public void mergeSort(int[] a, int first, int last)
    {
        int middle;
        if (first < last) {
            middle = (last-first)/2 + first;
            steps+=2;
            mergeSort(a, first, middle);
            mergeSort(a, middle + 1, last);
            merge(a, first, middle, last);
        }
    }

    /**
     *  Recursive quicksort of an array of integers
     *
     * @param  a      reference to an array of integers to be sorted
     * @param  first  starting index of range of values to be sorted
     * @param  last   ending index of range of values to be sorted
     */
    public void quickSort(int[] list, int first, int last)
    {
        int g = first, h = last;
        int midIndex = (first + last) / 2;
        int dividingValue = list[midIndex];
        steps+=5;
        do
        {
            steps+=2;
            while (list[g] < dividingValue) {
                steps++;
                g++;
            }
            steps++;
            while (list[h] > dividingValue) {
                steps++;
                h--;
            }
            steps++;
            if (g <= h)
            {
                //swap(list[g], list[h]);
                int temp = list[g];
                list[g] = list[h];
                list[h] = temp;
                g++;
                h--;
                steps+=5;
            }
        }
        while (g < h);
        steps++;
        if (h > first) {
            quickSort (list,first,h);
            steps++;
        }
        steps++;
        if (g < last) {
            quickSort (list,g,last);
            steps++;
        }
    }

    /**
     *  Accessor method to return the current value of steps
     *
     */
    public long getStepCount()
    {
        return steps;
    }

    /**
     *  Modifier method to set or reset the step count. Usually called
     *  prior to invocation of a sort method.
     *
     * @param  stepCount   value assigned to steps
     */
    public void setStepCount(int stepCount)
    {
        steps = stepCount;
    }
}
