package Daily;

public class Sorting {
    private int[] nums;
    public Sorting(int[] array) {
        nums = array;
    }

    public int[] sort() {
        int[] sortedList = new int[2];
        sortedList[0] = nums[0];

        boolean biggest = false;
        int lastIndex;
        for (int i = 1;i<nums.length;i++) {
            for (int j = 0; j < sortedList.length; j++) {
                biggest = false;
                if (nums[i] <= sortedList[j]) {
                    for (int k = sortedList.length-1; k > j; k--) {
                        sortedList[k] = sortedList[k-1];
                    }
                    sortedList[j] = nums[i];
                    biggest = false;
                    sortedList = increaseCapacity(sortedList);
                    break;
                }
                biggest = true;
            }
            if (biggest) {
                sortedList[sortedList.length-1] = nums[i];
                sortedList = increaseCapacity(sortedList);
            }
        }
        return sortedList;
    }

    public int[] increaseCapacity(int[] array) {
        int[] tempArray = new int[array.length+1];
        for (int i = 0; i < array.length; i++) {
            tempArray[i] = array[i];
        }
        return tempArray;
    }

    public int[] decreaseCapacity(int[] array) {
        int[] tempArray = new int[array.length-1];
        for (int i=0;i<array.length-1;i++) {
            tempArray[i] = array[i];
        }
        return tempArray;
    }
}