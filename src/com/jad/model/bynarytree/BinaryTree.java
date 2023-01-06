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

    public int getHeight() {
        return (this.getRoot() == null) ? 0 : BinaryTree.getHeightFromNode(this.getRoot());
    }

    private static int getHeightFromNode(BinaryNode<?> node) {
        return (node == null) ? 0 : (Math.max(BinaryTree.getHeightFromNode(node.getLeft()), BinaryTree.getHeightFromNode(node.getRight()))+1);
    }
}
