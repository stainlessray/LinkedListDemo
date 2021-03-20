package com.codedifferently.collections.lists;

import org.junit.Assert;
import org.junit.Test;

public class NodeTest {


    @Test
    public void testHasNext() {
        // Given we have a node
        Node<String> node = new Node<>("The cheese stands alone");
        Node<String> node2 = new Node<>("the amigo boat rides together");

        // When we set hasNext to true
        node.setNext(node2);
        Boolean actual = node.hasNext();

        // assert true
        Assert.assertTrue(actual);

    }



}
