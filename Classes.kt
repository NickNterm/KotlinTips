/*
Classes

Shadowing and Scope
Shadowing and Scope is an effect that a parameter and a variable
have the same name. For example we have a method with a parameter
named X. Inside the method we create another var called X. Now 
After that in the method we CANT read the parameter X and get its
value. We can only edit the var X. This is called Shodowing. To 
prevent that just dont use same names everywhere.
*/

class Shadowing {
	
	print(Function(8)) // This is going to print 5
	
	private fun Function(value: Int): Int{
		var value: Int = 5
		return value
	}
}
/*
Inherit
We can create two Classes and the one of the can inherit from another.
The class that inherits from the other can use all the functionallities 
from the other class. It should have at least all the parameters that the 
other class haves and also should have the same constructor. But you can
add more methods, constructors, parameters. Plus you can override the 
functions that the class inherits.
*/

class vehicle (color: String, brand: String){
	fun setColor(newColor: String){
		color = newColor
	}
	fun printBrand(){
		print(brand)
	}
}

class Car (color: String, brand: String, model: String, insideColor: String): vehicle(){
	override fun setColor(newColor: String){
		color = newColor
		insideColor = newColor
	}	
}
// in this example if we create a Car we could call the function
// printBrand


/*
Interface
Its a blue print of a class. Its is like class it has functions, vars
but its open to get inherited. This makes the class that inherits to 
override every function and varible.
*/

/*
Abstract
its like Interface, its a class that others classes inherit from. 
It has constructor, methods, vars. It can only get called through
another class that inherits from th abstract.
*/
