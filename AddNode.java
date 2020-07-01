package com.company.AddNode;

import com.company.AbstractNode;

import java.util.Collection;

public class AddNode implements AbstractNode {

    private final Collection<AbstractNode> list;



    public AddNode(Collection<AbstractNode> list) {
        this.list = list;
    }



    @Override
        public double calculate() {
         int result = 0;
         for (AbstractNode node : list) {
             result += node.calculate();
            }
         return result;
         }


    @Override
    public String toString() {
        return this.TreeView();
    }


    @Override
         public String TreeView(){

            String result = "";
            boolean first = true;
            for (AbstractNode node : list) {
                if (!first)
                    result += " + ";
                first = false;
                result += "(" + node.TreeView() + ")";
            }
            return result;
        }


}
