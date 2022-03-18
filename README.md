# LeetCode
Collection of LeetCode questions to ace the coding interview! - Created using [LeetHub](https://github.com/QasimWani/LeetHub)
Top Interview Questions
+ List
  + [Reverse_Linked_List](#리스트뒤집기)

+ Trees
	+ [Maximum_Depth_of_Binary_Tree](#이진트리깊이)
	+ [Validate Binary Search Tree](#이진검색트리유효)
------------------------

### 리스트뒤집기

<h2>  Reverse Linked List</h2><hr><div><p>Given the <code>head</code> of a singly linked list, reverse the list, and return <em>the reversed list</em>.</p>

<p>&nbsp;</p>
<p><strong>Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2021/02/19/rev1ex1.jpg" style="width: 542px; height: 222px;">
<pre><strong>Input:</strong> head = [1,2,3,4,5]
<strong>Output:</strong> [5,4,3,2,1]
</pre>

<p><strong>Example 2:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2021/02/19/rev1ex2.jpg" style="width: 182px; height: 222px;">
<pre><strong>Input:</strong> head = [1,2]
<strong>Output:</strong> [2,1]
</pre>

<p><strong>Example 3:</strong></p>

<pre><strong>Input:</strong> head = []
<strong>Output:</strong> []
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li>The number of nodes in the list is the range <code>[0, 5000]</code>.</li>
	<li><code>-5000 &lt;= Node.val &lt;= 5000</code></li>
</ul>

<p>&nbsp;</p>
<p><strong>Follow up:</strong> A linked list can be reversed either iteratively or recursively. Could you implement both?</p>
</div>

### 풀이 
노드의 head부터 끝까지를 순회하며 temp라는 임시 노드로 포인팅하게 하여 , 각 value를 List에 차례로 추가했다.
그 뒤 Collections.Reverse 함수를 이용해 해당 List를 거꾸로 하여 다시 순회하며 List 순대로 val을 지정했다.

-----------------------

### 이진트리깊이

<h2>  Maximum Depth of Binary Tree</h2><hr><div><p>Given the <code>root</code> of a binary tree, return <em>its maximum depth</em>.</p>

<p>A binary tree's <strong>maximum depth</strong>&nbsp;is the number of nodes along the longest path from the root node down to the farthest leaf node.</p>

<p>&nbsp;</p>
<p><strong>Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2020/11/26/tmp-tree.jpg" style="width: 400px; height: 277px;">
<pre><strong>Input:</strong> root = [3,9,20,null,null,15,7]
<strong>Output:</strong> 3
</pre>

<p><strong>Example 2:</strong></p>

<pre><strong>Input:</strong> root = [1,null,2]
<strong>Output:</strong> 2
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li>The number of nodes in the tree is in the range <code>[0, 10<sup>4</sup>]</code>.</li>
	<li><code>-100 &lt;= Node.val &lt;= 100</code></li>
</ul>
</div>

### 풀이 

자식노드가 없는 노드까지 탐색하여 각 단계별로 int d 를 증가시키는 DepthExplore 함수를 생성하여 return에서의 두 재귀호출값을 Math.max를 이용해 비교해 최대깊이를 찾아낸다.
그리고 해당 함수를 정답을 제출할 MaxDepth 함수에서 호출한다.
이전에 배웠던 깊이 탐색 알고리즘을 다시 활용해서 시간은 꽤 걸렸지만 어렵지는 않았다.

-----------------------


### 이진검색트리유효

<h2>  Validate Binary Search Tree</h2><hr><div><p>Given the <code>root</code> of a binary tree, <em>determine if it is a valid binary search tree (BST)</em>.</p>

<p>A <strong>valid BST</strong> is defined as follows:</p>

<ul>
	<li>The left subtree of a node contains only nodes with keys <strong>less than</strong> the node's key.</li>
	<li>The right subtree of a node contains only nodes with keys <strong>greater than</strong> the node's key.</li>
	<li>Both the left and right subtrees must also be binary search trees.</li>
</ul>

<p>&nbsp;</p>
<p><strong>Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2020/12/01/tree1.jpg" style="width: 302px; height: 182px;">
<pre><strong>Input:</strong> root = [2,1,3]
<strong>Output:</strong> true
</pre>

<p><strong>Example 2:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2020/12/01/tree2.jpg" style="width: 422px; height: 292px;">
<pre><strong>Input:</strong> root = [5,1,4,null,null,3,6]
<strong>Output:</strong> false
<strong>Explanation:</strong> The root node's value is 5 but its right child's value is 4.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li>The number of nodes in the tree is in the range <code>[1, 10<sup>4</sup>]</code>.</li>
	<li><code>-2<sup>31</sup> &lt;= Node.val &lt;= 2<sup>31</sup> - 1</code></li>
</ul>
</div>

### 풀이

isValid 함수에 각 노드 단계별 지켜야할 최소,최대값을 입력하는 isValid 함수를 만든다. 해당 함수를 통해 윗 단계 노드들로부터 최소,최대값을 지정받고, 해당 조건의 만족 유무를 판단한다.
isValid 함수의 리턴값은 재귀호출을 통해 왼쪽,오른쪽의 비교가 동시에 만족할 경우 true를 리턴하도록 && 을 이용해 두 재귀호출 함수를 묶어준다.
코드를 깔끔히 정리하는데 꽤 애를 많이 먹었고, 생각보다 고려할 경우의 수가 많았다. 처음엔 더 윗단계의 값을 고려하지 않아 최소값, 최대값을 지정하지않고 단순 바로 위의 노드만을 고려했다.
오답처리가 된 것을 확인해 더 윗단계의 값을 고려해야한다는 것을 알게됐고, 위와 같이 수정했다.
