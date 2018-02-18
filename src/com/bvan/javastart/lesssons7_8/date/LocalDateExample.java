package com.bvan.javastart.lesssons7_8.date;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * @author bvanchuhov
 */
public class LocalDateExample {

    public static void main(String[] args) {
        LocalDate ld = LocalDate.now();
        System.out.println(ld);

        LocalTime lt = LocalTime.now();
        System.out.println(lt);

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        LocalDate ldYearAgo = ld.minusYears(1);
        DayOfWeek dayOfWeek = ldYearAgo.getDayOfWeek();
        System.out.println(dayOfWeek);

        LocalDate elvisBirthDate = LocalDate.of(1935, 1, 8);
        System.out.println(elvisBirthDate.getDayOfWeek());
        System.out.println(elvisBirthDate.isLeapYear());
    }
}
