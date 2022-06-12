import javax.print.attribute.standard.NumberOfDocuments;

public class RemoveElement {
    public int removeElement(int [] nums,int val){

        int duplicateElementCount = 0;
        for(int i=0;i<nums.length;i++){
              if(nums[i] != val){
                nums[duplicateElementCount++] = nums[i];
              }  
        }
        
        return duplicateElementCount;
    }
   public static void main(String[] args) {
    RemoveElement re = new RemoveElement();
    int elementToRemove = 2;
    int[] arr = {0,1,2,2,3,0,4,2};
   int count =  re.removeElement(arr,elementToRemove);
   System.out.println("Cpount==> "+count);
   } 
}
