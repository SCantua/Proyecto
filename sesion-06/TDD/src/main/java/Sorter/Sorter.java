package Sorter;
public class Sorter {
    public static int[] sort(int[] unSortedList) {
        if (unSortedList.length <= 1) return unSortedList;

        int temp;
        for (int i = 0; i < unSortedList.length; i++){
            for (int j = i+1; j < unSortedList.length; j++){
                if(unSortedList[i]>unSortedList[j]){
                    temp = unSortedList[i];
                    unSortedList[i]=unSortedList[j];
                    unSortedList[j]=temp;
                }
            }
        }

        return unSortedList;
    }
}
