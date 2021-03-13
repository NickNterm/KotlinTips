class DataTypes {
	// TODO: change this function
	/*
	var >> allajei
	val >> den allajei
	ex. val VarName: Double = 23.34544

	Byte >> 8bit >> 12
	Short >> 16bit >> 125
	Int >> 32bit >> 123123123
	Long >> 64bit >> 45_234_234_457_456_345 >> bazw katw paula gia na ginei pio readable den epirazei ton arithmo

	Float >> 32bit >> 13.54F
	Double >> 64bit >> 3.14152354234523453245

	Boolean >> true/false

	Char >> val Name = 'A'

	String >> a lot of chars >> var name = "hello" >> name [1] >> e

	 */
	val myName = "Nick"
	print("Hello "+ myName)
	var month =3
	 when(month){
	     in 3..5 -> println("spring")
	     in 6..8 -> println("summer")
	     in 9..11 -> println("fall")
	     12, 1, 2 -> println("winter")
	     else -> println("Invalid month")
	 }
	var age = 20
	when(age){
	    !in 21..150 -> println("you may drink now")
	    in 18..20 -> println("you may vote now")
	    16,17 -> println("you may drive now")
	    else -> println("You are too young")
	}
	var x = 100
	while(x>=0){
	    if(x%2 == 0){
	        print (x)
	    }
	    x--
	}
	for(num in 1..10) {
	    print("$num ")
	}

	for(i in 1 until 10) {
	    print("$i ")
	}

	for(i in 10 downTo 1) {
	    print("$i ")
	}

	for(i in 1 until 10 step 2) {
	    print("$i ")
	}

	var hum = "humid"
	var humlevel = 80
	while(hum == "humid"){
	    print(humlevel)
	    humlevel -= 5
	    if (humlevel <= 60){
	        hum = "confy"
	        print ("$hum")
	    }
	}
}
