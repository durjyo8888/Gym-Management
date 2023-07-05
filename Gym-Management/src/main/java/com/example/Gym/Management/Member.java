package com.example.Gym.Management;

import java.util.ArrayList;
import java.util.List;

public class Member {
    private int memberId;
    private int gym;
    private List<Trainer> trainerList;

    public Member() {
    }

    public Member(int memberId, int gym) {
        this.memberId = memberId;
        this.gym = gym;
        this.trainerList = new ArrayList<>();
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public int getGym() {
        return gym;
    }

    public void setGym(int gym) {
        this.gym = gym;
    }

    public List<Trainer> getTrainerList() {
        return trainerList;
    }

    public void setTrainerList(List<Trainer> trainerList) {
        this.trainerList = trainerList;
    }

    @Override
    public String toString() {
        return "Member{" +
                "memberId=" + memberId +
                ", gym=" + gym +
                ", trainerList=" + trainerList +
                '}';
    }
}
