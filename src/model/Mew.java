package model;


//Mew must extend the Pokemon class
//Generate appropriate getters and setters
//Generate a six argument constructor with the following arguments (pokemonName,pokemonNumber,characteristics,type,evolution,baseExp) and pokemonName and pokemonNumber should refer to the parent constructor in the Pokemon class.
//
//Use the predefined values given below as constructor arguments 
//pokemonName = Mew
//pokemonNumber = 151
//characteristics = "Mew is a Psychic-type Mythical Pok�mon introduced in Generation I. Mew is notable for its unique ability to learn every Technical Machine, Technical Record & Hidden Machine."
//type = "PSYCHIC"
//evolution = "NONE"
//baseExp = "64" 

//child class
public  class Mew extends Pokemon
{
	
	//arguments
	String characteristics;
	String type;
	String evolution;
	String baseExp;
	
	
//getter and setter
	public String getCharacteristics() {
		return characteristics;
	}

	public void setCharacteristics(String characteristics) {
		this.characteristics = characteristics;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getEvolution() {
		return evolution;
	}

	public void setEvolution(String evolution) {
		this.evolution = evolution;
	}

	public String getBaseExp() {
		return baseExp;
	}

	public void setBaseExp(String baseExp) {
		this.baseExp = baseExp;
	}
	
	//constructor
	public Mew(String pokemonName, int pokemonNumber, String characteristics, String type, String evolution,
			String baseExp) 
	{
		super(pokemonName, pokemonNumber);
		this.characteristics = characteristics;
		this.type = type;
		this.evolution = evolution;
		this.baseExp = baseExp;
	}
	
}