package com.jad.model.bynarytree;

public class BinaryTree<Value> {
    private BinaryNode<Value> root;

    public BinaryTree(final BinaryNode<Value> root) {
        this.root = root;
    }

    public BinaryTree() {
        this(null);
    }

    public BinaryNode<Value> getRoot() {
        return root;
    }

    public void setRoot(final BinaryNode<Value> root) {
        this.root = root;
    }
}
