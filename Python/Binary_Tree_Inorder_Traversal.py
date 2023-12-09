class TreeNode:
    def __init__(self, value=0, left=None, right=None):
        self.value = value
        self.left = left
        self.right = right

def inorderTraversal(root):
    result = []
    inorder_recursive(root, result)
    return result

def inorder_recursive(node, result):
    if node:
        inorder_recursive(node.left, result)
        result.append(node.value)
        inorder_recursive(node.right, result)

# Example usage:
# Construct a sample binary tree
#       1
#        \
#         2
#        /
#       3
root = TreeNode(1)
root.right = TreeNode(2)
root.right.left = TreeNode(3)

# Get the inorder traversal
inorder_result = inorderTraversal(root)
print(inorder_result)  # Output: [1, 3, 2]