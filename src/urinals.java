import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
public class urinals {
    static BufferedReader file_ff;
    static ArrayList<Integer> l = new ArrayList<>();

    public static int number_of_free_urinals(String urinals) {
        // Returns the number of free available urinals as per the rule.
        //Base Cases
        if (urinals.contains("11")) return -1;
        if (urinals.equals("0")) return 1;
        if (urinals.equals("1")) return 0;
        if (urinals.length()>20) return -1;
        char[] urinals_array = urinals.toCharArray();
        int counter = 0;

        for (int i = 0; i < urinals_array.length - 1; i++) {
            if (i == 0) {
                if (urinals_array[i] == '0' && urinals_array[i + 1] == '0') {
                    urinals_array[i] = '1';
                    counter++;
                }
            }
            if (i > 0) {
                if (urinals_array[i] == '0' && urinals_array[i - 1] == '0' && urinals_array[i + 1] == '0') {
                    urinals_array[i] = '1';
                    counter++;
                }
            }
        }
        if (urinals_array[urinals_array.length - 1] == '0' && urinals_array[urinals_array.length - 2] == '0') {
            counter++;
        }
        return counter;
    }


    public static void get_input_string(){
        // Function to take the input from the keyboard.
        Scanner sc = new Scanner(System.in);
      while(true)
      {System.out.println("Enter the keyboard input from urinals:");
          String input_string = sc.next();
        if(input_string.equals("-1")) {
           break;
  }
  int out =number_of_free_urinals(input_string);
  System.out.print("Free urinals that can be used as per the unwritten rule:" + out);
      }
    }

    public static void openFile() {
        try {
          System.out.println("open file");
          file_ff=new BufferedReader(new FileReader("src/urinal.dat"));
        } catch (FileNotFoundException e) {
            //
        }
    }
    public static void readFromFile() {
        String line;
        l = new ArrayList<>();
        try {
//            System.out.println("reading");

            if((line = file_ff.readLine()) == null)
                return;
            while((line) != null) {

                    l.add(number_of_free_urinals(line));
                line = file_ff.readLine();
            }
        } catch (IOException e) {
            //
        }
    }
    public static void writeToFile() {
        int counter = 1;
        File  f = new File("rule.txt");
        while(f.exists()) {
            f = new File("rule" + counter + ".txt");
            counter++;
        }
        FileWriter out;
        try {
            out = new FileWriter(f);
        } catch (IOException e) {
            return;
        }
        for (Integer integer : l) {
            try {
                out.write(integer + "\n");
            } catch (IOException e) {
                return;
            }
        }
        try {
            out.close();
        } catch (IOException e) {
            //
        }
    }



    public static Boolean gbstring(String input_string){
        // checks to see if valid string is given as input
        if (input_string.length()>20) return false;
        if (input_string.contains("11")) return false;
        char[] urinals_array = input_string.toCharArray();
        for (int i = 0; i < urinals_array.length - 1; i++){
            if(urinals_array[i]!='0' && urinals_array[i]!='1'){
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        //get_input_string();
        openFile();
        readFromFile();
        writeToFile();



    }
}