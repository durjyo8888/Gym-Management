package com.example.Gym.Management;

import java.util.ArrayList;
import java.util.List;

public class Trainer {
    private int trainerId;
    private List<Member> memberList;
    private List<Gym> gymList;

    public Trainer() {
    }

    public Trainer(int trainerId) {
        this.trainerId = trainerId;
        this.memberList = new ArrayList<>();
        this.gymList = new ArrayList<>();
    }

    public int getTrainerId() {
        return trainerId;
    }

    public void setTrainerId(int trainerId) {
        this.trainerId = trainerId;
    }

    public List<Member> getMemberList() {
        return memberList;
    }

    public void setMemberList(List<Member> memberList) {
        this.memberList = memberList;
    }

    public List<Gym> getGymList() {
        return gymList;
    }

    public void setGymList(List<Gym> gymList) {
        this.gymList = gymList;
    }

    @Override
    public String toString() {
        return "Trainer{" +
                "trainerId=" + trainerId +
                ", memberList=" + memberList +
                ", gymList=" + gymList +
                '}';
    }
}
