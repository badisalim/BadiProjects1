/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

import java.time.* ;
import java.time.temporal.* ;
import java.time.format.* ;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
        DateTimeFormatter formatterInput = 
        DateTimeFormatter.ofPattern(                  // Define a formatting pattern to match your input text.
            "hh:mm a" ,
            Locale.US                                 // `Locale` determines the human language and cultural norms used in localization. Needed here to translate the `AM` & `PM` value.
        )  ;
        
        LocalTime lt = 
        LocalTime.parse(                              // Class representing a time-of-day value without a date and without a time zone.
            "03:30 PM" , 
            formatterInput
        ) ;
        
        DateTimeFormatter formatterOutput = 
        DateTimeFormatter.ofPattern(                  // Define a formatting pattern to match your input text.
            "HH:mm" ,
            Locale.US                                 // `Locale` determines the human language and cultural norms used in localization. Needed here to translate the `AM` & `PM` value.
        )  ;
        String output = lt.format( formatterOutput ) ;
        
        System.out.println( "output: " + output ) ;
	}
}