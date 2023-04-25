class SmallestInfiniteSet {
    private List<Integer> list;
    
    public SmallestInfiniteSet() {
        list = new ArrayList<>(1000);
        for (int i = 1; i <= 1000; i++)
            list.add(i);
    }
    
    public int popSmallest() {
        return list.remove(0);
    }
    
    public void addBack(int num) {
        if (!list.contains(num))
            list.add(num);
        Collections.sort(list);
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */