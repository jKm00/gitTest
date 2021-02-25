package no.ntnu.idata2001;

public class Person
{
    private String name;
    private int age;

    public Person(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return this.name;
    }

    public int getAge()
    {
        return this.age;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setAge(int age)
    {
        this.age = age;
    }
}
