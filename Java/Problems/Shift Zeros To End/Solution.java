import java.util.Arrays;
class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int[] arr = {0, 1, 0, 0, 2, 5, 0, 0, 2, 3, 5, 0, 0 , 10, 11};
        shiftZeros(arr);
        System.out.print(Arrays.toString(arr));
    }
    
    // program to shift all the zeros to the end
    public static void shiftZeros(int[] arr){
        int pos = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0){
                if(pos != i) {
                    arr[pos] = arr[i];
                    arr[i] = 0;
                }
                pos++; 
            }
        }
    }
}
