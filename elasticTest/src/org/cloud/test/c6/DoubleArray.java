package org.cloud.test.c6;

import java.util.Vector;

public class DoubleArray {

	public class Trie {
		public Vector<Integer> mTrie = new Vector<Integer>();// 对应的Trie树trie.mTrie.add((int)preC);
		public Vector<Integer> mBegin = new Vector<Integer>();// 对应位置的子节点开始位置,无=-1
		public Vector<Integer> mLen = new Vector<Integer>();// 对应位置对应的匹配query数目
		public Vector<Integer> mEnd = new Vector<Integer>();// 对应位置对应的子节点结束位置，包括该位置
		public Vector<Integer> mIndex = new Vector<Integer>();// 该节点成词，对应的mQuerys下标
	}

	public Trie mTrie = null;
	final static int MIDDLE_MATCH_NUMBER = 30;// 默认中间匹配结果最小数目
	final int DEFAULT_LEN = 1024;
	public int Base[] = new int[DEFAULT_LEN];
	public int Check[] = new int[DEFAULT_LEN];
	public int Position[] = new int[DEFAULT_LEN]; // 指向对应的子字符串对应位置
	public int TriePos[] = new int[DEFAULT_LEN]; // 存入的字符对应Trie树中的位置，该树组用来生成双数组用
	public int ChildStart[] = new int[DEFAULT_LEN]; // 对应位置孩子节点开始地址 减少查询数目提高速度用
	public int ChildEnd[] = new int[DEFAULT_LEN]; // 对应位置孩子节点终止位置减少查询数目提高速度用值为-1表示没有子节点

}
