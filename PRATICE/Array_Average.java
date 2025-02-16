public class Array_Average {
    public static void main(String[] args) {
        int[] array = {4,5,6};
        float avg,sum=0;
        int length=array.length;
        for(int i=0;i<array.length;i++)
        {
            sum+=array[i];
        }
        avg=sum/length;
        System.out.println(sum);
        System.out.println(avg);
    }
}
