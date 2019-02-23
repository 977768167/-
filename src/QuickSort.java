public class QuickSort {
/*
 *快速排序，采用分治法，选择基准数，用两个变量指向两头，先从右开始依次遍历比基准数小的，停下，再从左开始找到比
 * 基准数大的，交换双方位置，直到两个变量重合，分治递归依次执行。完成。
 */

    public static void swap(int[] arr,int a,int b){
        arr[a]=arr[a]+arr[b];
        arr[b]=arr[a]-arr[b];
        arr[a]=arr[a]-arr[b];
    }
    public static void quickSort(int[] a,int left,int right){
        int i,j,temp;
        if(left > right)
            return;
        temp=a[left];
        i=left;
        j=right;
        while (i!=j){
            while (a[j]>temp&&i<j)
                j--;
            while (a[i]<temp&&i<j)
                i++;
            if (i<j)
                swap(a,i,j);
        }

        quickSort(a,left,i-1);
        quickSort(a,i+1,right);
    }
    public static void main(String[] args){

        int[] a={7,4,8,9,6,5,3,2,1,13};
        quickSort(a,0,a.length-1);

        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+",");
        }
    }
}
