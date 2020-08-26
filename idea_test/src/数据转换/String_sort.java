package 数据转换;

import java.util.Arrays;

public class String_sort {
    public static void main(String[] args) {
        String s="91 27 46 38 50";
        //把字符串中的数字数据存储到一个int类型的数组中
        String [] strArry=s.split(" ");
        //定义一个int数组，把string[]数组中的每一个元素存储到int数组中
        int[] arr=new int[strArry.length];
        for(int i=0;i<arr.length;i++){
            arr[i]=Integer.parseInt(strArry[i]);
        }
        //对int数组进行排序
        Arrays.sort(arr);
        //把排序后的int数组中的元素进行拼接得到一个字符串，这里拼接采用StringBuilder来实现
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<arr.length;i++){
            if(i==arr.length-1){
                sb.append(arr[i]);
            }else {
                sb.append(arr[i]).append(" ");
            }
        }
        String result=sb.toString();
        System.out.println(result);
    }
}
