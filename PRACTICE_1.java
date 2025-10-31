public class main{
    public static void main(String[]args){
        int []arr = {1,2,9,4,5,10,10};
        int min=Integer.MAX_VALUE;
        int sec_min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                sec_min = min;
                min =arr[i];
            }
             else if (arr[i] < sec_min && arr[i] != min) {
                sec_min = arr[i];
            }
        }
        System.out.println(min);
         System.out.println(sec_min);
    }
}
