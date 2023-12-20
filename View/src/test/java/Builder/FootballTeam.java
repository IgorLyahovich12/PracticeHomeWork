package View.src.test.java.Builder;


public class FootballTeam {
    private String name;
    private String coach;
    private Integer budget;
    private Integer points;
    private String city;
    private Integer trophies;
    private Integer foundationYear;

    private FootballTeam() {
    }

    public static FootballTeamBuilder builder() {
        return new FootballTeamBuilder();
    }

    public static class FootballTeamBuilder {
        private final FootballTeam team = new FootballTeam();

        private FootballTeamBuilder() {
        }

        public FootballTeamBuilder name(String name) {
            team.name = name;
            return this;
        }

        public FootballTeamBuilder coach(String coach) {
            team.coach = coach;
            return this;
        }

        public FootballTeamBuilder budget(int budget) {
            team.budget = budget;
            return this;
        }

        public FootballTeamBuilder points(int points) {
            team.points = points;
            return this;
        }

        public FootballTeamBuilder city(String city) {
            team.city = city;
            return this;
        }

        public FootballTeamBuilder trophies(int trophies) {
            team.trophies = trophies;
            return this;
        }

        public FootballTeamBuilder foundationYear(int foundationYear) {
            team.foundationYear = foundationYear;
            return this;
        }

        public FootballTeam build() {
            return team;
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("FootballTeam{");

        appendField(stringBuilder, "name", name);
        appendField(stringBuilder, "coach", coach);
        appendField(stringBuilder, "budget", budget);
        appendField(stringBuilder, "points", points);
        appendField(stringBuilder, "city", city);
        appendField(stringBuilder, "trophies", trophies);
        appendField(stringBuilder, "foundationYear", foundationYear);

        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    private void appendField(StringBuilder stringBuilder, String fieldName, Object value) {
        if (value != null) {
            if (stringBuilder.length() > "FootballTeam{".length()) {
                stringBuilder.append(", ");
            }
            stringBuilder.append(fieldName).append('=').append(value);
        }
    }
}

