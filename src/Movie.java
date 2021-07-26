import java.util.Objects;

public class Movie {

    private long runtime;
    private String director;
    private String budget;
    private long address2;
    private String studio;
    private String rating;
    private String name;
    private String year;
    private String synopsis;

    public Movie(long runtime, String director, String budget, long address2, String studio, String rating, String name, String year, String synopsis, List<Actor> actorList) {
        this.runtime = runtime;
        this.director = director;
        this.budget = budget;
        this.address2 = address2;
        this.studio = studio;
        this.rating = rating;
        this.name = name;
        this.year = year;
        this.synopsis = synopsis;
        this.actorList = actorList;
    }

    public long getRuntime() {
        return runtime;
    }

    public void setRuntime(long runtime) {
        this.runtime = runtime;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getBudget() {
        return budget;
    }

    public void setBudget(String budget) {
        this.budget = budget;
    }

    public long getAddress2() {
        return address2;
    }

    public void setAddress2(long address2) {
        this.address2 = address2;
    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public List<Actor> getActorList() {
        return actorList;
    }

    public void setActorList(List<Actor> actorList) {
        this.actorList = actorList;
    }


    @java.lang.Override
    public java.lang.String toString() {
        return "Movie{" +
                "runtime=" + runtime +
                ", director='" + director + '\'' +
                ", budget='" + budget + '\'' +
                ", address2=" + address2 +
                ", studio='" + studio + '\'' +
                ", rating='" + rating + '\'' +
                ", name='" + name + '\'' +
                ", year='" + year + '\'' +
                ", synopsis='" + synopsis + '\'' +
                ", actorList=" + actorList +
                '}';
    }

    @ManyToMany(cascade = CascadeType.PERSIST)
    private List<Actor> actorList;

    public Movie(){}


}
