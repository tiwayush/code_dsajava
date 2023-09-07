class buysell {
    public static void main(int[] prices) {
        int l=prices.length;int max=0;
        for(int i=0;i<l;i++){
            for(int j=i+1;j<l;j++){
                int a=prices[j]-prices[i];
                if(a>max){
                    max=a;
                }
                

            }
        }
        if(max>0){
            System.out.println(max);
        }
        else
        {
            System.out.println("0");
        }
        
    }
}