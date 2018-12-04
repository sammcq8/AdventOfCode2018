import java.util.*;
import java.io.*;
class day1chal1{
   public static void main(String args[]) throws IOException{
      File file = new File("day1input.txt");
      List<Integer> frequencies = new ArrayList<Integer>();
      String line;
      
      int number;
      int frequency = 0;
      boolean ans = false;
      int count = 0;
      while (!ans){

         Scanner fileScanner = new Scanner(file);

         while (fileScanner.hasNext()){
            line = fileScanner.nextLine();
            number = Integer.parseInt(line.substring(1));
   
            if (line.substring(0,1).equals("+")){
               if(frequencies.contains(frequency+number)){
                  System.out.println(frequency+number);
                  ans = true;
                  break;
               }
               else{
                  frequency = frequency + number;
                  frequencies.add(frequency);
               }
            }
            if (line.substring(0,1).equals("-")){
              if(frequencies.contains(frequency-number)){
                  System.out.println(frequency-number);
                  ans = true;
                  break;
               }
               else{
                  frequency = frequency - number;
                  frequencies.add(frequency);
               }         
            }
   
            
         }
      }

      
      
   }

}