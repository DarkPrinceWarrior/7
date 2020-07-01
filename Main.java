package com.company;

import com.company.AddNode.AddNode;
import com.company.DevideNode.DevideNode;
import com.company.SimpleNode.SimpleNode;

import java.util.ArrayList;
import java.util.Collection;


public class Main {



    private static AbstractNode generateFirst(Collection<AbstractNode> col1, Collection<AbstractNode> col2) {
        return new DevideNode(

                new AddNode(col1),

                new AddNode(col2)
        );
    }



    private static AbstractNode generateSecond(Collection<AbstractNode> col1) {


        return new AddNode(col1);


    }



    public static void main(String[] args) {

        Collection<AbstractNode> col1=new ArrayList<>();
        col1.add(new SimpleNode(5));
        col1.add(new SimpleNode(2));
        col1.add(new SimpleNode(1));
        col1.add(new SimpleNode(3));

        Collection<AbstractNode> col2=new ArrayList<>();
        col2.add(new SimpleNode(7));
        col2.add(new SimpleNode(3));
        col2.add(new SimpleNode(4));
        col2.add(new SimpleNode(5));



        AbstractNode first = generateFirst(col1, col2);
        System.out.println("Output of the Tree");
        System.out.println();
        System.out.println();
        System.out.println("The first expression is: " + first.TreeView()
                + "\tValue is: " + first.calculate());
        System.out.println();
        col1.clear();
        col2.clear();

        Collection<AbstractNode> col3=new ArrayList<>();

        col3.add(new SimpleNode(5));
        col3.add(new SimpleNode(6));
        col3.add(new SimpleNode(7));

        col2.add(new SimpleNode(15));
        col2.add(new SimpleNode(2));
        col2.add(new SimpleNode(3));
        col2.add(new SimpleNode(4));


        col1.add(new AddNode(col3));
        col1.add(new DevideNode(new SimpleNode(0), new AddNode(col2)));

        AbstractNode second = generateSecond(col1);
        System.out.println();
        System.out.println("The second expression is: " + second.TreeView()
                + "\tValue is: " + second.calculate());

    }




}
