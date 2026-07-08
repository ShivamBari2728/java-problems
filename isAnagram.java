// 39. Check if two given strings/arrays are anagrams.
import java.util.*;
public class isAnagram {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        if(s.length() != t.length()){
            System.out.println("Not an anagram");
        }else{
            char[] sorteds= s.toLowerCase().toCharArray();
            char[] sortedt= t.toLowerCase().toCharArray();
            Arrays.sort(sorteds);
            Arrays.sort(sortedt);
            if(Arrays.equals(sorteds, sortedt)){
                System.out.println("this is a anagram");
            }
            
        }
    }
}

/* leetcode optimal solution uses frequency insted of sorting . 


class Solution {
    public boolean isAnagram(String s, String t) {
        int[] arr1 = new int[32];
        int[] arr2 = new int[32];

        for(int i = 0; i < s.length(); i++){
            arr1[s.charAt(i) - 'a']++;
        }
        for(int i = 0; i < t.length(); i++){
            arr2[t.charAt(i) - 'a']++;
        }

        for(int i = 0; i < 32; i++){
            if(arr1[i] != arr2[i]) return false;
        }

        return true;
    }
}
*/

/*
Explaination 

This is the part that confuses almost everyone the first time they see it. Once it clicks, you'll start seeing it everywhere in string problems.

Let's go very slowly.

---

## Step 1: What is `arr1`?

```java
int[] arr1 = new int[26];
```

Imagine this array is a table where each index represents a letter.

```text
Index : 0  1  2  3  4  5  ... 25
Letter: a  b  c  d  e  f  ... z
Value : 0  0  0  0  0  0  ... 0
```

Initially, every letter has appeared **0** times.

---

## Step 2: Suppose

```java
String s = "cab";
```

The loop starts:

```java
for(int i = 0; i < s.length(); i++){
    arr1[s.charAt(i) - 'a']++;
}
```

Let's execute it by hand.

---

## First iteration

```java
i = 0
```

So

```java
s.charAt(0)
```

is

```text
'c'
```

Now look at this:

```java
'c' - 'a'
```

Java stores characters as numbers.

```text
'a' = 97
'b' = 98
'c' = 99
'd' = 100
```

So

```text
'c' - 'a'

99 - 97

= 2
```

Therefore

```java
arr1[2]++;
```

Now the array becomes

```text
Index : 0 1 2 3 4 ...

Value : 0 0 1 0 0 ...
```
so on...
*/