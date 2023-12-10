package com.prayer.model;

public abstract class Rule {
    private int type;
    private int value;

    public Rule() {
        // default constructor
    }

    public int getType() {
        return this.type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        this.value = value;
    }

}
