import java.util.*;
import java.io.*;
public class Project {
	public static void list1(String directoryName, List<File> files,List<String> fileName){
	    File directory = new File(directoryName);
	    File[] fList = directory.listFiles();
	    for (File file : fList) {
	        if (file.isFile()) {
	            files.add(file);
	             String s =  file.getName().toString();
	             fileName.add(s);
	        } else if (file.isDirectory()) {
	            list1(file.getAbsolutePath(), files,fileName);
	        }
	    }
	}
   public static void main(String[] args) throws IOException{
       File f1 = new File("C:\\Users\\User\\Desktop\\acadview\\ab.txt");
   	   FileReader fin = new FileReader(f1);
       BufferedReader bin = new BufferedReader(fin);
       String str1,str2;
       str1 = bin.readLine();
       str2= bin.readLine();
       System.out.println(str1);
       System.out.println(str2);
       List<File> list = new ArrayList<File>();
	    List<String> listFile = new ArrayList<String>();
	    list1(str1,list,listFile);
	    int i = list.size();
	    File outputFile = new File(str2+"\\abcd.csv");
		outputFile.createNewFile();
	   FileWriter inputFile = new FileWriter(outputFile);
	    inputFile.write("FILENAME , FILEPATH\n");
	    for(int j=0;j<i;j++) {
	    	 inputFile.write(listFile.get(j));
	    	 inputFile.write(",");
	    	inputFile.write(list.get(j).toString() + "\n");
	    }
	    inputFile.close();
	}
}
