import java.util.Arrays;
import java.lang.Math;

public class Main{
  
  public static void main(String[] args){
    int[][] farm = {{0,1,1,0,1}, {1,1,0,1,0}, {0,1,1,1,0}, {1,1,1,1,0}, {1,1,1,1,1}, {0,0,0,0,0}};
    System.out.print(calculateMaxFarmLand(farm));
  }
  
  public static int calculateMaxFarmLand(int[][] farm){
    int[][] ea = new int[farm.length][farm[0].length];
    Arrays.stream(ea).forEach(row -> Arrays.fill(row, -1));
    
    int max = 0;
    for(int i = 0; i < farm.length; i++){
      for(int j = 0; j < farm[0].length; j++){
        max = Math.max(max, evaluateMaxDiagonal(farm, ea, i, j));
      }
    }
    
    return max*max;
  }

  public static int evaluateMaxDiagonal(int[][] arr, int[][] dpArr, int i, int j){
    if(i >= arr.length || j >= arr[0].length){
      return 0;  
    }
    if(dpArr[i][j] == -1){
      dpArr[i][j] = arr[i][j] == 0 
      ? 0 
      : 1 + Math.min(Math.min(evaluateMaxDiagonal(arr, dpArr, i + 1, j), evaluateMaxDiagonal(arr, dpArr, i, j + 1)), evaluateMaxDiagonal(arr, dpArr, i + 1, j + 1));
    }
    return dpArr[i][j];
  }
}
