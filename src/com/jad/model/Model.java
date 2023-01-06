package com.jad.model;

import com.jad.model.bynarytree.BinaryNode;
import com.jad.model.bynarytree.BinaryTree;
import com.jad.share.IModel;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Observable;
import java.util.Scanner;

public class Model extends Observable implements IModel {
    public BinaryTree<?> loadBinaryTreeFromFiles(String fileName) {
        try {
            Scanner scanner = new Scanner(new File(fileName));
            return Model.StringToBinaryTree(scanner.nextLine());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    private static BinaryTree<?> StringToBinaryTree(String binaryTreeInString) {
        String[] array = binaryTreeInString.split(";");
        if (array.length == 0) {
            return null;
        }

        BinaryTree<String> binaryTree = new BinaryTree<>();
        binaryTree.setRoot(new BinaryNode<String>(array[0]));
        Model.FillBinaryTree(array, binaryTree.getRoot(), 0);
        return binaryTree;
    }

    private static void FillBinaryTree(String[] array, BinaryNode<String> parent, int rank) {
        if  (((rank * 2) + 1) >= array.length) {
            return;
        }
        BinaryNode<String> left = null;
        if ((! array[(rank * 2) + 1].equals("")) && (!array[(rank * 2) + 1].equals("-")) ) {
            left = new BinaryNode<>(array[(rank * 2) + 1]);
            parent.setLeft(left);
            FillBinaryTree(array, left, (rank * 2) + 1);
        }

        if  (((rank * 2) + 2) >= array.length) {
            return;
        }
        BinaryNode<String> right = null;
        if ((! array[(rank * 2) + 2].equals("")) && (!array[(rank * 2) + 2].equals("-")) ) {
            right = new BinaryNode<>(array[(rank * 2) + 2]);
            parent.setRight(right);
            FillBinaryTree(array, right, (rank * 2) + 2);
        }
    }
}
