class Solution:
    def isMatch(self,open,close):
        if open=='(' and close==')':
            return True
        if open=='[' and close==']':
            return True
        if open=='{' and close=='}':
            return True
        return False
    
    def isValid(self, s: str) -> bool:
        stack = []

        for ch in s:
            if ch in ['(','[','{']:
                stack.append(ch)
            elif len(stack)>0 and self.isMatch(stack[len(stack)-1],ch):
                stack.pop()
            else:
                return False

        return len(stack)==0
    
        
        