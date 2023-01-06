package com.jad.controller;

import com.jad.model.bynarytree.BinaryTree;
import com.jad.share.Action;
import com.jad.share.IController;
import com.jad.share.IModel;
import com.jad.share.IPresenter;

public class Controller implements IController {
    private final IPresenter presenter;
    private final IModel model;

    public Controller(final IPresenter presenter, final IModel model) {
        this.presenter = presenter;
        this.model = model;
        this.presenter.setController(this);
        this.presenter.setModel(this.model);
    }

    public IPresenter getPresenter() {
        return presenter;
    }

    public IModel getModel() {
        return model;
    }

    @Override
    public void performAction(final Action action) {

    }

    @Override
    public void start() {
        String fileName = this.getPresenter().askFileName();
        if (fileName != null) {
            BinaryTree<?> binaryTree = this.getModel().loadBinaryTreeFromFiles(fileName);
            if (binaryTree != null) {
                this.getPresenter().display(binaryTree);
            }
        }
    }
}
