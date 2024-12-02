package entity;

import java.time.LocalDate;

public class CalendarExport {
    private LocalDate date;

    public CalendarExport(int year, int month, int day) {
        this.date = LocalDate.of(year, month, day);
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(int year, int month, int day) {
        this.date = LocalDate.of(year, month, day);
    }

    public int getYear() {
        return date.getYear();
    }

    public void setYear(int year) {
        this.date = LocalDate.of(year, date.getMonthValue(), date.getDayOfMonth());
    }

    public int getMonth() {
        return date.getMonthValue();
    }

    public void setMonth(int month) {
        this.date = LocalDate.of(date.getYear(), month, date.getDayOfMonth());
    }

    public int getDay() {
        return date.getDayOfMonth();
    }

    public void setDay(int day) {
        this.date = LocalDate.of(date.getYear(), date.getMonthValue(), day);
    }
}

