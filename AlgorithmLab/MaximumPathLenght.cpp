#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

// Node structure for the binary tree
struct TreeNode {
    int val;
    TreeNode* left;
    TreeNode* right;
    TreeNode(int x) : val(x), left(NULL), right(NULL) {}
};

// Function to find the height of a binary tree
int height(TreeNode* root) {
    if (root == NULL) return 0;
    return max(height(root->left), height(root->right)) + 1;
}

// Function to find the maximum path length considering any node as root
int maxPathLength(TreeNode* root) {
    if (root == NULL) return 0;

    // Calculate the height of the left and right subtrees
    int leftHeight = height(root->left);
    int rightHeight = height(root->right);

    // Recursively find the maximum path length in the left and right subtrees
    int leftMax = maxPathLength(root->left);
    int rightMax = maxPathLength(root->right);

    // Maximum path length can be in three cases:
    // 1. Through the root node
    // 2. In the left subtree
    // 3. In the right subtree
    return max(max(leftHeight + rightHeight, max(leftMax, rightMax)), max(leftHeight, rightHeight));
}

int main() {
    // Create a sample binary tree
    TreeNode* root = new TreeNode(1);
    root->left = new TreeNode(2);
    root->right = new TreeNode(3);
    root->left->left = new TreeNode(4);
    root->left->right = new TreeNode(5);
    root->right->right = new TreeNode(6);
    
    // Find the maximum path length
    int maxLength = maxPathLength(root);
    cout << "Maximum path length considering any node as root: " << maxLength << endl;

    return 0;
}
