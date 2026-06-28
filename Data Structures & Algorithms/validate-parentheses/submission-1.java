class Solution {
    public boolean isValid(String s) {
        char[] parentheses = s.toCharArray();
        Set<Character> openParentheses = Set.of('(', '{', '[');
        Map<Character, Character> reverseBrackets = Map.of(')', '(', 
                                                          ']', '[',
                                                          '}', '{'
                                                         );
        Deque<Character> stack = new ArrayDeque<>();
        for (char bracket : parentheses) {
            if (openParentheses.contains(bracket)) {
                stack.push(bracket);
            } else if (stack.size() > 0) {
                Character reverseBracket = reverseBrackets.get(bracket);
                Character stackBracket = stack.pop();
                if (!Objects.equals(reverseBracket, stackBracket)) return false;
            } else {
                return false;
            }
        }

        return stack.isEmpty();
    }


}
