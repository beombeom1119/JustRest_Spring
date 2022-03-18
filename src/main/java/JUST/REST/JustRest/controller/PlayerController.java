package JUST.REST.JustRest.controller;


import JUST.REST.JustRest.repository.PlayerRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/player")
public class PlayerController {

    private PlayerRepository playerRepository;


}
