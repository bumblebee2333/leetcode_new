package 排序基础总结;

public class Main {
    public static void main(String[] args) {
        int temp = 0;
        //先来个冒泡吧
        int[] a = {12,8,6,9,14,33,11,25,10};
//        for(int i=0;i<a.length;i++){
//            for(int j=0;j<a.length-i-1;j++){
//                if(a[j] > a[j+1]){
//                    temp = a[j];
//                    a[j] = a[j+1];
//                    a[j+1] = temp;
//                }
//            }
//        }

//        //选择排序
//        for(int i=0;i<a.length-1;i++){
//            for(int j=i+1;j<a.length;j++){
//                if(a[i] > a[j]){
//                    temp = a[i];
//                    a[i] = a[j];
//                    a[j] = temp;
//                }
//            }
//        }

        quickSort(a,0,a.length-1);


        //选择排序
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }

    public static void quickSort(int[] a,int low,int high){
        if(low < high){
            int pos = quickPass(a,low,high);
            quickSort(a,low,pos-1);
            quickSort(a,pos+1,high);
        }
    }

    public static int quickPass(int[] a,int low,int high){
        int res = a[low];
        while (low < high){
            while (a[high]>=res && low<high){
                --high;
            }
            a[low] = a[high];
            while (a[low] < res && low<high){
                ++low;
            }
            a[high] = a[low];
        }
        a[low] = res;
        return low;
    }
}

class Quickly{
    public int quickPass(int[] a,int low,int high){
        int res = a[low];
        while (low < high){
            while (a[high]>=res && low<high){
                --high;
            }
            a[low] = a[high];
            while (a[low] < res && low<high){
                ++low;
            }
            a[high] = a[low];
        }
        a[low] = res;
        return low;
    }
}
