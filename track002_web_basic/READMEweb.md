# 🎯 강서현 | 실전 프로젝트로 증명된 풀스택 개발자의 기술력 <!-- 회사 인재상을 적는 것이 좋음 -->

> “기획부터 배포까지, 사용자 흐름을 설계하고 끝까지 해결합니다.”  
그게 제가 일하는 방식입니다.

**CS 기반의 문제 해결력**,  
**실전 프로젝트에서 다져진 협업 능력**,  
그리고 **완성 중심의 개발 철학**으로  
현장에서 통하는 개발자가 되었습니다.

<br/>
<br/>
<br/>

---
<!-- 이미지, 이름, 이메일, 깃허브주소, 포트폴리오 2*4 테이블 형식-->
## 📱 Contact & Links
<img src="./track001_github/3792014_cat_halloween_kitty_icon.png"
    alt="프로필" width="250" />
|NAME|EMAIL|GITHUB|PORTFOLIO|
|-|-|-|-|
|강서현|ksgkey567@gmail.com|[🔗 링크](https://github.com/kangseoyun-s/fullstack_seohyun)||


<br/>
<br/>

---
<!--track001 github-->
## ✨ Golds
- HTML/CSS/JavaScript 완벽 이해
- React, Vue, 또는 Svelte 이해
- Node.js, Express, MongoDB 기초 익히기
- 협업과 버전 관리

---

### 🧭 웹 개발 기초 기술과 관련 역량 정리

| 기술 항목 | 기를 수 있는 역량 | 실무 적용 예시 |
|-----------|------------------|----------------|
| **HTML/CSS/JavaScript 완벽 이해** | UI/UX 설계 능력, DOM 조작, 반응형 웹 구현 | 사용자 친화적인 웹 페이지 제작, 접근성 고려한 마크업 |
| **React, Vue, 또는 Svelte 이해** | 컴포넌트 기반 설계, 상태 관리, SPA 구현 능력 | 대규모 프론트엔드 구조 설계, 사용자 인터랙션 처리 |
| **Node.js, Express, MongoDB 기초 익히기** | 서버 개발, REST API 설계, 데이터 처리 | 로그인/회원가입 기능, 게시판 CRUD 구현 |
| **협업과 버전 관리 (Git & GitHub)** | 코드 이력 관리, 브랜치 전략, 협업 커뮤니케이션 | 팀 프로젝트에서 충돌 해결, Pull Request 리뷰 |

---


<!--JAVA, HTML+CSS+JS/JQUERY...-->
<!--## ✨ 포트폴리오



<br/>
-->
---
<!--1,2일차 내용 작성-->
## ✨ 트러블 슈팅 (1)

1. 문제점

   `git commit -m "git 수정 후 다시 올리기"` 명령을 입력했지만  
   `Changes not staged for commit` 메시지가 뜨며 커밋이 되지 않음  

2. 해결 방안

   - 수정된 파일을 스테이징 영역에 올리기  
     ```bash
     git add day001.md
     ```
   - 커밋 명령 재실행  
     ```bash
     git commit -m "day001.md 내용 수정 후 커밋"
     ```

3. 느낀 점

   단 한 줄의 차이도 스테이징 과정을 거치지 않으면 기록되지 않는다는 점이 새삼 체감되었습니다.  
   앞으로는 파일을 건드린 뒤엔 반드시 `git status`로 상태를 체크하는 습관을 들여야 할 것 같습니다.  

---

## ✨ 트러블슈팅 (2)

1. 문제점

   `git pull origin master` 수행 중 자동 병합(auto-merging) 시  
   `CONFLICT (content): Merge conflict in day002.md` 라는 충돌이 발생함  

2. 해결 방안

   1. 충돌 발생 파일 열기  
      ```bash
      vim day002.md
      ```
   2. `<<<<<<`, `======`, `>>>>>>` 구분자를 보고 원하는 내용으로 수정  
   3. 수정 후 파일 저장 및 종료  
   4. 병합 완료 표시  
      ```bash
      git add day002.md
      git commit -m "day002.md 머지 충돌 해결"
      ```

3. 느낀 점

   협업 중 다른 사람과 동시에 같은 라인을 건드리면 반드시 충돌이 나고  
   그 순간이야말로 커밋 전후 차이를 확인해야 한다는 것을 알게 되었습니다. 

---

## ✨ 트러블슈팅 (3)

1. 문제점

   충돌 해결 없이 `git pull`을 또 수행하거나  
   `MERGE_HEAD exists` 상태에서 다른 명령어를 시도해 오류 발생  
   ```
   error: You have not concluded your merge (MERGE_HEAD exists).
   hint: Please, commit your changes before merging.
   fatal: Exiting because of unfinished merge.
   ```

2. 해결 방안

   - 현재 병합 중단 후 초기 상태로 되돌리기  
     ```bash
     git merge --abort
     ```
   - 또는 남아 있는 충돌 수정 후 커밋으로 병합 완료  
     ```bash
     충돌 파일 수정 → git add <file> → git commit
     ```

3. 느낀 점

   미완료된 머지가 있으면 이후 모든 작업이 잠식된다는 걸 느꼈습니다.  
   중간에 막혔을 땐 당황하지 말고 `git status`와 `git merge --abort`로 상황을 정리하는 게 핵심입니다.

---
## ✨ 참고 문헌
- [Java 설치](https://www.oracle.com/java/technologies/?er=221886)  
- [eclipse 설치](https://www.eclipse.org/)  
- [VS Code 공식 사이트](https://code.visualstudio.com/)  
