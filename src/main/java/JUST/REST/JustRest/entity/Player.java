package JUST.REST.JustRest.entity;

import javax.persistence.*;



@Entity
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long number;

    @Column(length = 200, nullable = false)
    private String name;

    @Column
    private long goal;

    @Column
    private long assist;


    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getGoal() {
        return goal;
    }

    public void setGoal(long goal) {
        this.goal = goal;
    }

    public long getAssist() {
        return assist;
    }

    public void setAssist(long assist) {
        this.assist = assist;
    }
}
