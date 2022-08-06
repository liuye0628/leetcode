//一个整型数组 nums 里除两个数字之外，其他数字都出现了两次。请写程序找出这两个只出现一次的数字。要求时间复杂度是O(n)，空间复杂度是O(1)。 
//
// 
//
// 示例 1： 
//
// 输入：nums = [4,1,4,6]
//输出：[1,6] 或 [6,1]
// 
//
// 示例 2： 
//
// 输入：nums = [1,2,10,4,1,4,3,3]
//输出：[2,10] 或 [10,2] 
//
// 
//
// 限制： 
//
// 
// 2 <= nums.length <= 10000 
// 
//
// 
// Related Topics 位运算 数组 👍 659 👎 0

package leetcode.editor.cn;

import java.util.HashMap;
import java.util.Set;

//Java : 数组中数字出现的次数
public class P剑指 Offer 56 - IShuZuZhongShuZiChuXianDeCiShuLcof {
    public static void main(String[] args){
        Solution solution = new P剑指 Offer 56 - IShuZuZhongShuZiChuXianDeCiShuLcof().new Solution();
        // TO TEST 
    
    }
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] singleNumbers(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if(!map.containsKey(num)){
                map.put(num,1);
            }else{
                map.put(num,map.get(num)+1);
            }

        }
        int[] a = new int[2];
        Set<Integer> set = map.keySet();
        for (Integer b : set) {
            int i =0;
            if(map.get(b)==1){
                a[i]=b;
                i++;
            }
        }
        return a;

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}

