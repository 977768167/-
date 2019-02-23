/*
 *直接插入排序
 * 将数组待排序的元素，插入到已排好的部分
 */
public class InsertSortDirectly {

    public static void swap(int []arr,int a,int b){
        arr[a] = arr[a]+arr[b];
        arr[b] = arr[a]-arr[b];
        arr[a] = arr[a]-arr[b];
    }
    public static void main(String[] args){

        int[] a={7,4,8,9,6,5,3,2,1};
        for (int i=1;i<a.length;i++){
            int j=i;
            while (j>0&&a[j]<a[j-1]){
                swap(a,j,j-1);
                j--;
            }
        }
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+",");
        }

    }
}
