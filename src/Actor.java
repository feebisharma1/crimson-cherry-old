import java.util.Objects;

public class Actor {

    private String sex;
    private String hometown;
    private long height;
    private String name;
    private long children;
    private String birthday;


    public Actor(String sex, String hometown, long height, String name, long children, String birthday, List<Movie> movieList) {
        this.sex = sex;
        this.hometown = hometown;
        this.height = height;
        this.name = name;
        this.children = children;
        this.birthday = birthday;
        this.movieList = movieList;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public long getHeight() {
        return height;
    }

    public void setHeight(long height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getChildren() {
        return children;
    }

    public void setChildren(long children) {
        this.children = children;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public List<Movie> getMovieList() {
        return movieList;
    }

    public void setMovieList(List<Movie> movieList) {
        this.movieList = movieList;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Actor{" +
                "sex='" + sex + '\'' +
                ", hometown='" + hometown + '\'' +
                ", height=" + height +
                ", name='" + name + '\'' +
                ", children=" + children +
                ", birthday='" + birthday + '\'' +
                ", movieList=" + movieList +
                '}';
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Actor actor = (Actor) object;
        return height == actor.height && children == actor.children && java.util.Objects.equals(sex, actor.sex) && java.util.Objects.equals(hometown, actor.hometown) && java.util.Objects.equals(name, actor.name) && java.util.Objects.equals(birthday, actor.birthday) && java.util.Objects.equals(movieList, actor.movieList);
    }

    public int hashCode() {
        return Objects.hash(super.hashCode(), sex, hometown, height, name, children, birthday, movieList);
    }

    @ManyToMany(cascade = CascadeType.PERSIST)
    private List<Movie> movieList;


    public Actor(){}


}