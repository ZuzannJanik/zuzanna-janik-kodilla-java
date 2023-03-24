package com.kodilla.patterns.strategy;

import com.kodilla.patterns.strategy.BuyPredictor;

final public class BalancedPredictor implements BuyPredictor {

    @Override
    public String predictWhatToBuy() {
        return "[Balanced predictor] Buy shared units of Fund XYZ";
    }
}