/*
// Definition for a QuadTree node.
class Node {
    public boolean val;
    public boolean isLeaf;
    public Node topLeft;
    public Node topRight;
    public Node bottomLeft;
    public Node bottomRight;

    
    public Node() {
        this.val = false;
        this.isLeaf = false;
        this.topLeft = null;
        this.topRight = null;
        this.bottomLeft = null;
        this.bottomRight = null;
    }
    
    public Node(boolean val, boolean isLeaf) {
        this.val = val;
        this.isLeaf = isLeaf;
        this.topLeft = null;
        this.topRight = null;
        this.bottomLeft = null;
        this.bottomRight = null;
    }
    
    public Node(boolean val, boolean isLeaf, Node topLeft, Node topRight, Node bottomLeft, Node bottomRight) {
        this.val = val;
        this.isLeaf = isLeaf;
        this.topLeft = topLeft;
        this.topRight = topRight;
        this.bottomLeft = bottomLeft;
        this.bottomRight = bottomRight;
    }
};
*/

class Solution {
    public Node construct(int[][] grid) {
        return answer(grid, 0, 0, grid.length);
    }
    
    private Node answer(int[][] grid, int i, int j, int width) {
        if (isAllSame(grid, i, j, width)) {
            boolean value = grid[i][j] == 0 ? false : true;
            return new Node(value, true);
        }
        
        Node node = new Node(true, false);
        node.topLeft = answer(grid, i, j, width / 2);
        node.topRight = answer(grid, i, j + width / 2, width / 2);
        node.bottomLeft = answer(grid, i + width / 2, j, width / 2);
        node.bottomRight = answer(grid, i + width / 2, j + width / 2, width / 2);
        
        return node;
    }
    
    private boolean isAllSame(int[][] grid, int i, int j, int width) {
        int check = grid[i][j];
        for (int x = i; x < i + width; x++) {
            for (int y = j; y < j + width; y++) {
                if (grid[x][y] != check) return false;
            }
        }
        return true;
    }
}