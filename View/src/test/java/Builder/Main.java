package View.src.test.java.Builder;

public class Main {
    public static void main(String[] args) {
        FootballTeam dynamo = FootballTeam.builder()
                .name("Динамо")
                .coach("Олександр Шовковський ")
                .budget(50000000)
                .points(20)
                .city("Київ")
                .foundationYear(1927)
                .build();

        FootballTeam barcelona = FootballTeam.builder()
                .name("Барселона")
                .coach("Хави")
                .budget(700000000)
                .points(35)
                .city("Барселона")
                .trophies(98)
                .foundationYear(1899)
                .build();

        FootballTeam manCity = FootballTeam.builder()
                .name("Манчестер Сіті")
                .coach("Пеп Гвардіола")
                .budget(800000000)
                .points(33)
                .city("Манчестер")
                .foundationYear(1880)
                .build();

        FootballTeam realMadrid = FootballTeam.builder()
                .name("Реал Мадрид")
                .coach("Карло Анчелотті")
                .city("Мадрид")
                .foundationYear(1902)
                .build();

        System.out.println(dynamo);
        System.out.println(barcelona);
        System.out.println(manCity);
        System.out.println(realMadrid);
    }
}
