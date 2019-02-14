package ru.kisystems.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class TeamController {

    @RequestMapping(method = RequestMethod.GET, value = "/teammates")
    public String getTeammates() {
        return "teammates";
    }

}
