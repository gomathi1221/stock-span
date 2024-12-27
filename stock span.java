class Solution {
    // Function to calculate the span of stock's price for all n days.
    public ArrayList<Integer> calculateSpan(int[] arr) {
       ArrayList<Integer>list=new ArrayList<>();
       Stack<Integer>st=new Stack<>();
       for(int i=0;i<arr.length;i++){
           while(!st.empty()&&arr[st.peek()]<=arr[i]){
               st.pop();
           }
           if(st.empty()){
               list.add(i+1);
           }
           else{
             list.add(i-st.peek());  
           }
           
           st.push(i);
       }
       return list;
    }
}