#Codeguide
##Don't Repeat Yourself

This principle maybe it's the most important principle to writing a good code.
Don't repeat yourself mean that you should not write code twice. There are many reasons that you should DRY.
When you write the code and want to use this code again you maybe just copy and paste the code yes it possible to use
it but when you need to modify that code you need to go and find where did you copy and paste this code and modify it 
everywhere in your code if you forget to modify your code can have an error because only one line of code that you repeat it!
	
	Ex.
	```java
	double radius = 5;
	public double calArea(){
		return Math.PI*radius*radius;
	}
	public void printArea(){
		//DRY !!
		double area = Math.PI*radius*radius;
		System.out.println(area);
	}
	```
	You can see from the code above that some code are same. In this example I must call calArea() in 
	printArea() first to DRY ! More example down here.
	
Example : [EX](/src/codeguide/Dry_example.java)

##Avoid Creating a YAGNI (You aren’t going to need it)

To avoid create a YAGNI it's not a big trouble to creating something you not gonna need it but if you don't need it 
why should you create it ? Some of them are the function that you don't even use it in your code it can make you confuse
and it also waste your time to make if you're not going to use this you can save more time to do anything that have some 
thing better than write the code that YAGNI! So you should write code only what you need.
	
	Ex.
	```java
	public static void main(String[] args) {
		String name = "Map";
		int age = 19;
		int num = 0;
		String[] favSong;
		boolean sleep;
		
		System.out.println(name +" "+ age);
	}
	```
	You can see in main I declare many attribute but I use only 2 of that so if you not going to use it 
	right now so don't write it because YAGNI ! More example down here.

Example : [EX](/src/codeguide/Yagni_example.java)

Reference : [REF](http://www.artima.com/weblogs/viewpost.jsp?thread=331531)