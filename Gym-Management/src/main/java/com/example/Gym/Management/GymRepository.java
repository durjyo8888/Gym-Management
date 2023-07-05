package com.example.Gym.Management;


import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class GymRepository {

    HashMap<Integer,Gym> gymDb = new HashMap<>();
    HashMap<Integer,Trainer> trainerDb = new HashMap<>();
    HashMap<Integer,Member> memberDb = new HashMap<>();
    public String addGym(Gym gym) {
        if(gymDb.containsKey(gym.getGymId())){
            return null;
        }
        gymDb.put(gym.getGymId(),gym);
        return gym.toString();
    }

    public String addTrainer(Trainer trainer) {
        if(trainerDb.containsKey(trainer.getTrainerId())){
            return null;
        }
        trainerDb.put(trainer.getTrainerId(),trainer);
        return trainer.toString();
    }

    public String addMember(Member member) {
        if(memberDb.containsKey(member.getMemberId())){
            return null;
        }
        memberDb.put(member.getMemberId(),member);
        return member.toString();
    }

    public int gymWithMostMember() {
        int gym = 0, size = 0, maxsize = 0;
        for(Integer currGym : gymDb.keySet()){
            size = gymDb.get(currGym).getMemberList().size();
            if(maxsize < size){
                size = maxsize;
                gym = gymDb.get(currGym).getGymId();
            }
        }
        return gym;
    }

    public int memberWithMostTrainer() {
        int member = 0, size = 0, maxsize = 0;
        for(Integer currMember : memberDb.keySet()){
            size = memberDb.get(currMember).getTrainerList().size();
            if(maxsize < size){
                size = maxsize;
                member = memberDb.get(currMember).getMemberId();
            }
        }
        return member;
    }

    public int trainerWithMostGym() {
        int trainer = 0;
        for(Integer currTrainer : trainerDb.keySet()){
            if(trainerDb.get(currTrainer).getGymList().size() > 5){
                trainer++;
            }
        }
        return trainer;
    }
}
