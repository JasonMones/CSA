package Unit7.Lesson23;

/**
 * Write a description of class SortMerged here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SortMerged
{
    public static void main(String[] args) {
        int[] arr = {6,8,12,17,89,345,2342,2344,5,8,9,14,14,17,23,78};
        merge(arr, 0, 7, 15);
        for (int element : arr) {
            System.out.print(element + ", ");
        }
    }

    private static void merge(int[] a, int first, int mid, int last)
    {
        int index1 = first; int index2 = mid+1;
        int temp;
        while (index1 < last && index2 <= last) {
            //used to print out array segments while being sorted
            //with indications where the indexes are
            
            //if (index1 != 0) {
            //for (int x = 0; x < index1; x++) {
            //System.out.print(a[x] + ", ");
            //}
            //}
            //System.out.print("*" + a[index1] + ", ");
            //for (int y = index1+1; y < index2; y++) {
            //System.out.print(a[y] + ", ");
            //}
            //System.out.print("*" + a[index2] + ", ");
            //for (int z = index2+1; z < a.length; z++) {
            //System.out.print(a[z] + ", ");
            //}
            //System.out.println();
            if (a[index1] <= a[index2]) {
                index1++;
            }
            else if (a[index2] < a[index1]) {
                temp = a[index2];
                for (int j = index2; j >= index1; j--) {
                    try {a[j] = a[j-1];
                    } catch (Exception e) {};
                }
                a[index1] = temp;
                index1++;
                index2++;
            }
        }
    }
}
