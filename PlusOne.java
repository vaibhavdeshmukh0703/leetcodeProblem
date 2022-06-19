public class PlusOne {
    public static int[] plusOne(int[] array) {

         long arrayTotal = 0;
        for (int i : array) {
            arrayTotal = arrayTotal * 10 + i;
            System.out.print(arrayTotal);
        }
       
      long arrayTotalAfterAddingOne = arrayTotal +1;

       System.out.print(arrayTotal+"  -----  "+arrayTotalAfterAddingOne);
        if (arrayTotalAfterAddingOne < 9) {
            array[array.length - 1] = array[array.length - 1] + 1;
            return array;
        } else {
            String stringOfarrayTotalAfterAddingOne = String.valueOf(arrayTotalAfterAddingOne);
            int[] updatedPlusOneArray = new int[stringOfarrayTotalAfterAddingOne.length()];
            int count = stringOfarrayTotalAfterAddingOne.length();
            for(int i=0,j=count-1;i<stringOfarrayTotalAfterAddingOne.length()&& count>0;i++,j--){
                int divident = (int) (arrayTotalAfterAddingOne % 10);
                arrayTotalAfterAddingOne = arrayTotalAfterAddingOne / 10;

               updatedPlusOneArray[j] = divident;
                System.out.println("Divident-->"+divident+"number--->"+arrayTotalAfterAddingOne);
            }
           

            
           return updatedPlusOneArray;
        
        }
        }

    

    public static void main(String[] args) {
        int[] digitArray = { 7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,0,0,69,8,7,6,5,4,3,2,1,0};
        int[] newPlusOneArray = plusOne(digitArray);
        for (int i : newPlusOneArray) {
            System.out.println(i);
        }
    }
}
