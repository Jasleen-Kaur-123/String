class Solution {
    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"}; // Example input
        Solution obj = new Solution();
        String result = obj.longestCommonPrefix(strs);
        System.out.println("Longest Common Prefix: " + result);
    }

    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        String prefix = strs[0]; // Start with the first string

        for (int i = 1; i < strs.length; i++) { // Start from index 1
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;
    }
}
