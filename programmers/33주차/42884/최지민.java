import java.util.*;

class Solution {
    public int solution(int[][] routes) {
        int answer = 1;
        
        Arrays.sort(routes, (a, b) -> {
            return a[1] - b[1];
        });
        
        int standard = routes[0][1];
        for(int i = 0; i < routes.length; i++) {
            if(standard < routes[i][0]) {
                answer++;
                standard = routes[i][1];
            }
        }
        
        return answer;
    }
}