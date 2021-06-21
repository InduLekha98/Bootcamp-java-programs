package com.bridgeLabz.boosterbootcampjavaprogram.Day9;

public class Song {
	public static void verse(String animal, String noise)
	  {
	    System.out.println( "Old MacDonald had a farm" );
	    System.out.println( "E-I-E-I-O" );
	    System.out.println( "And on that farm he had a " + animal );
	    System.out.println( "E-I-E-I-O" );
	    System.out.println( "With a " + noise + "-" + noise + " here") ;
	    System.out.println( "And a " + noise + "-" + noise + " there" );
	    System.out.println( "Here a " + noise + ", there a " + noise );
	    System.out.println( "Everywhere a " + noise + "-" + noise );
	    System.out.println( "Old MacDonald had a farm" );
	    System.out.println( "E-I-E-I-O" );
	  }

	  public static void main(String[] args)
	  {
	    verse( "Chicks" , "chick" );
	    verse( "Duck" , "quack" );
	    verse( "Turkey" , "gobble" );
	    verse( "Cat" , "meow, meow" );
	    verse( "Mule" , "Heehaw" );
	    verse( "Dog" , "bow wow" );
	    verse( "Pig" , "oink, oink" );
	    verse( "Turtle" , "nerp, nerp" );
	    verse( "Cow" , "moo, moo" );
	  }

}
