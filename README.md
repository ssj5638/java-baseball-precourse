# 숫자 야구 게임
## 진행 방법
* 숫자 야구 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 과제를 제출한다.

## 과제 제출 과정
* [과제 제출 방법](https://github.com/next-step/nextstep-docs/tree/master/precourse)
---
## 기능 요구사항
> 기능 목록을 만들고, 기능 단위로 commit하는 방식으로 진행
* 컴퓨터 숫자 서로 다른 수 3개 추출
* 사용자 숫자 입력
  * 예외처리
    * ~~3개~~
    * ~~1-9 까지 정수~~
    * ~~서로 다른 숫자~~
* 컴퓨터 숫자, 사용자 숫자 비교 후 결과 출력
  * 같은 위치, 같은 숫자 = 스트라이크
  * 다른 위치, 같은 숫자 = 볼
  * 모두 다른 숫자 = 낫싱
* 게임 재시작
## 프로그래밍 요구사항
### 1. 제약사항
* nextstep.utils 패키지에서 제공하는 Randoms, Console API 활용
    ````
    Random 값 추출 nextstep.utils.Randoms의 pickNumberlnRange()
    사용자 입력 값 nextstep.utils.Console의 readLine()
    ````
* baseball.ApplicationTest에 있는 Test Case 2개 성공
  (모든 기능 Test Case를 추가해보도록 한다.)
### 2. 단위 테스트