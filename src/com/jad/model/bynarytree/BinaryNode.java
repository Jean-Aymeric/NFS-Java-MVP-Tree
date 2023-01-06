package com.jad.model.bynarytree;

public class BinaryNode<Value > {
    private Value value;
    private BinaryNode<Value> left;
    private BinaryNode<Value> right;

    public BinaryNode(final Value value, final BinaryNode<Value> left, final BinaryNode<Value> right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public BinaryNode(final Value value) {
        this(value, null, null);
    }

    public BinaryNode() {
        this(null, null, null);
    }

    public Value getValue() {
        return value;
    }

    public void setValue(final Value value) {
        this.value = value;
    }

    public BinaryNode<Value> getLeft() {
        return left;
    }

    public void setLeft(final BinaryNode<Value> left) {
        this.left = left;
    }

    public BinaryNode<Value> getRight() {
        return right;
    }

    public void setRight(final BinaryNode<Value> right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return this.value.toString();
    }
}
