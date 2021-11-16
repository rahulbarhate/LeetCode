class solution{
    public int[] diagonalTraverse(int[][] matrix){
        if(matrix == null || matrix.length == 0){
            return new int[0];
        }

        int N = matrix.length;
        int M = matrix[0].length;

        int[] result = new int[N*M];

        Map<Integer, List<Integer>> dict = new HashMap<>();
        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                int sum = i+j;
                if(!dict.containsKey(sum)){
                    dict.put(sum, new ArrayList<>());
                }
                dict.get(sum).add(matrix[i][j]);
            }
        }

        int pointer = 0;
        for(Map.Entry<Integer, List<Integer>> entry: dict.entrySet()){
            List<Integer> tempList = new ArryaList<>();
            if(entry.getKey() % 2 == 0){
                tempList = entry.getValue();
                Collections.reverse(tempList);
            }
            else{
                tempList = entry.getValue();
            }

            for(int i = 0; i < tempList.size(); i++){
                result[pointer++] = tempList.get(i);
            }
        }

        return result;
    }
}
