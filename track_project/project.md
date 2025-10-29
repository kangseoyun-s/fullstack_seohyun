■ 전체 콘셉트:  MBTI 기반 성향 맞춤 플랫폼
- 단계별 기술 확인
기획의도: MBTI Universe는 성향 기반으로 콘텐츠를 추천히고, 감정을 케어하며, 커뮤니티와 일정을 연결하는 통합 라이프스타일 플랫폼입니다. 다양한 기술 스택을 활용해 모듈화된 구조로 개발되었으며 실무에서 요구되는 API 설계, 보안, UX 데이터 분석까지 모두 담았습니다.

```
[1. JSP] → [SPRING MVC 관리자 시스템]
                     ↓ 콘텐츠 등록
[3. SPRING BOOT + Thymeleaf]  ← 사용지 테스트 / 추천
[4. Node + React] ← 카뮤니티 기능
[5. SPRING BOOT + JWT ] ← 중앙 서버
       ↑
[6. futter] ← 모바일  앱                   
```

💡 주제: MBTI 테스트 + 결과 보기
1. Jsp + Oracle
> 기초 CRUD
- 기능: MBTI 질문 / 보기 등록

아이디어
- MBTI 질문 / 보기 등록
- 콘텐츠 미리보기
- 추천 콘텐츠
- 유형별 콘텐츠 통계
- 사용자 응답 보장

💡 주제: 추천 콘텐츠 등록 및 관리 담당
2. SPRING MVC + Mybatis + Jstl
> 관리자용

💡 주제: MBTI 성향 기반 콘텐츠 추천 웹앱
3. SPRING boot + Jpa + Thymeleaf (spring)
-콘텐츠, 질문 보기, 일정 미리보기

💡 주제: MBTI 커뮤니티 + 취향 공유 플랫폼
4. Node + React
> SNS

💡 주제: MBTI 기반 라이프스타일 통합 앱 + 수익형
5. SPRING boot + Jpa + Jwt + Redis + React

💡 주제: 모바일 UX
6. Flutter
> 모바일