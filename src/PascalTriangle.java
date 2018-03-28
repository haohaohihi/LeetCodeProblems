import java.util.ArrayList;
import java.util.List;

/**
 * Created by haohao on 17-7-21.
 */
/* Problem 118
Given numRows, generate the first numRows of Pascal's triangle.
For example, given numRows = 5,
Return
[
     [1],
    [1,1],
   [1,2,1],
  [1,3,3,1],
 [1,4,6,4,1]
]
*/

public class PascalTriangle {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> resultList = new ArrayList<>();
        for(int i=0; i<numRows; i++){
            List<Integer> newList = new ArrayList<>();
            for(int j=0; j<=i; j++){
                if(j==0 || j==i)
                    newList.add(1);
                else{
                    newList.add(resultList.get(i-1).get(j-1) + resultList.get(i-1).get(j));
                }
            }
            resultList.add(newList);
        }
        return resultList;
    }
}
