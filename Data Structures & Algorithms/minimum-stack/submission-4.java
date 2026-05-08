class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> minstack;

    public MinStack() {
        stack=new Stack<>();
        minstack=new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);
        if(minstack.isEmpty()){
            minstack.push(val);
        }else{
            int min =Math.min(minstack.peek(),val);
            minstack.push(min);
        }   
    }
    
    public void pop() {
        if(stack.peek()==minstack.peek()){
            stack.pop();
            minstack.pop();
        }else{
            stack.pop();
            minstack.pop();
        }
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minstack.peek();
    }
}
