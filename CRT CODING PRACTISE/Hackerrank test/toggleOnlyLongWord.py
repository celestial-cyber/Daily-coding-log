"""
================================================================================
PROBLEM STATEMENT:
You are given a sentence S consisting of words separated by spaces. 
Your task is to:
1. Identify the longest word in the sentence.
2. If multiple words have the same maximum length, choose the first occurring word.
3. Toggle the case of only that word (Lowercase -> Uppercase, Uppercase -> Lowercase).
4. All other words must remain unchanged.

CONSTRAINTS:
1 <= length of S <= 10^5
String contains alphabets (a-z, A-Z) and spaces only.
Words are separated by a single space. No leading or trailing spaces.

================================================================================
ALGORITHM:
1. Read the standard input sentence line and remove any outer whitespace.
2. Split the sentence into an array of individual words using the space character ' '.
3. Find the longest word. Python's built-in max() function is stable, so using 
   key=len ensures it naturally selects the first occurrence if there is a length tie.
4. Locate the array index of this longest word using the .index() method.
5. Invert the case of the selected word utilizing the .swapcase() method.
6. Join the array of words back together with single spaces and output the result.

================================================================================
COMPLEXITY ANALYSIS:
- Time Complexity: O(N) 
  Where N is the length of the string S. Splitting the string takes O(N), finding the 
  maximum word takes O(N), finding the index takes O(N), and swapping the case takes 
  O(length of the word) which is bounded by O(N).
  
- Space Complexity: O(N)
  We store the split words in a list, which in the worst-case takes proportional 
  space to the length of the input string S.
================================================================================
"""

import sys

def solve():
    # 1. Read input string from standard input
    line = sys.stdin.read().strip()
    if not line:
        return
    
    # 2. Split the sentence into individual words
    words = line.split(' ')
    
    # 3. Find the first occurring longest word using a stable max check
    longest_word = max(words, key=len)
    
    # 4. Find the index of this word to safely modify it in place
    target_index = words.index(longest_word)
    
    # 5. Toggle the case of only the targeted longest word
    words[target_index] = words[target_index].swapcase()
    
    # 6. Join the words back with a space and print the modified sentence
    print(' '.join(words))

if __name__ == '__main__':
    solve()