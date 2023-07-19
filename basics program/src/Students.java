class StudentsData
{
private String stdName;
private String stdNative;
private int stdRank;

public String getName()
{
return stdName;
}


public String getNative()
{
return stdNative;
}

public int getRank()
{
return stdRank;
}



public void setName(String name)
{
stdName=name;
}

public void setNative(String native)
{
stdNative=native;
}

public void setRank(int rank)
{
stdRank=rank;
}
}

class Students
{
public static void main(String[] args)
{
StudentsData Car = new StudentsData();
Car.setName("Saravanan");
Car.setNative("Chennai");
Car.setRank(6);

System.out.println(Car.getName);
System.out.println(Car.getNative);
System.out.println(Car.getRank);
}
}n 