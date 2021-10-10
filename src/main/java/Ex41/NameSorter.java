package Ex41;

import java.io.*;

import java.util.*;

// defining the class NameSorter
public class NameSorter
{
    public static void main(String args[]) throws Exception{

        File file= new File("exercise41_input.txt");
        Scanner myReader = new Scanner(file);

        List<String> arrList = new ArrayList<>();

        while (myReader.hasNextLine())
        {
            arrList.add(myReader.nextLine());
        }
        Collections.sort(arrList);

        FileWriter writer = new FileWriter("exercise41_output.txt");
        System.out.println("Total of " + arrList.size() + " names: ");
        for (String str: arrList)
        {
            writer.write(str + System.lineSeparator());
            System.out.println(str);
        }
        writer.close();
    }
}
