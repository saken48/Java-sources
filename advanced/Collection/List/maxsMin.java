
// cari nilai maksimum dan minimum
List<Integer> scores = List.of(85, 90, 70, 95, 60);
int max = scores.get(0);
int min = scores.get(0);

for (int score : scores) {
    if (score > max) max = score;
    if (score < min) min = score;
}

System.out.println("Max: " + max);
System.out.println("Min: " + min);
