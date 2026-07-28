class GcdOfTwoNumbers{
    public static void main(String[] args) {
        int firstNumber = 17;
        int secondNumber = 29;
        int gcd = 0;
        int i =1;
        while(i<=firstNumber || i<= secondNumber){
            if((firstNumber%i) == 0 && (secondNumber%i) ==0){
                gcd=i;
            }
            i++;
        }
        System.out.println(gcd);
    }
}