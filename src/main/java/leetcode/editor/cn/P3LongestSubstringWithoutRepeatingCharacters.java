//给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。 
//
// 
//
// 示例 1: 
//
// 
//输入: s = "abcabcbb"
//输出: 3 
//解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
// 
//
// 示例 2: 
//
// 
//输入: s = "bbbbb"
//输出: 1
//解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
// 
//
// 示例 3: 
//
// 
//输入: s = "pwwkew"
//输出: 3
//解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
//     请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
// 
//
// 
//
// 提示： 
//
// 
// 0 <= s.length <= 5 * 10⁴ 
// s 由英文字母、数字、符号和空格组成 
// 
// Related Topics 哈希表 字符串 滑动窗口 👍 7733 👎 0

package leetcode.editor.cn;

import java.util.ArrayList;

//Java : 无重复字符的最长子串
public class P3LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args){
        Solution solution = new P3LongestSubstringWithoutRepeatingCharacters().new Solution();
        // TO TEST 
    
    }
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] arr = s.toCharArray();
        ArrayList<String> list = new ArrayList<String>();
        for(int i =0;i<arr.length;i++){

            String s1 = arr[i] + "";
            for(int j =i+1;j<arr.length;j++){

                if(!(s1.contains(arr[j]+""))){
                    s1 = s1 + arr[j];
                }else{
                    break;
                }

            }
            list.add(s1);
        }
        int max = 0;
        for (String s1 : list) {
            if(s1.length()>max){
                max = s1.length();
            }
        }
        return max;


    }
}
//leetcode submit region end(Prohibit modification and deletion)

}

