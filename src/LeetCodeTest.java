import org.junit.jupiter.api.Test;

/**
 * @Title: LeetCodeDemo
 * @Auth: lenovo
 * @Date: 2018/9/22
 */
public class LeetCodeTest {

//    @Test
    public void Test() {
        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//        int[][] a = {{1, 2, 3}, {4, 5, 6}};
        int[][] rrr = transpose(a);

        for (int i = 0; i < rrr.length; i++) {
            for (int j = 0; j < rrr[i].length; j++) {
                System.out.println(rrr[i][j]);
            }
            System.out.println("");
        }

    }

    public int[][] transpose(int[][] A) {
        int[][] result = new int[A.length][A[0].length];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = A[j][i];
            }
        }
        return result;
    }

    @Test
    public void Test2() {

        int[] arr = {1, 4, 3, 2, 7, 8, 10, 11};
        System.out.println(arrayPairSum(arr));

    }

    public int arrayPairSum(int[] nums) {
        int[] tempArr = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }

        int sums = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                sums += nums[i];
            }
        }

        return sums;
    }
}