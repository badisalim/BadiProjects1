package Lectures.time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Time {

    public static void main(String[] args) throws ParseException {
        Instant now = Instant.now();
        System.out.println("GMT Time:    " + now);

        LocalDateTime now2 = LocalDateTime.now();
        System.out.println("Local Date : " + now2);

        LocalDateTime today = LocalDateTime.now();
        System.out.println("Today is : " + today.getDayOfWeek());

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy-HH:mm:ss");

        LocalDateTime dateStart = LocalDateTime.of(2019, 3, 13, 10, 0);
        String formattedDate = dateStart.format(formatter);
        System.out.println("Date Start : " + dateStart);
        System.out.println("Date format : " + formattedDate);

        LocalTime someTime = LocalTime.parse("07:30:00");
        LocalTime endMinute = someTime.plus(37, ChronoUnit.MINUTES).withSecond(21);
        System.out.println("Wake up Time: " + someTime);

        Duration duration = Duration.between(someTime, endMinute);
        long minutes = duration.toMinutes();
        System.out.println("Duration time to get ready: " + minutes / 60 + ":" + minutes % 60);

        System.out.println("Time for limousine to collect you: " + endMinute);

        LocalTime endHoure = endMinute.plus(1, ChronoUnit.HOURS).plusMinutes(30);
        System.out.println("Arrival time to airport: " + endHoure);

        LocalTime someTime2 = LocalTime.parse("11:04:00");
        LocalTime endHoure1 = someTime2.minusHours(9).minusMinutes(37).minusSeconds(21);
        LocalTime endHoure2 = someTime2.minus(9, ChronoUnit.HOURS).minusMinutes(37).minusSeconds(21);
        System.out.println("you have still : " + endHoure1 + " for Departure");
        System.out.println("you still have : " + endHoure2 + " for Departure");

        LocalTime someTime4 = LocalTime.parse("18:45:00");
        LocalTime someTime5 = someTime4.minusHours(11).minusMinutes(04).minusSeconds(00);
        System.out.println("or you have to wait : " + someTime5 + " for next flight");
        System.out.println("uuuu" + someTime4);
        Duration dur = Duration.between(someTime2, someTime4);
        System.out.println("Duration: " + dur);
        long minutes2 = dur.toMinutes();
        System.out.println("Duration: " + minutes2 / 60 + ":" + minutes2 % 60);

        LocalDateTime now3 = LocalDateTime.now();
        ZoneId here = ZoneId.systemDefault();
        ZonedDateTime nowHere = now3.atZone(here);

        ZoneId london = ZoneId.of("Europe/London");
        ZonedDateTime nowInLondon = nowHere.withZoneSameInstant(london);


        System.out.println("Now in London: " + nowInLondon);
        System.out.println("Time in London when you arrive Tokyo: " + someTime4.plusHours(11).plusMinutes(04));


        ZoneId tokyo = ZoneId.of("Asia/Tokyo");
        ZonedDateTime nowInTokyo = nowHere.withZoneSameInstant(tokyo);
        System.out.println("Now in Tokyo: " + nowInTokyo);
        System.out.println("Time in Tokyo when you arrive Tokyo: " + someTime4.plusHours(11).plusMinutes(04).minusHours(15));
        System.out.println("Manager hitting him: " + someTime4.plusHours(11).plusMinutes(04).minusHours(15).plusHours(9));

        System.out.println();
        try {
            String now5 = new SimpleDateFormat("hh:mm aa").format(new java.util.Date().getTime());
            System.out.println("time in 12 hour format : " + now5);
            SimpleDateFormat inFormat = new SimpleDateFormat("hh:mm aa");
            SimpleDateFormat outFormat = new SimpleDateFormat("HH:mm");
            String time24 = outFormat.format(inFormat.parse(now5));
            System.out.println("time in 24 hour format : " + time24);
        } catch (Exception e) {
            System.out.println("Exception : " + e.getMessage());





        }

    }
}