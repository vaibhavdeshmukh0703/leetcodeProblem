class a{
    a(){

    }
    public static void main(String[] args) {
       
        try {
           for(int i=1;i<=4;i++){
            for(int j=1; j<=i;j++)
            {
                System.out.print("*");
            }
          System.out.println("\n");
           }
        
        } catch(ArithmeticException e){
            System.out.println(e);
        }catch (Exception e) {
            //TODO: handle exception
            System.out.println("arithmatic exception");
        }
       
    }
}