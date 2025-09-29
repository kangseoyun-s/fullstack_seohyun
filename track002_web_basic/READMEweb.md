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
- GitHub 핵심 기능 실습 및 이해 역량 강화
- Markdown 기반 문서화 능력 향상
- 협업 중심 GitHub 워크플로우 숙련
- AI 도구 활용 개발 환경 체험 경험

---
<!--cs와 연결-->
## ✨ 기술 스택 기반 CS 역량

| 기술 항목         | 관련 CS 개념                          | 실무 역량 관점 설명 |
|------------------|--------------------------------------|---------------------|
| **Git & GitHub** | `버전 관리 시스템`, `분산 시스템`, `병행성` | 코드 변경 이력 관리, 협업 시 **충돌 해결** 및 **브랜치 전략** 이해 |
| **Markdown**     | `텍스트 파싱`, `문서 구조화`             | **기술 문서 작성**, README 구성, 자동화된 문서화 시스템과 연계 |
| **VS Code**      | `IDE`, `디버깅`, `확장성`, `생산성 도구`  | 효율적인 개발 환경 구성, **플러그인 활용**한 생산성 향상 |
| **HTML5**        | `DOM 구조`, `시맨틱 태그`, `웹 표준`      | 웹 페이지 구조 설계, **접근성** 및 **SEO** 고려한 마크업 작성 |
| **CSS3**         | `렌더링 엔진`, `박스 모델`, `상태 기반 스타일링` | **반응형 디자인** 구현, UI/UX 개선, 스타일 최적화 |
| **AI 프롬프트**  | `자연어 처리(NLP)`, `모델 추론`, `휴리스틱` | Copilot, ChatGPT 등 활용한 **코드 자동화**, **문제 해결 가속화** |

<br/>

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
- [Git 공식 문서](https://git-scm.com/doc)  
- [Markdown 가이드](https://www.markdownguide.org/basic-syntax/)  
- [VS Code 공식 사이트](https://code.visualstudio.com/)  
- [AI 프롬프트 작성 팁](https://learn.microsoft.com/en-us/azure/ai-foundry/openai/concepts/prompt-engineering?tabs=chat)