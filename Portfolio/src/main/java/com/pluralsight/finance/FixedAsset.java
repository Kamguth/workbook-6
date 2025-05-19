package com.pluralsight.finance;

public abstract class FixedAsset implements Valuable {

    String name;
    double marketValue;

    public FixedAsset(String name, double value) {
        this.name = name;
        this.marketValue = value;
    }

    @Override
    public double getValue() {
        return marketValue;
    }
}
