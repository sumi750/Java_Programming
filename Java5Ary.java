import java.util.*; 
public class Java5Ary {

    public static void update(int marks[]){

        for(int i=0; i<marks.length; i++){
            marks[i] = marks[i] + 1;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of arrays");
        int[] marks  = new int[10];

        // taking input
        for(int i=0; i<10; i++){
            marks[i] = sc.nextInt();
        }

        System.out.println("output of array");
        for(int i=0; i<10; i++){
            System.out.print(marks[i] + " ");
        }
        System.out.println(); // new line
        System.out.println("lenght of array is " + marks.length);

        update(marks);

        // Arrays can change by call by refrence 
        System.out.println("updates array is : ");
        for(int i=0; i<10; i++){
            System.out.print(marks[i] + " ");
        }


        // linear search
        
    }
}
