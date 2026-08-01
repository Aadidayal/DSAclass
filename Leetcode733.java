class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int ori= image[sr][sc];
          if (ori == color) return image;
        dfs(sr, sc, color, image, ori);
        return image;
    }

    public void dfs(int sr, int sc, int color, int[][] image, int ori) {
        if (sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length || image[sr][sc] != ori)
            return;
       
        image[sr][sc] = color;
        dfs(sr + 1, sc, color, image, ori);
        dfs(sr - 1, sc, color, image, ori)
        ;
        dfs(sr, sc + 1, color, image, ori);
        dfs(sr, sc - 1, color, image, ori);
    }
}
















