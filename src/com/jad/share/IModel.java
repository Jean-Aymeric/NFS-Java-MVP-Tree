package com.jad.share;

import com.jad.model.bynarytree.BinaryTree;

import java.util.Observer;

public interface IModel {
    public BinaryTree<?> loadBinaryTreeFromFiles(String fileName);
    void addObserver(Observer o);
    void deleteObserver(Observer o);
}
