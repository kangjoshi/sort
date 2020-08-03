import java.util.Date;

public class Player {
    private String name;
    private int backNumber;
    private Date birth;

    public Player(String name, int backNumber, Date birth) {
        this.name = name;
        this.backNumber = backNumber;
        this.birth = birth;
    }

    public String getName() {
        return name;
    }

    public int getBackNumber() {
        return backNumber;
    }

    public Date getBirth() {
        return birth;
    }

}
