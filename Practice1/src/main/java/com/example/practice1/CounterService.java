package com.example.practice1;

import org.springframework.stereotype.Service;

@Service
public class CounterService {
    private int rollDiceCount = 0;
    private int countEndpointCount = 0;

    public void incrementRollDiceCount() {
        rollDiceCount++;
    }

    public void incrementCountEndpointCount() {
        countEndpointCount++;
    }

    public int getRollDiceCount() {
        return rollDiceCount;
    }

    public int getCountEndpointCount() {
        return countEndpointCount;
    }
}
