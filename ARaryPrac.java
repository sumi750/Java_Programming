public class ARaryPrac {
    public static void main(String[] args) {
        // practice 1
        /*float marks[] = { 89.0f, 78.5f, 98.8f, 79.6f, 68.8f};
        float sum = 0;
        
        for(float element : marks){
            sum = sum + element;
            
        }
        System.out.println("The sum  is = " + sum); */

        // practice 2
        float marks[] = { 89.0f, 78.5f, 98.8f, 79.6f, 68.8f};
        float num = 8.0f;
        boolean isAnArray = false;
        for(float element : marks){
            if(num == element)
            isAnArray = true;
            break;
        }
        if(isAnArray){
            System.out.println("the value is present in array");
        }
        else{
            System.out.println("not present is array");
        }
        // practice 3
        float mark[] = { 89.0f, 78.5f, 98.8f, 79.6f, 68.8f};
        float sum = 0;
        
        for(float element : mark){
            sum = sum + element;
            
        }
        System.out.println("The Average of marks is  = " + sum/mark.length);
       

                          
    }
}
