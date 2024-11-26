package com.example;

import org.junit.jupiter.api.Test;

import com.example.app.ds.sort.BinarySearchTree;
import com.example.app.ds.sort.BinarySearchTree.Node;

public class DataStructureTest {
    @Test
    public void assertBinarySearch() {
        Node root = null;

        root = BinarySearchTree.insert(root, 40);
        root = BinarySearchTree.insert(root, 40);
        root = BinarySearchTree.insert(root, 40);
    }
}
