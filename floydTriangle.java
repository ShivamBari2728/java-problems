class FloydTriangle{
    public static void main(String[] args){
        int number = 1;
        int rows = 4;
        for(int i =1;i<=rows;i++){
            for(int j=0;j<i;j++){
                System.out.print(number);
                System.out.print(" ");
                number++;
                
            }
            System.out.println();
        } 
    }
}