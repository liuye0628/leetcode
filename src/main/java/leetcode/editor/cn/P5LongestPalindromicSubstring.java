//给你一个字符串 s，找到 s 中最长的回文子串。 
//
// 
//
// 示例 1： 
//
// 
//输入：s = "babad"
//输出："bab"
//解释："aba" 同样是符合题意的答案。
// 
//
// 示例 2： 
//
// 
//输入：s = "cbbd"
//输出："bb"
// 
//
// 
//
// 提示： 
//
// 
// 1 <= s.length <= 1000 
// s 仅由数字和英文字母组成 
// 
// Related Topics 字符串 动态规划 👍 5361 👎 0

package leetcode.editor.cn;

import java.util.ArrayList;

//Java : 最长回文子串
public class P5LongestPalindromicSubstring {
    public static void main(String[] args){
        Solution solution = new P5LongestPalindromicSubstring().new Solution();
        // TO TEST
        System.out.println(solution.longestPalindrome("abb"));
    
    }
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String longestPalindrome(String s) {

        if( s == null || s.length() <1){
            return "";
        }

        /*ArrayList<String> list = new ArrayList<>();
        for(int i = 0; i<s.length() ;i++){
            StringBuilder sb = new StringBuilder();
            for( int j = i; j<s.length()-i;j++){
               sb.append(s.charAt(j));
               StringBuilder sb1 = new StringBuilder(sb.toString());
               sb1.reverse();
               if(sb.toString().equals(sb1.toString())){
                   list.add(sb.toString());
               }
            }
        }
        int max = 0;
        for( String word : list){
            //System.out.println(word);
            if(word.length() >= max){
                max = word.length();
            }
        }
        //System.out.println(max);
        String result = "";
        for( String word : list){
            if(word.length() == max){
                //System.out.println(word);
                result = result + word;
                break;
            }
        }

        return result;*/
        int len = s.length();
        boolean [][] dp = new boolean[len][len];
        String result = "";
        for(int i=len-1;i>=0;i--){
            for(int j = i;j<len;j++){
                if(s.charAt(i)==s.charAt(j) &&(j -i <=1 || dp[i+1][j-1])){
                    dp[i][j] = true;
                }
                if(dp[i][j] && (j -i +1)>result.length()){
                    result= s.substring(i,j+1);
                }
            }
        }

        return result;



    }
}
//leetcode submit region end(Prohibit modification and deletion)

}

