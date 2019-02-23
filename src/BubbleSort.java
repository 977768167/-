public class BubbleSort {
    /*
     *冒泡排序
     */
    public static void swap(int[] arr,int a,int b){
        arr[a] = arr[a]+arr[b];
        arr[b] = arr[a]-arr[b];
        arr[a] = arr[a]-arr[b];
    }
    public static void main(String[] args){
        int[] a={7,4,8,9,6,5,3,2,1};
        for (int i=0;i<a.length-1;i++){
            for (int j=0;j<a.length-1-i;j++)
            if(a[j]<a[j+1]){
                swap(a,j,j+1);
            }
        }
        for (int i=0;i<a.length;i++)
        System.out.print(a[i]+",");
    }
}
