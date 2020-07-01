package com.company.DevideNode;

import com.company.AbstractNode;

public class DevideNode implements AbstractNode {

    private final AbstractNode left;
    private final AbstractNode right;

    public DevideNode(AbstractNode left, AbstractNode right) {
        this.left = left;
        this.right = right;
    }



    public double calculate() {
        if(left.calculate()==0)
            return 0;
        else
            return left.calculate() / right.calculate();
    }

    @Override
    public String TreeView() {
        return "(" + left.TreeView() + ") / (" + right.TreeView() + ")";
    }












}
