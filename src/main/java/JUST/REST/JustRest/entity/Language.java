package JUST.REST.JustRest.entity;

public class Language {

    private int id;             // PK
    private String name;        // 컴 언어 이름
    private  String level;      // 할 수 있는 레벨

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}



