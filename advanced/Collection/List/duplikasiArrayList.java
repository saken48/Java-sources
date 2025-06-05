List<Integer> numbers = new ArrayList<>(List.of(1, 2, 3, 2, 4, 5, 1));
List<Integer> uniqueNumbers = new ArrayList<>();

for (Integer num : numbers) {
    if (!uniqueNumbers.contains(num)) {
        uniqueNumbers.add(num);
    }
}

System.out.println(uniqueNumbers); // Output: [1, 2, 3, 4, 5]
