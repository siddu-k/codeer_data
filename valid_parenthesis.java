import java.util.Stack;
public class Main {
public static void main(String[] args){
 // System.out.println("hello");
 String arry = "([]";
 IsValid val = new IsValid();
 System.out.println(val.checkarry(arry));
}
}
class IsValid{

 boolean checkarry(String s){

  Stack<Character> stack = new Stack<>();
    for(char str : s.toCharArray()){
      if(str=='('||str=='{'||str=='['){
        stack.push(str);
      }else {
        if(stack.isEmpty()){
          return false;
        }
        char top=stack.pop();
        if(str==')'&&top!='('||str=='}'&&top!='{'||str==']'&&top!='['){
          return false;
        }
      }
    }
    
      return stack.isEmpty() ;
    

}
}