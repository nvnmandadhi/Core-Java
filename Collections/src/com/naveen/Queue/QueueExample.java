package com.naveen.Queue;

import java.util.*;

public class QueueExample {

    public static void main(String[] args) {

	Queue<String> queue = new PriorityQueue<>();

	queue.add("aello");
	queue.add("Hadhahkd");
	queue.add("ajdhaks");
	queue.add("bkhkk");
	queue.add("mkmiijij");

	while (queue.peek() != null)
	    System.out.println(queue.poll());

    }

}
