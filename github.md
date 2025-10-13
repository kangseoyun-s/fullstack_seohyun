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