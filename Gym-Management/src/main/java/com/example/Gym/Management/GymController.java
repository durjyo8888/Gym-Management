package com.example.Gym.Management;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GymController {
    @Autowired
    GymService gymService;
    @PostMapping("/add_gym")
    public ResponseEntity<String>addGym(@RequestBody Gym gym){
        String s = gymService.addGym(gym);
        if(s != null){
            return new ResponseEntity("Gym added successfully", HttpStatus.CREATED);
        }
        else{
            return new ResponseEntity("Gym already exist", HttpStatus.BAD_REQUEST);
        }
    }
    @PostMapping("/add_trainer")
    public ResponseEntity<String>addTrainer(@RequestBody Trainer trainer){
        String s = gymService.addTrainer(trainer);
        if(s != null){
            return new ResponseEntity("Trainer added successfully", HttpStatus.CREATED);
        }
        else{
            return new ResponseEntity("Trainer already exist", HttpStatus.BAD_REQUEST);
        }
    }
    @PostMapping("/add_member")
    public ResponseEntity<String> addMember(@RequestBody Member member){
        String s = gymService.addMember(member);
        if(s != null){
            return new ResponseEntity("Trainer added successfully", HttpStatus.CREATED);
        }
        else{
            return new ResponseEntity("Trainer already exist", HttpStatus.BAD_REQUEST);
        }
    }
    @GetMapping("/get_gym")
    public ResponseEntity<Integer> gymWithMostMember(){
        int gym = gymService.gymWithMostMember();
        return new ResponseEntity(gym, HttpStatus.FOUND);
    }
    @GetMapping("/get_member")
    public ResponseEntity<Integer> memberWithMostTrainer(){
        int member = gymService.memberWithMostTrainer();
        return new ResponseEntity(member, HttpStatus.FOUND);
    }
    @GetMapping("/get_number_of_trainer")
    public ResponseEntity<Integer> trainerWithMostGym(){
        int trainer = gymService.trainerWithMostGym();
        return new ResponseEntity(trainer, HttpStatus.FOUND);
    }
}
