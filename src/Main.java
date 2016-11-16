/**
 * Created by ml996 on 11/16/16.
 */

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args){
        String dir = System.getProperty("user.dir");
        //String fileName = "hi";
        String[] names = new String[75];
        String[][] subNames = new String[5][15];
        String[] fileNames = new String[5];
        try{
            Scanner sc = new Scanner(new File((dir +"/bosniaNamesIn.txt")));
            for(int i = 0; i < 75; i++){
                names[i] = sc.nextLine().trim().toLowerCase();
            }
            Arrays.sort(names);
            for(int i = 0; i < 5; i++){
                for(int j = 0; j < 15; j++){
                    subNames[i][j] = names[15*i + j];
                }
                fileNames[i] = FiNameGen.FiName(subNames[i][0].substring(0,1), subNames[i][14].substring(0,1));
            }

            for(int i = 0; i < 5; i++){
                PrintWriter writer = new PrintWriter(dir+"/" + fileNames[i] + ".txt", "UTF-8");
                for(int j = 0; j < 15; j++){
                    writer.println(subNames[i][j]);
                }
                writer.close();
            }

        }
        catch(IOException e){
            System.out.println("asdf fail");
        }


    }
}
