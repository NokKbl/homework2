# homework2

## Problem 4 (Recursion Gone Wrong)

**4.1 Explain why this function is so slow, even for fairly small values of n (like n = 45 or n = 50).**
- This function is so slow because it's too many recursive function calls. In every times we call a function, there are two more recursive function calls and each call also calls another two more recursive function until they reach a base case and return back result out one by one until it reach the original one and each call takes time to calculate result, so, if n is large then it calls a lot of recursive function and takes really long time to reach the base case and do all calculations also.