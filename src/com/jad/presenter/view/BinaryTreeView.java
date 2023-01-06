package com.jad.presenter.view;

import com.jad.presenter.model.PresenterBinaryTree;

public class BinaryTreeView implements IPresenterView {
    private final PresenterBinaryTree presenterBinaryTree;

    public BinaryTreeView(final PresenterBinaryTree presenterBinaryTree) {
        this.presenterBinaryTree = presenterBinaryTree;
    }

    @Override
    public String display() {
        for (int y = 0; y < this.presenterBinaryTree.getHeight(); y++) {
            for(int x= 0; x < this.presenterBinaryTree.getWidth(); x++) {
                System.out.print(this.presenterBinaryTree.getValueByXY(x, y) + "\t");
            }
            System.out.println("");
        }
        return null;
    }
}
