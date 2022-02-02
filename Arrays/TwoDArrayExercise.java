public class TwoDArrayExercise{
    public static void main(String[] args){
        // 1. Create a two-dimensional array based on the table given above. 
        // Remember that you're only storing the data in the table, not the labels 
        // (i.e., just worry about the numbers for this step, not the names).
        double [][] cookieSales = {{4559.49, 8860.30, 2291.90, 8550.84},
                                   {7946.93, 9703.66, 9924.06, 531.69},
                                   {5027.48, 8050.74, 3715.77, 9573.72},
                                   {866.44, 2310.67, 2749.98, 3747.57},
                                   {5133.77, 1812.53, 2690.81, 399.51}};
                                   
        //2. Print the data (just the numbers for now)
        for(int row = 0; row < cookieSales.length; row++){
            for(int col = 0; col < cookieSales[0].length; col++){
                System.out.print(cookieSales[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println(); // just to give room to make it easier to read
        
        //3. Calculate and display the total sales (i.e., sum all the values in the table).
        double totalSales = 0;
        for(int row = 0; row < cookieSales.length; row++){
            for(int col = 0; col < cookieSales[0].length; col++){
                totalSales += cookieSales[row][col];
            }
            System.out.println("row " + row + " total = " + totalSales);
        }
        //System.out.printf("Total sales for 2021: $%,.2f%n",totalSales); 
        // could also do the above line with println like this
        System.out.println("Total sales for 2021: $" + String.format("%,.2f",totalSales));
        System.out.println(); // more empty space for beautification
        
        //4. Calculate and display the total sales for each cookie.
//         for(int col = 0; col < cookieSales[0].length; col++){
//             double cookieTotal = 0;
//             for(int row = 0; row < cookieSales.length; row++){
//                 cookieTotal += cookieSales[row][col];
//             }
//             System.out.printf("Total sales for cookie #%d: $%,.2f%n", (col+1), cookieTotal);
//         }
        
        // Extra Challenge Stuff
        // #3. Print cookie name from 1D array when printing cookie total
        String[] cookies = {"Tagalongs", "Trefoils", "Thin Mints", "Samoas"};
        for(int col = 0; col < cookieSales[0].length; col++){
            double cookieTotal = 0;
            for(int row = 0; row < cookieSales.length; row++){
                cookieTotal += cookieSales[row][col];
            }
            System.out.printf("Total sales for %s: $%,.2f%n", cookies[col], cookieTotal);
        }
        
        // #2. Display average per scout
        String[] scouts = {"Jet", "Dana", "Ayanna", "Olivia", "Denise"};
        for(int row = 0; row < cookieSales.length; row++){
            double scoutTotal = 0;
            for(int col = 0; col < cookieSales[0].length; col++){
                scoutTotal += cookieSales[row][col];
            }
            double average = scoutTotal/cookieSales[0].length;
            System.out.printf("Average sales for %s: $%,.2f%n", scouts[row], average);
        }
    }
}