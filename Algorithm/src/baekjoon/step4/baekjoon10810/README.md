# 4단계 1차원배열
<p>
백준 10810번 문제 공넣기
</p>

### 문제

도현이는 바구니를 총 N개를 가지고 있고, 각각의 바구네에는 1번부터 N번까지 번호가 매겨져있다. 또 , 1번부터 N번까지 번호가 적혀있는 공을 매우 많이 가지고 있다. </br>
가장 처음 바구니에는 공이 들어있지 않으며, 바구니에는 공을 1개만 넣을 수있다.
도현이는 앞을 M번 공을 넣을려고 한다. 도현이는 한번 공을 넣을때 바구니 범위를 정하고, 정한 바구니에 모두 같은 번호가 적혀있는 공을 넣는다.
만약 공이 이미 있는 경우에는 들어있는 공을 빼고, 새로 공을 넣는다. 공을 넣는 바구니는 연속 되어있어야한다.

공을 어떻게 넣을지가 주어졌을때 , M번 공을 넣은 이후에 각 바구니에 어떤 공이 들어 있는지 구하는 프로그램을 작성하시오

### 입력

첫째 줄에 1<=N<=100과 1<=N<=100이 주어진다
둘째 줄부터 M개의 의 걸쳐서 공을 넣는 방법이 주어진다.
각 방법은 세 정수 i j k로 이루어져 있으며, i번 바구니부터 j번 바구니까지에 k번 번호가 적혀져 있는 공을 넣는다는 뜻이다.</br>
 예를 들어, 2 5 6은 2번 바구니부터 5번 바구니까지에 6번 공을 넣는다는 뜻이다. (1 ≤ i ≤ j ≤ N, 1 ≤ k ≤ N)</br>

도현이는 입력으로 주어진 순서대로 공을 넣는다.</br>


### 출력

1번 바구니부터 N번 바구니에 들어있는 공의 번호를 공백으로 구분해 출력한다. 공이 들어있지 않은 바구니는 0을 출력한다.

### 분석
1. 배열의 크기 N이 주어진다.
2. M번 반복할 반복문을 작성한다.
3. 예를 들어 2 5 6 일경우 2번부터 5번까지 6을 넣는다.
4. 배열안에 있는 내용을 출력한다.

배열의 크기 N이 주어지고 int arr[N] M번 공을 넣는다 for(int i=0;i<M;i++){
 