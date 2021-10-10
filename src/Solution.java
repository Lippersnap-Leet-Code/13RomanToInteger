public class Solution {
    public int romanToInt(String s) {
        int answer = 0;

        for (int i = 0; i < s.length(); i++) {
            int current = getInt(s.charAt(i));
            int next;

            if (i + 1 < s.length()) {
                next = getInt(s.charAt(i + 1));
            } else {
                next = 0;
            }

            if(current < next) {
                answer += next - current;
                i++;
            } else {
                answer += current;
            }
        }

        return answer;
    }

    private int getInt(char c) {
        return switch (c) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }
}
