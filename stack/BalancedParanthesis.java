import java.util.Stack;

public class BalancedParanthesis {

	public static void main(String[] args) {
		System.out.println(isParanthesisBalanced("{{(()}}"));
	}

	private static boolean isParanthesisBalanced(String expr) {
		boolean isBalanced = true;
		Stack<Character> stack = new Stack<>();
		
		for(int i=0;i<expr.length();i++){
			char ch = expr.charAt(i);
			if(ch=='{' || ch=='(' || ch=='['){
				stack.push(ch);
			}else if(ch==')'){
				if(stack.pop()=='('){
					continue;
				}else{
					isBalanced = false;
					break;
				}
			}else if(ch=='}'){
				if(stack.pop()=='{'){
					continue;
				}else{
					isBalanced = false;
					break;
				}
			}else if(ch==']'){
				if(stack.pop()=='['){
					continue;
				}else{
					isBalanced = false;
					break;
				}
			}
		}
		
		return isBalanced;
	}

}
