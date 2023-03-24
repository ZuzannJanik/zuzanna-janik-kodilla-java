package com.kodilla.patterns.strategy;

import com.kodilla.patterns.strategy.BuyPredictor;

final public class ConservativePredictor implements BuyPredictor {
    @Override
    public String predictWhatToBuy() {
        return "[Conservative predictor] Buy debentures of XYZ";
    }
}
