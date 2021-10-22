class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        Map<Integer, Integer> groups = new HashMap();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (!groups.containsKey(i-j))
                    groups.put(i-j, matrix[i][j]);
                else if (groups.get(i-j) != matrix[i][j])
                    return false;
            }
        }
        return true;
    }
}
