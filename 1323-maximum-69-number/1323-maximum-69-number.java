class Solution {
    public int maximum69Number (int n) {
        List<Integer> list = new ArrayList<>();
        if(n==6 || n==9) return 9;
        while(n!=0){
            list.add(n%10);
            n/=10;
        }
        for(int i=list.size()-1; i>=0; i--){
            if(list.get(i)==6){
                list.set(i,9);
                break;
            }
        }
        for(int i=list.size()-1; i>=0; i--){
            n = n*10 + list.get(i);
        }
        return n;
    }
}