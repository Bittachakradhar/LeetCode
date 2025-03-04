class Solution {
    public String reverseVowels(String s) {
    Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        char[] arr = s.toCharArray();
        int i = 0, j = arr.length - 1;
        
        while (i < j) {
            while (i < j && !vowels.contains(arr[i])) {
                i++;
            }
            while (i < j && !vowels.contains(arr[j])) {
                j--;
            }
            
            if (i < j) {
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        return new String(arr);
    }
}