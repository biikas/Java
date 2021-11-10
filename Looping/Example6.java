class Example6{
    public static void main(String args[]){
        int x;
        for(x=0;x<=50;x+=1){
            if (x % 4== 0 & x % 5 == 0){
                System.out.println(x+  " is divsible by 4 and 5");
            } 
            else{
                System.out.println(x+" not");
            }   
        }
    }
}