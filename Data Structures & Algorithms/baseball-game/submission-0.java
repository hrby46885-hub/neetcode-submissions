class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<> () ;
        for (String ops:operations){
            if (ops.equals("+")){
                int top = stack.pop();
                int newtop = top + stack.peek();
                stack.push(top);
                stack.push(newtop);}
            else if (ops.equals("D")){
                stack.push(2 * stack.peek());

            }

            else if (ops.equals("C")){
                stack.pop();
            }
            else{
                stack.push(Integer.parseInt(ops));
            }
        }
    int sum = 0;
    for (int n : stack){
        sum+=n;
    }
    return sum ;

        
    }
}