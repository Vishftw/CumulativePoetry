import java.util.List;
import java.util.ArrayList;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;


class CumulativePoetry
{
    public static void main(String args[])
    {
        /*
        CumulativePoetry CP=new CumulativePoetry();


        if(args[0].equals("--reveal-for-day") && Integer.parseInt(args[1])>0 && Integer.parseInt(args[1])<13)
        {
            System.out.print(CP.printTillDay(Integer.parseInt(args[1])));
        }
        else if(args[0].equals("--recite"))
        {
            System.out.print(CP.printRecite());
        }
        */
        System.out.println(printTillDay(3));


    }



    static String printTillDay(int days)
    {
        List<String> listOfLines = getArrayFromFile();
        String finalPoem = new String();
        String finalString = new String();

        String constantIntro = "This is ";
        int lengthOfList = listOfLines.size();

        for(int index=lengthOfList-1;index>=lengthOfList-days;index--)
        {
            finalPoem=listOfLines.get(index) + "\n" + finalPoem;
        }

        finalString+=constantIntro + finalPoem;

        return finalString;

    }

    static String printRecite()
    {
        List<String> listOfLines = getArrayFromFile();
        String finalString = new String();
        String finalPoem = new String();
        String constantIntro = "This is ";
        int lengthOfList = listOfLines.size();
        for(int index=lengthOfList-1;index>=0;index--)
        {
            finalString+="Day " + (lengthOfList-index)+"\n";
            finalPoem=listOfLines.get(index)+"\n"+finalPoem;
            finalString+= constantIntro + finalPoem;
        }

        return finalString;
    }

    static List<String> getArrayFromFile()
    {
        List<String> list = new ArrayList<String>();

        try
        {
            BufferedReader in = new BufferedReader(new FileReader("src/main/java/Poem.txt"));
            String tempStr;

            while((tempStr = in.readLine()) != null)
                list.add(tempStr);

            return list;

        }
        catch(FileNotFoundException FE)
        {
            System.err.println("File not found - " + FE.getMessage());
        }

        catch(IOException IE)
        {
            System.err.println(IE.getMessage());
        }

        return list;

    }
}