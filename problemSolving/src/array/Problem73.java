package array;

import utility.Driver;
import utility.Pair;

import java.util.ArrayList;

public class Problem73 {

    public static void main(String[] args) {
      int[][] arr = Driver.twoDArrayInput();
      setMatrixZero(arr);
    }

    //Approach-1 with extra Space
    private static void setMatrixZero(int[][] mat) {
        ArrayList<Pair> arrayList = new ArrayList<>();
        for(int i=0;i< mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==0){
                    arrayList.add(new Pair(i,j));
                }
            }
        }
        for(int i =0;i<arrayList.size() ;i++){
            Pair pair = arrayList.get(i);
            int row = (int) pair.getFirst();
            int col = (int) pair.getSecond();
            for(int p=0;p<row;p++){

            }


        }
    }
}
