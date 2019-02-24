import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args){

        int[] arry={9,8,7,6,5,4,3,2,1};
        int[] temp=new int[arry.length];
        sort(arry,0,arry.length-1,temp);
        System.out.println(Arrays.toString(temp));
    }

    public static void sort(int[] arry,int left,int right,int[] temp){

        if (left<right) {
            int mid = (left + right) / 2;
            sort(arry, left, mid, temp);
            sort(arry, mid + 1, right, temp);
            merge(arry, left, mid, right, temp);
        }
    }

    public static void merge(int[] arry,int left,int mid,int right,int[] temp){
        int i,j,t=0;
        i=left;
        j=mid+1;

        while (i<=mid&&j<=right){
            if (arry[i]<=arry[j]){
                temp[t++]=arry[i++];
            }else {
                temp[t++]=arry[j++];
            }
        }
        while (i<=mid){
            temp[t++]=arry[i++];
        }
        while (j<=left){
            temp[t++]=arry[j++];
        }
//        t=0;
//        while(left <= right){
//            arry[left++] = temp[t++];
//        }
    }
}
