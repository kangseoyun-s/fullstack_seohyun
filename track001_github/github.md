▶ 1. basic
```
#1. 가방에 담기 (불꽃 마법 재료, 불씨, ,,,)
    git add .
    
#2. 가방에 메시지 남기기 (불꽃 마법 완성)
    git commit -m "메시지"

#3. [공용-github - 마법 책] 같은 마법책을 쓰니까 서로 바뀐 것 확인
    git pull origin master

#4. [공용으로 쓰는 마법책] 에 불꽃 마법 올리기(공유)
    git push origin master
```
▶ 2. git 협업
1. 팀원 초대
2. 협업 중 같은 파일을 수정하면서 생기는 충돌(conflict) 해결

```
#1. 팀장 - 팀원 초대 (github 웹)
#2. 팀원 - repository 클론
    git clone 주소
#3. 팀원 - branch
    git checkout -b dev-sh(브랜치명)
#4. 팀원 - 파일 작성
    git add .
    git commit -m "message"
    git pull origin dev-sh(브랜치명)
    git push origin dev-sh(브랜치명)
※ 충돌 - HEAD, ===== , >>>>>>> / 코드 수정 → git add . 부터 다시
```
▶ 3. merge vs rebase
#1. 기능 브랜치에서 작업 중 main 브랜치가 업데이트 된 경우
> 여러 마법사가 함께 주문서를 쓰고 있을 때
- 내가 주문을 다시 쓰면 친구들의 주문이 사라질 수도 있음

⭐ 브랜치 꼭 확인!

```
#1. 불꽃 마법사가 본인 코드 작성 중
    git add spell2.md
    git commit -m "불꽃 마법 2 추가"
#2. 메인 마법서가 업데이트 됨
    불꽃 마법사가 최신 마법서 위에 자신의 주문을 다시 써야 함.
    git checkout master
    git pull origin master

    # 최신 마법서 위에 주문 다시 쓰기
    git checkout dev-sh
    git rebase master  
    # > master branch 기준으로 내 작업을 다시 정렬
    # > 주문이 겹쳐서 마법서 충돌남 어떤 주문 쓸지 선택이 필요함 / 수정 완료

    git add spell2.md
    git rebase --continue

#3. 안전하게 주문서 공유
    git push --force-with-lease
```
git revert
ㄴ 안전한 취소 - 모두가 함께 쓰는 깃허브 [공용]
git reset
ㄴ 아예 지우기 - [본인] 브랜치에서만

실습 (1) revert

1. 본인 브랜치에서 파일 작성 - 테스트 브랜치에서 새 작업하고 원격 저장소 푸시
``` bash
git branch
git checkout dev-sh
파일 작성 revert.md
git add .
git commit -m "revert"
git push origin dev-sh
```
2. main 브랜치에서 병합 - 테스트 브랜치 작업 master 병힙하고 푸시
``` bash
git checkout master
git pull origin master
git merge dev-sh
git push origin master
```
3. main 브랜치에서 되돌리기
``` bash
git checkout master
git log
git revert <<>>
git push origin master
```