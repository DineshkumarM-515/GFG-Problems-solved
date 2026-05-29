<h2><a href="https://www.geeksforgeeks.org/problems/restrictive-candy-crush--141631/1?page=2&category=Stack&sortBy=submissions">Removing K Consecutive Identical</a></h2><h3>Difficulty Level : Difficulty: Medium</h3><hr><div class="problems_problem_content__Xm_eO" style="--text-color: var(--problem-text-color);"><p><span style="font-size: 18px;">Given a string <strong>s</strong>&nbsp;and an integer <strong>k</strong>, the task is to reduce the string by removing k consecutive identical characters.&nbsp;</span><span style="font-size: 18px;">The removal operation can be performed any number of times until it is no longer possible.</span></p>
<p><span style="font-size: 18px;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input: </strong>k = 2, s = "geeksforgeeks"
<strong>Output: </strong>gksforgks
<strong>Explanation: </strong>Modified String after each step: 
<strong>"</strong>g<strong>ee</strong>ksforg<strong>ee</strong>ks" -&gt; "gksforgks"</span>
</pre>
<pre><span style="font-size: 18px;"><strong>Input: </strong>k = 2, s =<strong> "</strong>geegsforgeeeks" 
<strong>Output: </strong>sforgeks
<strong>Explanation: </strong>Modified String after each step:
<strong>"</strong>g<strong>ee</strong>gsforg<strong>eee</strong>ks" -&gt; "<strong>gg</strong>sforgeks" -&gt; "sforgeks"</span>
</pre>
<pre><span style="font-size: 18px;"><strong>Input: </strong>k = 2, s =<strong> "</strong>abbac" 
<strong>Output: </strong>c</span></pre>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 ≤ s.size() ≤ 10<sup>5</sup><br>1&nbsp;≤ k&nbsp;≤ |s|</span></p></div><p><span style=font-size:18px><strong>Company Tags : </strong><br><code>Amazon</code>&nbsp;<code>Microsoft</code>&nbsp;<br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Strings</code>&nbsp;<code>Stack</code>&nbsp;<code>Data Structures</code>&nbsp;