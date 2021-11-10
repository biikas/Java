// if (***condition**) statement;
// a program to find greatest number 
class Example3{
    public static void main(String args[]){
        int a,b,c;
        a = 1234;
        b = 9666;
        c = 7777;
        if ( a > b & a > c){
            System.out.println("A is greatest");
        }
        else if (b > a & b > c){
            System.out.println("B is greatest");
        }
        else{
            System.out.println("C is greatest");
        }

    }
}