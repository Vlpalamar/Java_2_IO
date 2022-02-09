import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.IntStream;

import javax.xml.crypto.dsig.keyinfo.KeyValue;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
// // //задание 1 
// //         String fileName1= in.nextLine();
// //         String fileName2= in.nextLine();
// //         String fullName1="";
// //         String fullName2="";
// //         String dirName=System.getProperty("user.dir");
// //         fullName1= dirName+File.separator+fileName1;
// //         fullName2= dirName+File.separator+fileName2;
// //         System.out.println(fullName1);
// //         System.out.println(fullName2);
// //         File file1 = new File(fullName1);
// //         File file2 = new File(fullName2);
// //         try( BufferedReader fis1= new BufferedReader( new FileReader(file1));
// //              BufferedReader fis2= new BufferedReader( new FileReader(file2));
// //         )
// //         {
    
// //             String line1="";
// //             String line2="";
// //             ArrayList<String> l1= new ArrayList<String>();
// //             ArrayList<String> l2= new ArrayList<String>();
// //             while((line1 =fis1.readLine())!=null  )
// //             {
// //                 if(line1!=null)
// //                 l1.add(line1);
// //             }
// //             while( (line2 =fis2.readLine())!=null)
// //             {
// //                 if(line2!=null)
// //                 l2.add(line2);
// //             }
               
            
// //             if(l1.size()<l2.size())
// //             {
// //                 ArrayList<String> temp= new ArrayList<String>();
// //                 temp= (ArrayList<String>)l1.clone();
// //                 l1= (ArrayList<String>) l2.clone();
// //                 l2= (ArrayList<String>) temp.clone();
// //                 String tmp="";
// //                 tmp= fileName1;
// //                 fileName1= fileName2;
// //                 fileName2=tmp;

// //             }
// //          for (int i = 0; i < l1.size(); i++) {
// //                 if(l2.size()-1<i|| l1.get(i).equals(l2.get(i)))
// //                 {
                   
// //                     continue;
// //                 }        
// //                System.out.println(fileName1+"_"+i+"_"+l1.get(i));
// //                if(l2.size()-1>i)
// //                {
// //                 System.out.println(fileName2+"_"+i+"_"+l2.get(i));
// //                }
// //          }


// //         }catch(IOException e)
// //         {
// //             e.printStackTrace();
// //         }


// //задание 2
//         String fileName= in.nextLine();
//         String fullName="";
//         String dirName= System.getProperty("user.dir");
//         fullName= dirName+File.separator+fileName;
//         File f= new File(fullName);
//         try (BufferedReader bis= new BufferedReader(new FileReader(f) )) {
//            Map<Integer,String> map= new HashMap<Integer,String>();
//             String line="";
//             int max=0;
//             map.put(max,line);
//             while ((line= bis.readLine())!=null) {
//                 if(max<line.length())
//                 {
//                     max=line.length();
//                     map.put(max, line);
//                 }  
//             }
//             System.out.println(map.get(max));

//         }catch(FileNotFoundException e)
//         {
//             e.printStackTrace();

//         } 
//         catch (IOException e) {
//             e.printStackTrace();
//             //TODO: handle exception
//         }
    //задание 3

    // String fileName= "Array.txt";
    // String fullName= "";
    // String dirName= System.getProperty("user.dir");
    // fullName=dirName+File.separator+fileName;
    // File file= new File(fullName);
    // try (BufferedReader bis= new BufferedReader(new FileReader(file)))
    // {
    //     ArrayList<ArrayList<Integer>> list= new ArrayList<ArrayList<Integer>>();
    //     String line="";
    //     while ((line=bis.readLine())!=null) {
    //         ArrayList<Integer> tmpArray= new ArrayList<Integer>();
    //         String[] str=line.split(" ");
    //         for (String string : str) {
    //             tmpArray.add(Integer.parseInt(string));
    //         }
    //         list.add(tmpArray);
          
    //         System.out.println(tmpArray.toString());
    //         System.out.println("Max="+ Collections.max(tmpArray));
    //         System.out.println("Min="+ Collections.min(tmpArray));
    //         int summ = tmpArray.stream()
    //         .mapToInt(a -> a)
    //         .sum();
           
    //        System.out.println("Max="+summ);
    //        System.out.println("=============");
    //     }
    //     int max= 0;
        
    //    for (ArrayList<Integer> arrayList : list) {
    //        if (max< Collections.max(arrayList)) {
    //            max= Collections.max(arrayList);
    //         }
    //    }
    //    int min=max;
    //    for (ArrayList<Integer> arrayList : list) {
    //     if (min> Collections.min(arrayList)) {
    //         min= Collections.min(arrayList);
    //     }
    // }
    //     int summ=0; 
    // for (ArrayList<Integer> arrayList : list) {
    //     summ+=arrayList.stream().mapToInt(a->a).sum();
    // }

    //    System.out.println("Max of All="+max);
    //    System.out.println("Min of All="+min);
    //    System.out.println("Summ of All="+summ);
    // } catch (IOException e) {
    //     e.printStackTrace();
    //     //TODO: handle exception
    // }

    // System.out.print("FileName: ");
    // String fileName= in.nextLine();
    // System.out.println("");  
    // System.out.print("Array: ");  
    // List<String> main_array=Arrays.asList(in.nextLine().split(" "));
    // String fullName="";
    // String  dirName= System.getProperty("user.dir");
    // fullName= dirName+File.separator+fileName;
    // File file = new File(fullName);
    // try (FileWriter writer= new FileWriter(file)) {
    //     file.delete();
    //     writer.append(main_array.toString());
    //     writer.append("\n");
    //     List<Integer> tmp= new ArrayList<Integer>();
    //     main_array.stream().mapToInt(Integer::parseInt).filter(a->a%2==0).forEach(tmp::add);
    //     writer.append(tmp.toString());
    //     tmp.clear();
    //     writer.append("\n");
    //     main_array.stream().mapToInt(Integer::parseInt).filter(a->a%2==1).forEach(tmp::add);
    //     writer.append(tmp.toString());
    //     writer.append("\n");
    //     Collections.reverse(main_array);
    //     writer.append(main_array.toString());

    // }catch(FileNotFoundException e)
    // {
    //     e.fillInStackTrace();

    // }
    //  catch (IOException e) {
    //     e.fillInStackTrace();
    //     //TODO: handle exception
    // }
        

        Coorporation c= new Coorporation();
        c.menu();
    }
}