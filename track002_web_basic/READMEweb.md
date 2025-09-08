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



<!--JAVA, HTML+CSS+JS/JQUERY...-->
<!--## ✨ 포트폴리오



<br/>
-->
---


물론이죠! 웹 개발 초보부터 실무자까지 자주 겪는 **HTML/CSS 트러블슈팅 사례**를 정리해봤어요. 각 문제에 대해 원인과 해결 방법을 함께 소개할게요:

---

## 🧩 HTML/CSS 트러블슈팅 사례 모음

### 1. **CSS가 적용되지 않음**
- **원인**:
  - CSS 파일 경로 오류
  - `<link>` 태그 누락 또는 오타
  - 브라우저 캐시로 인해 변경 사항 미반영
- **해결**:
  - 경로 확인: `href="css/style.css"`처럼 정확한 상대/절대 경로 사용
  - `<head>` 안에 `<link rel="stylesheet" href="...">` 태그 확인
  - `Ctrl + Shift + R`로 강력 새로고침

---

### 2. **레이아웃이 깨짐**
- **원인**:
  - Flex/Grid 사용 오류
  - `margin`/`padding` 충돌
  - 요소 크기 계산 방식(`box-sizing`) 미설정
- **해결**:
  - `box-sizing: border-box;` 설정으로 예측 가능한 크기 계산
  - 개발자 도구(F12)로 요소 간 간격과 크기 확인
  - Flex/Grid 속성 재점검 (`flex-wrap`, `justify-content`, `align-items` 등)

---

### 3. **브라우저마다 다르게 보임**
- **원인**:
  - 브라우저 호환성 문제
  - 기본 스타일 차이
- **해결**:
  - `Normalize.css` 또는 `Reset.css` 적용
  - 크로스 브라우징 테스트 (Chrome, Firefox, Safari 등)
  - `-webkit-`, `-moz-` 같은 벤더 프리픽스 사용

---

### 4. **이미지가 보이지 않음**
- **원인**:
  - 경로 오류 또는 파일 확장자 오타
  - 이미지 파일이 서버에 존재하지 않음
- **해결**:
  - `src="images/photo.jpg"` 경로 확인
  - 개발자 도구에서 네트워크 탭으로 이미지 요청 확인

---

### 💡 트러블슈팅 팁
- **개발자 도구(F12)**: 레이아웃, 스타일, 이벤트 확인에 필수
- **CSS 구조화**: BEM, SCSS 등으로 명확한 구조 유지
- **문서화 습관**: 문제 해결 과정을 기록하면 다음에 빠르게 대응 가능

---

| 문제 상황 | 원인 | 해결 방안 |
|-----------|------|-----------|
| **HTML/CSS가 브라우저에서 다르게 보임** | 브라우저 호환성 문제, CSS Reset 미적용 | Normalize.css 또는 Reset.css 적용, 크로스 브라우징 테스트 |
| **버튼 클릭이 작동하지 않음** | JS 이벤트 연결 오류, DOM 로딩 전 실행 | `DOMContentLoaded` 이벤트 사용 또는 `defer` 속성 추가 |
| **CORS 오류 발생** | 클라이언트와 서버 도메인이 다름 | 서버에서 CORS 허용 설정 (`Access-Control-Allow-Origin`) |
| **API 호출 시 404/500 오류** | 잘못된 URL, 서버 미응답 | API 경로 확인, 서버 로그 분석, Postman으로 테스트 |
| **Git 충돌 발생** | 여러 브랜치에서 같은 파일 수정 | `git pull` 후 `merge` 또는 `rebase`, 충돌 파일 수동 수정 |
| **웹소켓 인증 실패** | JWT 토큰이 필터링되지 않음 | WebSocket 핸들러에서 직접 토큰 추출 및 인증 처리 |
| **메시지 저장 순서 오류** | DB 저장보다 프론트 조회가 먼저 실행됨 | 백엔드에서 저장 완료 후 메시지 전송하도록 로직 순서 조정 |
| **레이아웃 깨짐** | Flex/Grid 사용 오류, margin/padding 충돌 | 개발자 도구로 요소 확인, CSS 구조 재정비 |
| **배포 후 화면이 안 뜸** | 빌드 경로 오류, 정적 파일 누락 | `build` 폴더 확인, 서버 설정에서 정적 파일 경로 점검 |


---

### 💡 트러블슈팅 잘하는 습관

- **문제 정의 → 원인 추론 → 해결 → 검증 → 문서화**  
  이 5단계를 습관처럼 반복하면 실력이 빠르게 늘어요.

- **로그 남기기**  
  `console.log`, `logger.debug` 등으로 흐름을 추적하면 원인 파악이 쉬워져요.

- **Postman, DevTools, GitHub 활용**  
  도구를 잘 쓰는 것도 실력입니다. API 테스트, DOM 구조 확인, 버전 관리까지!

- **기록하는 습관**  
  트러블슈팅 내용을 정리해두면 나중에 같은 문제를 빠르게 해결할 수 있어요.


---
## ✨ 참고 문헌
- [Java 설치](https://www.oracle.com/java/technologies/?er=221886)  
- [eclipse 설치](https://www.eclipse.org/)  
- [VS Code 공식 사이트](https://code.visualstudio.com/)  
