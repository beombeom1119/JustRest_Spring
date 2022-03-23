package JUST.REST.JustRest.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data               //Lombok을 통해서 Data를 쉽게 적용할 수 있다.    @Getter, @Setter, @RequiredArgsConstructor, @ToString, @EqualsAndHashCode 를 한번에 설정
@Setter             //Lombok을 통해서 Setter을 쉽게 적용할 수 있다.
@Getter             //Lombok을 통해서 Getter를 쉽게 적용할 수 있다.   ---> 가독성을 위해서 Getter Setter도 추가
@Entity
public class Player {

    @GeneratedValue
    @Id
    private Long number;

    @Column
    private String name;

    @Column
    private int goal;

    @Column
    private int assist;





    @Override
    public String toString() {
        return "Player{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", goal=" + goal +
                ", assist=" + assist +
                '}';
    }
}
