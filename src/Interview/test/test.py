def maxProduct(self, root):
        """
        :type root: TreeNode
        :rtype: int
        """
        dic = {}
        
        def SumOfTree(node):
            if not node:
                return 0
            ls, rs = SumOfTree(node.left), SumOfTree(node.right)
            
            dic[node] = ls + rs + node.val
            return dic[node]
        
        SumOfTree(root)
        TotalSum = dic[root]
 
        self.res = 0
        def dfs(node):
            if not node:
                return
            
            tmp = (TotalSum - dic[node]) * dic[node]
            self.res = max(self.res, tmp)
            
            dfs(node.left)
            dfs(node.right)
        dfs(root)
        return self.res % (10 ** 9 + 7)