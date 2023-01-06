package com.jad.share;

import com.jad.model.bynarytree.BinaryTree;

public interface IPresenter {
    void setController(final IController controller);
    void setModel(final IModel model);
    String askFileName();
    void display(BinaryTree<?> binaryTree);
}
