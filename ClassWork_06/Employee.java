import java.io.Serializable;

public class Employee implements Serializable{
    private int age=0;
    private String name="";
    private String surName= "";




    //#region Getters\Setters
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurName() {
        return surName;
    }
    public void setSurName(String surName) {
        this.surName = surName;
    }
    //#endregion
   
    public Employee(int age,String name, String surname)
    {
        this.age= age;
        this.name= name;
        this.surName = surname;
        
        

    }
    public Employee()
    {
       new Employee(0,"","");
    }

    
}
