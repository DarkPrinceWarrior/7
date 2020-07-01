package com.company.SimpleNode;

import com.company.AbstractNode;

public class SimpleNode implements AbstractNode {

    private final int value;

    public SimpleNode(int value) {
        this.value = value;
    }

    public double calculate() {
        return value;
    }

    @Override
    public String TreeView() {

        return String.valueOf(value);
    }









}
