# 브루트포스

<p>
블랙잭 12단계 2789번 문제
</p>

### 요구사항

n장의 카드중  m을 넘지 않으면서 최대한 m에 가까운 카드 3장의 합을 구해 출력하시오.


### 입력

첫째 줄에 카드의 개수 N(3<=N<=100) 과 M(10<=M<=300,000)이 주어진다 , 둘째 줄에는 카드에 쓰여 있는 수가 주어지며, 이 값은 100,000을 넘지 않는 양의 정수이다.</br> 합이 m을 넘지 않는 카드 3장을 찾을 수 있는 경우만 입력으로 주어진다.

### 출력

첫째 줄에 M을 넘지 않으면서 M에 최대한 가까운 카드 3장의 합을 출력한다.


### 분석

블랙잭 m와 배열[n]를 만들고 for문으로 각카드를 sum에 더하고 sum<=m이면서  sum>=answer이면 answer에 sum을 저장한다. </br>

5 6 7 8 9 기준  </br>
for 3개를 사용해서 sum = card[i]+card[j]+card[k]로 하면 5+6.. 7 8 9 순서대로 진행한다.
5+6 = 11,  11+7=18,11+8=19, 11+9=20,20이 저장되고  j가 증가하면 5+7= 12, 12+8=20 , 12+9=21, 21이 저장되고 탈출하게 한다</br>


### 참고 
 
https://blog.naver.com/sag120/223064022675