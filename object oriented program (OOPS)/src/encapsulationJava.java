class Encap
{
private int empID;
private String empName;
private String empNative;

public int getID()
{
return empID; 
}
public String getName()
{
return empName;
}
public String getNative()
{
return empNative;
}
public void setID(int newID)
{
empID = newID;
}
public void setName(String newName)
{
empName = newName;
}
public void setNative(String newNative)
{
empNative = newNative;
}

}

class encapsulationJava
{
public static void main(String[] args)
{
Encap emp1 = new Encap();
emp1.setID(1004345);
emp1.setName("Saravanan");
emp1.setNative("Chennai");
System.out.println(emp1.getID()+"\n"+emp1.getName()+"\n"+emp1.getNative());
}
}




