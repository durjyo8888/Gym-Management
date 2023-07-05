package com.example.Gym.Management;

import java.util.ArrayList;
import java.util.List;

public class Gym {
    private int gymId;
    private String location;
    private List<Member> memberList;
    private List<Trainer> trinnerList;

    public Gym() {
    }

    public Gym(int gymId, String location) {
        this.gymId = gymId;
        this.location = location;
        this.memberList = new ArrayList<>();
        this.trinnerList = new ArrayList<>();
    }

    public int getGymId() {
        return gymId;
    }

    public void setGymId(int gymId) {
        this.gymId = gymId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Member> getMemberList() {
        return memberList;
    }

    public void setMemberList(List<Member> memberList) {
        this.memberList = memberList;
    }

    public List<Trainer> getTrinnerList() {
        return trinnerList;
    }

    public void setTrinnerList(List<Trainer> trinnerList) {
        this.trinnerList = trinnerList;
    }

    @Override
    public String toString() {
        return "Gym{" +
                "gymId=" + gymId +
                ", location='" + location + '\'' +
                ", memberList=" + memberList +
                ", trinnerList=" + trinnerList +
                '}';
    }
}
