public class Assignmnt_array {
    public static boolean check(int nums[]){
        
        for(int i=0; i<nums.length; i++){
            for(int j=i; j<nums.length; j++){
                if(nums[j] == nums[i]){
                    return true;
                }
                
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("Hello World");
		int nums[] = {1,2,3,1};
		
	     Boolean a = check(nums);
	     System.out.println(a);
    }
    
}
