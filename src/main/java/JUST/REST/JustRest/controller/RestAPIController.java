package JUST.REST.JustRest.controller;


import JUST.REST.JustRest.entity.Player;
import JUST.REST.JustRest.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class RestAPIController {

    @Autowired
    PlayerRepository playerRepository;          //Autowired를 통해 playerRepository를 연결


    @GetMapping("/get")                                    //선수들 불러오기
    public List<Player> getPlayer() {
        return (List<Player>) playerRepository.findAll();
    }

    @GetMapping("/mvp")
    public String mvpPlayer() {
        return playerRepository.selectMVP();
    }

    @PostMapping("/add")                                  /// 선수 영입
    public Player Add(@RequestBody Player player)           /// POST 객체 받을때 객체로 받기!
    {
        playerRepository.save(player);
        return player;
    }

    @PutMapping("/score/{number}")                    ///선수의 번호를 통해서 골 수 추가
    public Player score(@PathVariable Long number) {
        Optional<Player> score_player = playerRepository.findById(number);
        Player player = new Player();
        player.setNumber(score_player.get().getNumber());
        player.setName(score_player.get().getName());
        player.setGoal(score_player.get().getGoal() + 1);
        player.setAssist(score_player.get().getAssist());
        playerRepository.save(player);
        return player;
    }


    @DeleteMapping("/delete/{number}")                      //선수 삭제
    public String deletePlayer(@PathVariable Long number) {
        playerRepository.deleteById(number);
        return number + "번 선수 삭제 성공";
    }


}
