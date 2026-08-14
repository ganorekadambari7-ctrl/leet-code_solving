class Solution {
    public List<String> letterCombinations(String digits) {

        List<String> result = new ArrayList<>();

        if (digits.length() == 0) {
            return result;
        }

        String[] phone = {
            "", "", "abc", "def", "ghi",
            "jkl", "mno", "pqrs", "tuv", "wxyz"
        };

        result.add("");

        for (char digit : digits.toCharArray()) {

            String letters = phone[digit - '0'];

            List<String> temp = new ArrayList<>();

            for (String combination : result) {

                for (char letter : letters.toCharArray()) {
                    temp.add(combination + letter);
                }
            }

            result = temp;
        }

        return result;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna