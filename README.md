# LeetCode
Collection of LeetCode questions to ace the coding interview! - Created using [LeetHub](https://github.com/QasimWani/LeetHub)
Top Interview Questions
+ List
  + [Reverse_Linked_List](#리스트뒤집기)
  + [Move Zeros](#0옮기기)
  + [Two Sum](#두수의합)

+ Trees
	+ [Maximum_Depth_of_Binary_Tree](#이진트리깊이)
	+ [Validate Binary Search Tree](#이진검색트리유효)

+ Sorting And Searching
	+ [First Bad Version](#첫불량버젼)
	+ [Merge Sorted Array](#정렬된배열합치기)
	
+ Math
	+ [Fizz Buzz](#피즈버즈) 
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

----------------------

### 첫불량버젼

<h2>  First Bad Version</h2><hr><div><p>You are a product manager and currently leading a team to develop a new product. Unfortunately, the latest version of your product fails the quality check. Since each version is developed based on the previous version, all the versions after a bad version are also bad.</p>

<p>Suppose you have <code>n</code> versions <code>[1, 2, ..., n]</code> and you want to find out the first bad one, which causes all the following ones to be bad.</p>

<p>You are given an API <code>bool isBadVersion(version)</code> which returns whether <code>version</code> is bad. Implement a function to find the first bad version. You should minimize the number of calls to the API.</p>

<p>&nbsp;</p>
<p><strong>Example 1:</strong></p>

<pre><strong>Input:</strong> n = 5, bad = 4
<strong>Output:</strong> 4
<strong>Explanation:</strong>
call isBadVersion(3) -&gt; false
call isBadVersion(5)&nbsp;-&gt; true
call isBadVersion(4)&nbsp;-&gt; true
Then 4 is the first bad version.
</pre>

<p><strong>Example 2:</strong></p>

<pre><strong>Input:</strong> n = 1, bad = 1
<strong>Output:</strong> 1
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= bad &lt;= n &lt;= 2<sup>31</sup> - 1</code></li>
</ul>
</div>

### 풀이

가장 처음은 앞에서부터 차례로 1씩 증가시키며 테스트 하는 방법을 택했다. 작은 수에서는 문제가 없었지만 테스트 대상이 매우 큰 수가 되자 시간 초과로 에러가 발생했다.
소요 시간을 줄이기 위해서는 반드시 절반씩 줄이는 방법을 택해야겠다는 생각을 했고, min과 max값을 설정하고 mid값을 이용해 테스트를 하고 테스트 결과에 따라 min과 max 값을 변경하며 범위를 수정해나가며 테스트하도록했다.

-----------------------------

### 정렬된배열합치기

<h2>  Merge Sorted Array</h2><hr><div><p>You are given two integer arrays <code>nums1</code> and <code>nums2</code>, sorted in <strong>non-decreasing order</strong>, and two integers <code>m</code> and <code>n</code>, representing the number of elements in <code>nums1</code> and <code>nums2</code> respectively.</p>

<p><strong>Merge</strong> <code>nums1</code> and <code>nums2</code> into a single array sorted in <strong>non-decreasing order</strong>.</p>

<p>The final sorted array should not be returned by the function, but instead be <em>stored inside the array </em><code>nums1</code>. To accommodate this, <code>nums1</code> has a length of <code>m + n</code>, where the first <code>m</code> elements denote the elements that should be merged, and the last <code>n</code> elements are set to <code>0</code> and should be ignored. <code>nums2</code> has a length of <code>n</code>.</p>

<p>&nbsp;</p>
<p><strong>Example 1:</strong></p>

<pre><strong>Input:</strong> nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
<strong>Output:</strong> [1,2,2,3,5,6]
<strong>Explanation:</strong> The arrays we are merging are [1,2,3] and [2,5,6].
The result of the merge is [<u>1</u>,<u>2</u>,2,<u>3</u>,5,6] with the underlined elements coming from nums1.
</pre>

<p><strong>Example 2:</strong></p>

<pre><strong>Input:</strong> nums1 = [1], m = 1, nums2 = [], n = 0
<strong>Output:</strong> [1]
<strong>Explanation:</strong> The arrays we are merging are [1] and [].
The result of the merge is [1].
</pre>

<p><strong>Example 3:</strong></p>

<pre><strong>Input:</strong> nums1 = [0], m = 0, nums2 = [1], n = 1
<strong>Output:</strong> [1]
<strong>Explanation:</strong> The arrays we are merging are [] and [1].
The result of the merge is [1].
Note that because m = 0, there are no elements in nums1. The 0 is only there to ensure the merge result can fit in nums1.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>nums1.length == m + n</code></li>
	<li><code>nums2.length == n</code></li>
	<li><code>0 &lt;= m, n &lt;= 200</code></li>
	<li><code>1 &lt;= m + n &lt;= 200</code></li>
	<li><code>-10<sup>9</sup> &lt;= nums1[i], nums2[j] &lt;= 10<sup>9</sup></code></li>
</ul>

<p>&nbsp;</p>
<p><strong>Follow up: </strong>Can you come up with an algorithm that runs in <code>O(m + n)</code> time?</p>
</div>

### 풀이

nums1의 m번 index부터 무효값인 0이 입력돼있기 때문에 for문을 m부터 시작하여 차례로 nums2 의 값을 대입한 후, Array.sort를 이용하여 nums1을 다시 정렬했다.

---------------------------

### 피즈버즈

<h2>  Fizz Buzz</h2><hr><div><p>Given an integer <code>n</code>, return <em>a string array </em><code>answer</code><em> (<strong>1-indexed</strong>) where</em>:</p>

<ul>
	<li><code>answer[i] == "FizzBuzz"</code> if <code>i</code> is divisible by <code>3</code> and <code>5</code>.</li>
	<li><code>answer[i] == "Fizz"</code> if <code>i</code> is divisible by <code>3</code>.</li>
	<li><code>answer[i] == "Buzz"</code> if <code>i</code> is divisible by <code>5</code>.</li>
	<li><code>answer[i] == i</code> (as a string) if none of the above conditions are true.</li>
</ul>

<p>&nbsp;</p>
<p><strong>Example 1:</strong></p>
<pre><strong>Input:</strong> n = 3
<strong>Output:</strong> ["1","2","Fizz"]
</pre><p><strong>Example 2:</strong></p>
<pre><strong>Input:</strong> n = 5
<strong>Output:</strong> ["1","2","Fizz","4","Buzz"]
</pre><p><strong>Example 3:</strong></p>
<pre><strong>Input:</strong> n = 15
<strong>Output:</strong> ["1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"]
</pre>
<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= n &lt;= 10<sup>4</sup></code></li>
</ul>
</div>

### 풀이
for문을 이용해 list에 String을 하나씩 add하고, else if 를 이용해 가장 작은 경우의 수부터 제외해 나가며 적합한 값을 추가해나갔다.
겹치는 경우가 생겨 중복입력이 발생할 수 있는 15 배수에 FizzBuzz를 가장 먼저 입력하고 3과 5의 배수는 15의 배수를 제거하면 겹치는 경우가 없기 때문에 순서에 상관 없이 추가했다.
모든 경우를 벗어나면 else 를 이용해 해당 i를 Integer.toString을 이용해 입력했다.

-------------------

### 0옮기기

<h2>  Move Zeroes</h2><hr><div><p>Given an integer array <code>nums</code>, move all <code>0</code>'s to the end of it while maintaining the relative order of the non-zero elements.</p>

<p><strong>Note</strong> that you must do this in-place without making a copy of the array.</p>

<p>&nbsp;</p>
<p><strong>Example 1:</strong></p>
<pre><strong>Input:</strong> nums = [0,1,0,3,12]
<strong>Output:</strong> [1,3,12,0,0]
</pre><p><strong>Example 2:</strong></p>
<pre><strong>Input:</strong> nums = [0]
<strong>Output:</strong> [0]
</pre>
<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= nums.length &lt;= 10<sup>4</sup></code></li>
	<li><code>-2<sup>31</sup> &lt;= nums[i] &lt;= 2<sup>31</sup> - 1</code></li>
</ul>

<p>&nbsp;</p>
<strong>Follow up:</strong> Could you minimize the total number of operations done?</div>

### 풀이 

for문에서 탐색할 index인 i와 nums에 새로 입력할 index를 따로 선언한다. 해당 nums[i]가 0이라면 i만 증가시켜 다음 nums를 탐색하고 0이 아니라면 nums[index]에 nums[i]를 대입하고 index를 증가시켜 다음 번호에 입력할 수 있도록 한다.
마지막으로 while( index != nums.length ) 로 남아있는 nums를 0으로 채운다.

------------------------

### 두수의합

<h2>  Two Sum</h2><hr><div><p>Given an array of integers <code>nums</code>&nbsp;and an integer <code>target</code>, return <em>indices of the two numbers such that they add up to <code>target</code></em>.</p>

<p>You may assume that each input would have <strong><em>exactly</em> one solution</strong>, and you may not use the <em>same</em> element twice.</p>

<p>You can return the answer in any order.</p>

<p>&nbsp;</p>
<p><strong>Example 1:</strong></p>

<pre><strong>Input:</strong> nums = [2,7,11,15], target = 9
<strong>Output:</strong> [0,1]
<strong>Explanation:</strong> Because nums[0] + nums[1] == 9, we return [0, 1].
</pre>

<p><strong>Example 2:</strong></p>

<pre><strong>Input:</strong> nums = [3,2,4], target = 6
<strong>Output:</strong> [1,2]
</pre>

<p><strong>Example 3:</strong></p>

<pre><strong>Input:</strong> nums = [3,3], target = 6
<strong>Output:</strong> [0,1]
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>2 &lt;= nums.length &lt;= 10<sup>4</sup></code></li>
	<li><code>-10<sup>9</sup> &lt;= nums[i] &lt;= 10<sup>9</sup></code></li>
	<li><code>-10<sup>9</sup> &lt;= target &lt;= 10<sup>9</sup></code></li>
	<li><strong>Only one valid answer exists.</strong></li>
</ul>

<p>&nbsp;</p>
<strong>Follow-up:&nbsp;</strong>Can you come up with an algorithm that is less than&nbsp;<code>O(n<sup>2</sup>)&nbsp;</code>time complexity?</div>

### 풀이 

두 index i와 j 를 for문 2번을 거쳐 뒤쪽의 수를 차례대로 i를 선택했을 때 부터 target과의 차를 구해 뒤쪽 수들 중 해당 값(answer)가 있는지 확인한다.
answer와 같은 값이 발견되면 i와 j 를 result[0],result[1]에 대입하여 return한다.
