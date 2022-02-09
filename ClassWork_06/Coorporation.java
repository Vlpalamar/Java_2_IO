import java.util.ArrayList;
import java.util.Scanner;

public class Coorporation {
    
    ArrayList<Employee> Employees= new ArrayList<Employee>();
    Scanner in= new Scanner(System.in);

    public Coorporation()
    {
        try {
            Employees= Logger.getAllEmployee();
        } catch (Exception e) {
            e.printStackTrace();
        }
        

    }

    public void menu()
    {
       
        int swch=-1;
        System.out.println("\n\n\n\n\n\n\n\n\n\n----Choose Action---\n1.AddNew\n2.ShowAll\n3.Delete\n4.GetByAge\n5.GetBySubStr");
        while (swch!=0) {
            swch= Integer.parseInt(in.nextLine());
            switch (swch) {
                case 1:
                    AddNew();
                    break;
                case 2:
                    ShowAll();
                    break;
                case 3:
                ShowAll();
                System.out.print("choose:");
                Delete(Integer.parseInt(in.nextLine())-1);
                    break;
                case 4:
                System.out.print("Enter age:");
                getByAge(Integer.parseInt(in.nextLine()));
                    break;
                case 5:
                System.out.print("Enter substr:");
                GetBySubString(in.nextLine());
                    break;
                default:
                menu();
                    break;
            }
            System.out.print("next");
            in.nextLine();
            menu();
        }
    
        
        
    }

    public void GetBySubString(String subStr)
    {
        String log= "----GetByAge("+subStr+")-----";
        int id=0;
        for (Employee employee : Employees) {
            if(employee.getSurName().substring(0, subStr.length()).equals(subStr))
            {
                System.out.printf("id= %s%nName= %s\nSurName= %s\nAge= %s\n------ ", id,employee.getName(), employee.getSurName(), employee.getAge());
                log+="\nid= "+id+"\nAge= "+employee.getAge()+"\nName= "+employee.getName()+"\nSurName= "+employee.getSurName()+"\n_______";
            }
            
           id++;
        }

    }

    public void getByAge(int age)
    {
        String log= "----GetByAge("+age+")-----";
        int id=0;
        for (Employee employee : Employees) {
            if(employee.getAge()==age)
            {
                System.out.printf("id= %s%nName= %s\nSurName= %s\nAge= %s\n------ ", id,employee.getName(), employee.getSurName(), employee.getAge());
                log+="\nid= "+id+"\nAge= "+employee.getAge()+"\nName= "+employee.getName()+"\nSurName= "+employee.getSurName()+"\n_______";

            }
            
           id++;
        }
        Logger.safe(log);

    }

    public void AddNew()
    {
        String log= "----AddNew----\n";
        Employee newEmpl = new Employee();
        System.out.print("Enter Age of a new employee: ");
        newEmpl.setAge(Integer.parseInt(in.nextLine()));

        System.out.print("Enter Name of a new employee: ");
        newEmpl.setName(in.nextLine());

        System.out.print("Enter surName of a new employee: ");
        newEmpl.setSurName(in.nextLine());
        Employees.add(newEmpl);
        log+="\nAge= "+newEmpl.getAge()+"\nName= "+newEmpl.getName()+"\nSurName= "+newEmpl.getSurName()+"\n_______";
        Logger.safe(log);
        Logger.safeEmpoyee(Employees);
    }
    public void ShowAll()
    {
        String log= "----ShowAll----\n";
        int id=0;
        for (Employee employee : Employees) {
            System.out.println("");
            System.out.printf("id= %s%nName= %s\nSurName= %s\nAge= %s\n------ ", ++id,employee.getName(), employee.getSurName(), employee.getAge());
            log+="\nid= "+id+"\nAge= "+employee.getAge()+"\nName= "+employee.getName()+"\nSurName= "+employee.getSurName()+"\n_______";
        }
        Logger.safe(log);

    }
    public void Delete(int index)
    {
        
        String log= "----Delete("+index+")----\n";
        log+="\nid= "+index+"\nAge= "+Employees.get(index).getAge()+"\nName= "+Employees.get(index).getName()+"\nSurName= "+Employees.get(index).getSurName()+"\n_______";
        Employees.remove(Employees.get(index));
        Logger.safe(log);
        Logger.safeEmpoyee(Employees);
    }
}
