public class task1_2 {
    public static void main(String[] args) {
        int i = 0;
        int num = 0;
    
        String simpleNums = "";

        for (i = 1; i <= 1000; i++) { 		  	  
            int counter = 0; 	  
            for(num = i; num >= 1; num--) {
                if (i % num == 0) {
                    counter = counter + 1;
                }
            }
        
            if (counter == 2) {
                simpleNums = simpleNums + i + " ";
            }	
        }	
        System.out.println("Simple numbers from 1 to 1000 are:");
        System.out.println(simpleNums);
    }
}
