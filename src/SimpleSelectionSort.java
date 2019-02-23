import java.util.ArrayList;
import java.util.LinkedList;

/*
 *简单选择排序
 * 从数组中选出最小的元素放在未排序顶部，循环执行
 */
public class SimpleSelectionSort {
    public static void swap(int []arr,int a,int b){
        arr[a] = arr[a]+arr[b];
        arr[b] = arr[a]-arr[b];
        arr[a] = arr[a]-arr[b];
    }

    public static void main(String[] args){

        int[] a={7,4,8,9,6,5,3,2,1};

        for (int i=0;i<a.length-1;i++){
            int min=i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
                if (min!=i){
                    swap(a,i,min);
                }
            }
        }
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+",");
        }
    }
}
