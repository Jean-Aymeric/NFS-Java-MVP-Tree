package com.jad.presenter.model;

import com.jad.model.bynarytree.BinaryNode;
import com.jad.model.bynarytree.BinaryTree;

public class PresenterBinaryTree {
    private final BinaryNode<?>[][] nodes;

    public PresenterBinaryTree(BinaryTree<?> binaryTree) {
        if (binaryTree == null) {
            nodes = null;
            return;
        }
        int height = binaryTree.getHeight();

        nodes = new BinaryNode[height][(int) Math.pow(2, height - 1)];
        this.fillNodesArray(binaryTree.getRoot(), 0, 0);
    }

    private void fillNodesArray(BinaryNode<?> node, int height, int horizontalRank) {
        if (node == null) {
            return;
        }
        this.nodes[height][horizontalRank] = node;
        this.fillNodesArray(node.getLeft(), height + 1, horizontalRank);
        this.fillNodesArray(node.getRight(), height + 1, horizontalRank + (this.nodes[0].length / (int) Math.pow(2, height+1)));
    }

    public int getHeight() {
        if (this.nodes == null) {
            return 0;
        }
        return this.nodes.length;
    }

    public int getWidth() {
        if (this.nodes == null) {
            return 0;
        }
        return this.nodes[0].length;
    }

    public String getValueByXY(int x, int y) {
        return (this.nodes[y][x] == null) ? "" : this.nodes[y][x].getValue().toString();
    }
}
