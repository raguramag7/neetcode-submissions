class Solution {
    public int maxDepth(String s) {
        char[] arr = s.toCharArray();
        Stack<Character> st=new Stack<>();
        int max=0;

        for(char ch :arr){
            if(ch == '(') {
                st.push(ch);
                max=Math.max(max, st.size());
            } else if(ch == ')') {
                st.pop();
            }

        } 
        return max;

    }
}