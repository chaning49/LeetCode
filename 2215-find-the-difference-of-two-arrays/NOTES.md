List<List<Integer>> answer = new ArrayList<>();
List<Integer> list1 = new ArrayList<>();
List<Integer> list2 = new ArrayList<>();
Set<Integer> set1 = new HashSet<>();
Set<Integer> set2 = new HashSet<>();
for (int n : nums1)
set1.add(n);
for (int n : nums2)
set2.add(n);
// 리스트에서 서로 존재하는 값을 제거
for (Integer l1 : set1) {
if (!set2.contains(l1))
list1.add(l1);
}
for (Integer l2 : set2) {
if (!set1.contains(l2))
list2.add(l2);
}
answer.add(list1);
answer.add(list2);
return answer;
}
}
```
- 단순하게 Set을 사용하는 방법도 사용해보았다.