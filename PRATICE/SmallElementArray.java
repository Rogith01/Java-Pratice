public class SmallElementArray {
    public static void main(String[] args) {
        int[] numbers={10,20,50,4,5,90,89};
        int min=numbers[0];
        for(int i=1;i<numbers.length;i++){
            if(numbers[i]< min){
                min = numbers[i];
            }
        }
        System.out.println(min);

    }
}
