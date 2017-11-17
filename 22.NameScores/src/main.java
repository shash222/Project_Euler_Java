import java.io.File;
import java.util.Scanner;
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Arrays;
public class main{
    public static int namevalue(String name){
        char[] charval={' ', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        char let;
        boolean match=false;
        int arr=1;
        int letter;
        int total=0;
        int character;
        for (letter=0;letter<name.length();letter++){
            let=name.charAt(letter);
            do{
                if (charval[arr]==let){
                    total+=arr;
                    match=true;
                }
                arr++;
            }while(match==false);
            arr=0;
            match=false;
        }
        return total;
    }
    
    public static void main(String[] args){
        int items;
        int length;
        int total=0;
        int nameval;
        String name;
        File filepath=new File("../names.txt");
        List<String> names=new ArrayList<String>();
        try{
            Scanner in=new Scanner(filepath);
            while(in.hasNext()){
                name=in.nextLine();
                names=Arrays.asList(name.split("\\s*,\\s*"));
            }
        }
        catch(Exception e){
            
        }
        Collections.sort(names, String.CASE_INSENSITIVE_ORDER);
        for (items=0;items<names.size();items++){
            name=names.get(items);
            length=name.length();
            names.set(items,name.substring(1,(length-1)));
        }
        for (items=0;items<names.size();items++){
            name=names.get(items);
            nameval=(namevalue(name)*(items+1));
            total+=nameval;
        }
        System.out.println(total);
    }
}