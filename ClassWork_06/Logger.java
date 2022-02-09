import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public  class Logger {
    
    public static void safe(String str)
    {
        String fileName="Log.txt";
        String dirName= System.getProperty("user.dir");
        String fullName = dirName+File.separator+fileName;
        File file= new File(fullName);
        FileWriter fw=null;
        try (
            BufferedReader br= new BufferedReader(new FileReader(file)))
        {
            //логирует все действия клиента, можно добавить время+дату но мне лень 
            fw= new FileWriter(file,true);
            fw.append(str);
            
        }catch(FileNotFoundException e)
        {
            e.fillInStackTrace();
        }
         catch (IOException e) {
            e.fillInStackTrace();
            //TODO: handle exception
        }
        finally
        {
           try {
               fw.close();   

           } catch (Exception e) {
               e.fillInStackTrace();
           }
        }
    }
    public static void safeEmpoyee(ArrayList<Employee> empls)
    {
        String fileName="EmployersLog.txt";
        String dirName= System.getProperty("user.dir");
        String fullName = dirName+File.separator+fileName;
        File file= new File(fullName);
        
        FileOutputStream fout= null;
        ObjectOutputStream oout=null;
        try 
        {
            fout= new FileOutputStream(file);
            oout= new ObjectOutputStream(fout);
            Employee[] e=new Employee[empls.size()];
            empls.toArray(e);
            
            oout.writeObject(e);
            
        }        
         catch (FileNotFoundException e) {
           e.printStackTrace();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            try {
               
                oout.close();
            } catch (IOException e) {
               e.printStackTrace();
            }
        }
    }
    public static ArrayList<Employee> getAllEmployee()
    {
        ArrayList<Employee> l= new ArrayList<Employee>();
        String fileName="EmployersLog.txt";
        String dirName= System.getProperty("user.dir");
        String fullName = dirName+File.separator+fileName;
        File file= new File(fullName);
        
       FileInputStream fis= null;
       try {
           
           fis=new FileInputStream(file);
           ObjectInputStream oin= new ObjectInputStream(fis);
           Employee[] a;
           a=
           (Employee[]) oin.readObject();
           Collections.addAll( l, a);
       
        } catch (IOException e) {
            //TODO: handle exception
            e.printStackTrace();
        }
        catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        finally
        {
            try {
                fis.close();
            } catch (IOException e) {
                //TODO: handle exception
                e.printStackTrace();
            }
        }
        return l;
    }

}
