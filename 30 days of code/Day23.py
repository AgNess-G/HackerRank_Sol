class Node:
    def __init__(self,data):
        self.right=self.left=None
        self.data = data
class Solution:
    def insert(self,root,data):
        if root==None:
            return Node(data)
        else:
            if data<=root.data:
                cur=self.insert(root.left,data)
                root.left=cur
            else:
                cur=self.insert(root.right,data)
                root.right=cur
        return root

    def levelOrder(self,root):
        #Write your code here
        queue=[root]
        f=0
        r=0
        node=root
        while(f!=-1) :
            node=queue[f]
            if(node.left != None):
                queue.append(node.left);
                r=r+1
            if(node.right != None):
                queue.append(node.right);
                r=r+1
            print(node.data,end=" ")
            if(f==r):
                f=r=-1
            else:
                f=f+1

T=int(input())
myTree=Solution()
root=None
for i in range(T):
    data=int(input())
    root=myTree.insert(root,data)
myTree.levelOrder(root)
