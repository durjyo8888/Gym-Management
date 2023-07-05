package com.example.Gym.Management;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GymService {
    @Autowired
    GymRepository gymRepository;

    public String addGym(Gym gym) {
        return gymRepository.addGym(gym);
    }

    public String addTrainer(Trainer trainer) {
        return gymRepository.addTrainer(trainer);
    }

    public String addMember(Member member) {
        return gymRepository.addMember(member);
    }

    public int gymWithMostMember() {
        return gymRepository.gymWithMostMember();
    }

    public int memberWithMostTrainer() {
        return gymRepository.memberWithMostTrainer();
    }

    public int trainerWithMostGym() {
        return gymRepository.trainerWithMostGym();
    }
}
