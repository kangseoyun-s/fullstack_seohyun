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
- 변수, 자료형, 조건문, 반복문, 배열 등 기본 문법 이해
- 클래스, 객체, 상속, 인터페이스 등 객체지향 개념 정리
- 예외 처리 (try-catch), 컬렉션 프레임워크 (List, Map, Set) 활용
---
<!--cs와 연결-->
## ✨ 기술 스택 기반 CS 역량

| 학습 항목 | 관련 CS 개념 | 설명 | 실무 활용 예 |
|-----------|---------------|------|----------------|
| 변수, 자료형, 조건문, 반복문, 배열 | **프로그래밍 언어의 기초**, **제어 흐름**, **데이터 표현** | 프로그램의 기본 구성 요소로, 데이터 저장과 흐름 제어를 담당 | 로직 구현, 데이터 처리, 사용자 입력 대응 |
| 클래스, 객체, 상속, 인터페이스 | **객체지향 프로그래밍(OOP)**, **추상화**, **다형성**, **캡슐화** | 코드 재사용성과 유지보수성을 높이는 구조적 설계 방식 | 서비스 구조 설계, 도메인 모델링, 확장 가능한 시스템 구축 |
| 예외 처리 (try-catch), 컬렉션 프레임워크 (List, Map, Set) | **에러 핸들링**, **자료구조**, **런타임 안정성** | 프로그램의 안정성과 효율적인 데이터 관리에 필수 | 사용자 입력 검증, 데이터 저장 및 조회, 시스템 오류 대응 |

---

<br/>

<!--JAVA, HTML+CSS+JS/JQUERY...-->
<!--## ✨ 포트폴리오



<br/>
-->

---

### 💥 자주 발생하는 Java 오류

| 오류 메시지 | 원인 | 해결 방법 |
|------------|------|-----------|
| `cannot find symbol` | 변수나 메서드 이름 오타, 선언 누락 | 선언 여부 확인, 대소문자 주의 |
| `';' expected` | 세미콜론 누락 | 문장 끝에 `;` 추가 |
| `NoSuchMethodError: main` | `main()` 메서드 선언 오류 | `public static void main(String[] args)` 정확히 작성 |
| `NoClassDefFoundError` | 클래스 파일 누락 또는 클래스패스 오류 | `.class` 파일 존재 여부 및 경로 확인 |
| `illegal start of expression` | 문법 오류 (예: 잘못된 키워드 사용) | 문장 구조 점검, 괄호 확인 |
| `class, interface, or enum expected` | 괄호 불일치 또는 클래스 외부 코드 존재 | 괄호 개수 확인, 클래스 내부에 코드 작성 |



---

### 🔍 오류별 해결 방안과 예시

#### 1. `cannot find symbol`
- **원인**: 변수나 메서드 이름 오타, 선언 누락
- **예시**:
  ```java
  System.out.println(nmae); // 오타: name → nmae
  ```
- **해결**: 변수 선언 확인, 철자 수정
  ```java
  String name = "Java";
  System.out.println(name);
  ```

---

#### 2. `';' expected`
- **원인**: 세미콜론 누락
- **예시**:
  ```java
  int a = 10  // 세미콜론 없음
  ```
- **해결**: 문장 끝에 `;` 추가
  ```java
  int a = 10;
  ```

---

#### 3. `NoSuchMethodError: main`
- **원인**: `main()` 메서드 선언 오류
- **예시**:
  ```java
  static void main(String[] args) { } // public 누락
  ```
- **해결**: 정확한 시그니처 사용
  ```java
  public static void main(String[] args) { }
  ```

---

#### 4. `NoClassDefFoundError`
- **원인**: 클래스 파일 누락 또는 클래스패스 오류
- **해결**:
  - `.class` 파일이 존재하는지 확인
  - 컴파일: `javac MyClass.java`
  - 실행: `java MyClass`
  - 클래스 경로 설정: `-cp` 옵션 사용

---

#### 5. `illegal start of expression`
- **원인**: 문법 오류 (예: 잘못된 키워드 사용)
- **예시**:
  ```java
  public class Test {
      public void method() {
          int if = 5; // 예약어 사용
      }
  }
  ```
- **해결**: 예약어 사용 금지, 문법 구조 점검
  ```java
  int value = 5;
  ```

---

#### 6. `class, interface, or enum expected`
- **원인**: 클래스 외부에 코드 존재, 괄호 불일치
- **예시**:
  ```java
  int a = 10; // 클래스 밖에 존재
  public class Test { }
  ```
- **해결**: 모든 실행 코드는 클래스 내부에 위치
  ```java
  public class Test {
      public static void main(String[] args) {
          int a = 10;
      }
  }
  ```

---

### 🧠 팁: 오류를 줄이는 습관

- IDE의 자동완성 기능 적극 활용
- 컴파일러 경고 무시하지 않기
- 테스트 코드 작성으로 예외 상황 미리 점검
- 로그와 디버깅 툴로 흐름 추적

---
## ✨ 참고 문헌
- [Java 설치](https://www.oracle.com/java/technologies/?er=221886)  
- [eclipse 설치](https://www.eclipse.org/)  
- [VS Code 공식 사이트](https://code.visualstudio.com/)  
