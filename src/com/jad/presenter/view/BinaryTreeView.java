package com.jad.presenter.view;

import com.jad.presenter.model.PresenterBinaryTree;

public class BinaryTreeView extends DecoratorPresenterView {
    private final PresenterBinaryTree presenterBinaryTree;

    public BinaryTreeView(final PresenterBinaryTree presenterBinaryTree) {
        super(new PresenterView());
        this.presenterBinaryTree = presenterBinaryTree;
    }

    public String decoratedDisplay() {
        for (int y = 0; y < this.presenterBinaryTree.getHeight(); y++) {
            for(int x= 0; x < this.presenterBinaryTree.getWidth(); x++) {
                System.out.print(" " + this.presenterBinaryTree.getValueByXY(x, y) + " ");
            }
            System.out.println();
            if (y != this.presenterBinaryTree.getHeight()-1) {
                for (int x = 0; x < this.presenterBinaryTree.getWidth(); x++) {
                    if (! this.presenterBinaryTree.getValueByXY(x, y).equals(" ")) {
                        System.out.print("/ \\");
                    } else {
                        System.out.print("   ");
                    }
                }
                System.out.println();
            }
        }
        return null;
    }
}
