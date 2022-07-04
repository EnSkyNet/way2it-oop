package homeworks.homework8.seasons;

public enum Months {
    JANUARY(31, Seasons.WINTER) ,
    FEBRUARY(28, Seasons.WINTER),
    MARCH(31, Seasons.SPRING) ,
    APRIL(30, Seasons.SPRING) ,
    MAY(31, Seasons.SPRING) ,
    JUNE(30, Seasons.SUMMER) ,
    JULY(31, Seasons.SUMMER) ,
    AUGUST(31, Seasons.SUMMER),
    SEPTEMBER(30, Seasons.AUTUMN) ,
    OCTOBER(31, Seasons.AUTUMN) ,
    NOVEMBER(30, Seasons.AUTUMN) ,
    DECEMBER(31, Seasons.WINTER) ;

    final int days;
    final Seasons seasons;

    Months(int days, Seasons seasons) {
        this.days = days;
        this.seasons = seasons;
    }

    int getDays(){
        return days;
    }

   Seasons getSeason(){
       return seasons;
   }
}
