import java.util.Stack;
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Stack<Character> stack = new Stack<>();
        
        for(int i=0;i<s.length();i++) {
            char ch=s.charAt(i);
            // '('이면 스택에 저장
            if(ch=='(') {
                stack.push(ch);
            }
            // ')'이면
            else {
                // 스택이 비어있지 않다면
                if(!stack.isEmpty()) {
                    // 스택 상단의 값이 '('이면
                    if(stack.peek()=='(') {
                        // 스택에서 괄호 꺼내기
                        stack.pop();
                        continue;
                    }
                }
                answer=false;
                break;
            }
        }
        
        // 스택이 비어있지 않으면 false 반환
        if(!stack.isEmpty()) {
            answer=false;
        }

        return answer;
    }
}
