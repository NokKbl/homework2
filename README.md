# homework2

##4. (Recursion Gone Wrong)

**4.1 Explain why this function is so slow, even for fairly small values of n (like n = 45 or n = 50).**
- This function is so slow because it's too many recursive function calls. In every times that we call a function, there are two more recursive function calls and each call takes some time to calculate result, so, if n is large then it calls a lot of recursive function and takes longer time to do all calculations also.