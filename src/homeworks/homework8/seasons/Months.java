package homeworks.homework8.seasons;

public enum Months {
    JANUARY(31, Seasons.WINTER) {
        @Override
        void getDays() {
            System.out.println(Months.JANUARY.days);

        }

        @Override
        void getSeason() {
            System.out.println(Months.JANUARY.seasons);
        }
    },

    FEBRUARY(28, Seasons.WINTER) {
        @Override
        void getDays() {
            System.out.println(Months.FEBRUARY.days);

        }

        @Override
        void getSeason() {
            System.out.println(Months.FEBRUARY.seasons);
        }
    },
    MARCH(31, Seasons.SPRING) {
        @Override
        void getDays() {
            System.out.println(Months.MARCH.days);

        }

        @Override
        void getSeason() {
            System.out.println(Months.MARCH.seasons);
        }
    },
    APRIL(30, Seasons.SPRING) {
        @Override
        void getDays() {
            System.out.println(Months.APRIL.days);

        }

        @Override
        void getSeason() {
            System.out.println(Months.APRIL.seasons);
        }
    },
    MAY(31, Seasons.SPRING) {
        @Override
        void getDays() {
            System.out.println(Months.MAY.days);

        }

        @Override
        void getSeason() {
            System.out.println(Months.MAY.seasons);
        }
    },
    JUNE(30, Seasons.SUMMER) {
        @Override
        void getDays() {
            System.out.println(Months.JUNE.days);

        }

        @Override
        void getSeason() {
            System.out.println(Months.JUNE.seasons);
        }
    },
    JULY(31, Seasons.SUMMER) {
        @Override
        void getDays() {
            System.out.println(Months.JULY.days);

        }

        @Override
        void getSeason() {
            System.out.println(Months.JULY.seasons);
        }
    },
    AUGUST(31, Seasons.SUMMER) {
        @Override
        void getDays() {
            System.out.println(Months.AUGUST.days);

        }

        @Override
        void getSeason() {
            System.out.println(Months.AUGUST.seasons);
        }
    },
    SEPTEMBER(30, Seasons.AUTUMN) {
        @Override
        void getDays() {
            System.out.println(Months.SEPTEMBER.days);

        }

        @Override
        void getSeason() {
            System.out.println(Months.SEPTEMBER.seasons);
        }
    },
    OCTOBER(31, Seasons.AUTUMN) {
        @Override
        void getDays() {
            System.out.println(Months.OCTOBER.days);

        }

        @Override
        void getSeason() {
            System.out.println(Months.OCTOBER.seasons);
        }
    },
    NOVEMBER(30, Seasons.AUTUMN) {
        @Override
        void getDays() {
            System.out.println(Months.NOVEMBER.days);

        }

        @Override
        void getSeason() {
            System.out.println(Months.NOVEMBER.seasons);
        }
    },
    DECEMBER(31, Seasons.WINTER) {
        @Override
        void getDays() {
            System.out.println(Months.DECEMBER.days);

        }

        @Override
        void getSeason() {
            System.out.println(Months.DECEMBER.seasons);
        }
    };

    int days;
    Seasons seasons;

    Months(int days, Seasons seasons) {
        this.days = days;
        this.seasons = seasons;
    }

    abstract void getDays();

    abstract void getSeason();
}
