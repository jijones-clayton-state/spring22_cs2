public class TwoDArrayExamples{
    public static void main(String[] args){
        // since we already know the values up front
        // we can just initialize the array to those values
        int[][] courses = {{2, 2, 1, 3, 0},
                           {3, 1, 6, 2, 1},
                           {0, 2, 4, 6, 8}};
        System.out.println(courses);  // doesn't do what we need it to do
        
        // print the values in the array using nested for loops
        for(int row = 0; row < 3; row++){
            for(int col = 0; col < 5; col++){
                System.out.print(courses[row][col] + " ");
            }
            System.out.println();
        }                  
        
    }
}