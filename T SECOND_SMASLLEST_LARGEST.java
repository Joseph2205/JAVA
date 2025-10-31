public class main{
    public static void main(String[]args){
        int []arr = {5,5,5};
        int min=Integer.MAX_VALUE;
        int sec_min=Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sec_max = Integer.MIN_VALUE;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                sec_min = min;
                min =arr[i];
            }
             else if (arr[i] < sec_min && arr[i] != min) {
                sec_min = arr[i];
            }
            if(arr[i]>max){
                sec_max=max;
                max = arr[i];
            }
            else if(arr[i]>sec_max && arr[i]!=max){
                sec_max = arr[i];
            }
        }
        if(sec_min==Integer.MAX_VALUE){
              System.out.println(-1);
        }else
        System.out.println(sec_min);
       // System.out.println(min);
         
         // System.out.println(max);
         if(sec_max==Integer.MIN_VALUE){
             System.out.println(-1);
         }
         else
         System.out.println(sec_max);
    }
}
