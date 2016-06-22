package org.egig.java.dsa;

import org.egig.java.dsa.MyLinkedList.Node;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class MyLinkedListTest extends TestCase {

	public void testNode() {
		MyLinkedList mll = new MyLinkedList();
		Node n = mll.new Node("foo");

		assertEquals("foo", n.data);
	}
}
