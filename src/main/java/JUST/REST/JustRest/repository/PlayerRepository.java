package JUST.REST.JustRest.repository;

import JUST.REST.JustRest.entity.Player;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PlayerRepository extends CrudRepository <Player, Long> {

    Player findByGoal(int goal);




    //select name from player where goal = (select max(goal) from Player);


    @Query(value = "select name from player where goal = (select max(goal) from player)",nativeQuery = true)
    public String selectMVP();



}
