package lesson_2;

public class SwitchTest {
    public static void main(String[] args) {
        convertSeason(3);
        convertSeasonSwitch(2);
        convertSeasonSwitch2(4);
    }

    public static void convertSeason(int seasonNumber) {
        String season;

        if (seasonNumber == 1) {
            season = "Winter";
        } else if (seasonNumber == 2) {
            season = "Spring";
        } else if (seasonNumber == 3) {
            season = "Summer";
        } else if (seasonNumber == 4) {
            season = "Fall";
        } else {
            season = "Unknown season";
        }

        System.out.println(season);
    }

    public static void convertSeasonSwitch(int seasonNumber) {
        String season;
        switch (seasonNumber) {
            case 1:
                season = "Winter";
                break;
            case 2:
                season = "Spring";
                break;
            case 3:
                season = "Summer";
                break;
            case 4:
                season = "Fall";
                break;
            default:
                season = "Unknown season";
        }
        System.out.println(season);
    }

    public static void convertSeasonSwitch2(int seasonNumber) {
        String season = switch (seasonNumber) {
            case 12,  1,  2   -> "Winter";
            case  3,  4,  5   -> "Spring";
            case  6,  7,  8   -> "Summer";
            case  9, 10, 11   -> "Fall";
            default -> "Unknown season";
        };
        System.out.println(season);
    }
}
