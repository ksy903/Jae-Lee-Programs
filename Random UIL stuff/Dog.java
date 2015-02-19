class Collar{}

class Dog
{
	Collar c;
	String name;

	public static void main(String[] args)
	{
		Dog d;
		d = new Dog();
		d.go(d);
	}
	void go(Dog dog)
	{
		c = new Collar();
		dog.setName("Aiko");
	}
	void setName(String dogName)
	{
		name = dogName;
		System.out.println(name);
	}
	void setName2(String dogName2)
	{
		name = dogName2;
		name += "eeee";
		System.out.println(name);
	}
}