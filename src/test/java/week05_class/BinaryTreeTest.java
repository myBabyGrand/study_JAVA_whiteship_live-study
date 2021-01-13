package week05_class;

import org.junit.jupiter.api.*;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeTest {
    static BinaryTree binaryTree;

    @DisplayName("Binary Tree Create")
    @BeforeAll
    static void preProcess(){
        binaryTree = new BinaryTree();
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        binaryTree.addAll(arr);
        System.out.println(binaryTree.root.getValue()+" "+binaryTree.root.getLeft().getValue()+" "+binaryTree.root.getRight().getValue());
    }


    @Test
    void getRoot() {
        Assertions.assertEquals(1,binaryTree.getRoot().getValue());
    }
    @DisplayName("Bfs 테스트")
    @Test
    void bfs() {
        binaryTree.bfs(binaryTree.root);
        List<Integer> expect = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Assertions.assertArrayEquals(expect.toArray(), binaryTree.bfsRlst.toArray());
    }
    @DisplayName("Bfs 테스트")
    @Test
    void dfsInOrder() {
        binaryTree.dfsInOrder(binaryTree.root);
        List<Integer> expect = Arrays.asList(8,4,9,2,10,5,1,6,3,7);
        Assertions.assertArrayEquals(expect.toArray(), binaryTree.dfsRlst.toArray());
    }
}