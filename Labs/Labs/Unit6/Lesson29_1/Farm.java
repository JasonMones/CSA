package Unit6.Lesson29_1;


public class Farm
{
private Animal[] a = new Animal[3];
public Farm()
{
a[0] = new NamedCow("cow","Elsie","moo");
a[1] = new Chick("Dick","cUp","cluck");
a[2] = new Pig("pig","oink");
}

public void animalSounds()
{
for (int i = 0; i < a.length; i++)
{
System.out.println(a[i].getType() + " goes " + a[i].getSound());
}
System.out.println("The cow is known as " +
((NamedCow)a[0]).getName());
}
}