package com.jad.presenter;

import com.jad.model.bynarytree.BinaryTree;
import com.jad.presenter.model.PresenterBinaryTree;
import com.jad.presenter.view.BinaryTreeView;
import com.jad.presenter.view.FileNameView;
import com.jad.share.IController;
import com.jad.share.IModel;
import com.jad.share.IPresenter;

import java.util.Observable;
import java.util.Observer;

public class Presenter implements IPresenter, Observer {
    private IController controller;
    private IModel model;

    public Presenter() {
        this.controller = null;
        this.model = null;
    }

    public IController getController() {
        return controller;
    }

    public IModel getModel() {
        return model;
    }

    public void setController(final IController controller) {
        this.controller = controller;
    }

    public void setModel(final IModel model) {
        this.model = model;
        this.model.addObserver(this);
    }

    @Override
    public String askFileName() {
        return new FileNameView().display();
    }

    @Override
    public void display(final BinaryTree<?> binaryTree) {
        new BinaryTreeView(new PresenterBinaryTree(binaryTree)).display();
    }

    @Override
    public void update(final Observable model, final Object arg) {

    }
}
