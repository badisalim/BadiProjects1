package Lectures.time;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ConvertTime {


    public static void main(String[] args) throws ParseException {

        String input1 = "23/12/2014 10:22:12 am";
        String input2 = "23/12/2014 11:22:12 pm";

        DateFormat df = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss aa");
        DateFormat outputformat = new SimpleDateFormat("MM-dd-yyyy HH:mm:ss aa");

        Date date1 = df.parse(input1);

        String output1 = outputformat.format(date1);

        System.out.println(output1);

        System.out.println("time in 12 hour format : " + output1);
        // SimpleDateFormat inFormat = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss aa");
        String input = "23/12/2014 10:22:12 pm";
        Date date = df.parse(input);
        String output = outputformat.format(date);
        System.out.println(output);
        SimpleDateFormat outFormat = new SimpleDateFormat("MM.dd.yyyy.HH:mm:ss");
        String time24 = outFormat.format(date);
        System.out.println("time in 24 hour format : " + output);
        System.out.println("time in 24 hour format : " + time24);

    }
}

