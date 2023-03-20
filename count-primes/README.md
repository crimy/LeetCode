<h2>  Count Primes</h2><hr><div><p>Given an integer <code>n</code>, return <em>the number of prime numbers that are strictly less than</em> <code>n</code>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre><strong>Input:</strong> n = 10
<strong>Output:</strong> 4
<strong>Explanation:</strong> There are 4 prime numbers less than 10, they are 2, 3, 5, 7.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre><strong>Input:</strong> n = 0
<strong>Output:</strong> 0
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre><strong>Input:</strong> n = 1
<strong>Output:</strong> 0
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>0 &lt;= n &lt;= 5 * 10<sup>6</sup></code></li>
</ul>
</div>

<p><strong>정리:</strong></p>

<ul>
	<li>러프하게 for루프를 통한 반복으로 소수를 찾아내는 데까지는 성공했지만 시간제한에 걸려 짝수를 먼저 제외해서 조금은 줄일 수 있었지만 다른 접근이 필요해보였다.<br/>힌트의 아리스토테네스의 체를 서칭해보고 다른 풀이를 보게됐다. 다시 시작한 알고리즘 공부인데 수학적인 지식을 더해서 성능적인 개선이 필요한 문제들에는 역시 어려움이 많은 것같다. </li>
</ul>
</div>
