class solution{
    public int[] findBuildings(int[] heights){
        List<Integer> temp = new ArrayList<>();
        int biggestBuilding = 0;
        int j = heights.length - 1;

        while(j >= 0){
            if(heights[j] > biggestBuilding){
                biggestBuilding = heights[j];
                j--;
            }
        }

        int[] result = new int[temp.size()];
        int index = 0;
        for(int i = temp.size() - 1; i >= 0; i--){
            answer[index++] = temp.get(i);
        }
        return result;
    }
}
