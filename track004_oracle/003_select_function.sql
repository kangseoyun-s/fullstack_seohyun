-------------------------------------------------------------------------------------
-- 003_select_function.sql
-- 1. 문자열
-- 2. 숫자
-- 3. 날짜
-- 4. 변환
-- 5. 조건
-------------------------------------------------------------------------------------
-- 003_select_function.sql
-- 1. 문자열
-- 1-1. upper  대문자, lower 소문자, initcap 대소문자 변환
-- 1-2. length 문자열길이
-- 1-3. substr 부분문자열 ,   instr  위치문자열
-- 1-4. replace 바꾸기 ,  lpad, rpad 채우기
-- 1-5. trim , ltrim, rtrim  공백빼기
-- 1-6. concat 문자열연결

-- #1. 대소문자
select   ename, upper(ename), lower(ename), initcap(ename)   
from     emp;

-- #2. 문자열길이
select ename, length(ename), lengthb(ename) , '킹' , length('킹') , lengthb('킹')
from emp;

-- #3. substr(문자열, 어디서부터 ,몇개 ) 부분문자열 , instr  위치문자열
select ename, substr(ename, 1,2) ,  substr(ename, 1,3) , substr(ename, 2,2) , substr (ename, 3,2)  from emp;
select     substr('oracle' , -1) , substr('oracle' , -3)                , substr('oracle' , -3,2) from dual;
--           e 뒤에서1번부터끝까지      cle 뒤에서부터 세번째부터 끝까지         cl 뒤에 세번째부터  2개
--   -붙이면 끝에서 부터 계산
select     substr('oracle' , -2) ,  substr('oracle' , -2,1)  from dual;  -- le  l

select    instr('oracle' , 'a') from dual;  -- o(1) r(2) a(3) c(4) l(5) e(6)
select   ename, instr(ename, 'A') from emp; -- 있으면 위치, 없으면 0

-- #4. replace(어떤문자열을, 찾아서, 바꾸기) 바꾸기 ,  lpad, rpad 채우기
select  replace( '010-1234-5678' ,'-',' ') from dual;
select  lpad('oracle' , 10 , '#') , rpad('oracle' , 10 , '#') from dual;  -- ㅣ (left채우기)   r( right채우기)

-- #5. trim , ltrim, rtrim  공백빼기
select  trim(' *oracle* ') , ltrim(' *oracle* ') , rtrim(' *oracle* ')  
from dual;

-- #6. concat 문자열연결- 두개의 문자열만 연결가능
select   concat('Hello ' , 'Oracle') from     dual;
select   concat(  concat('Hello ' , 'Oracle')  , '★') from     dual;  -- concat 중첩해서 사용

select  'Hello '  || 'Oracle ' || '♥'  from dual;

-------------------------------------------------------------------------------------
-- ##1. 문자열 연습문제   (1~18)
-- https://sally03915.github.io/stackventure_250825/004_oracle/oracle004_select_fn#14

-- Q001
-- EMP 테이블에서 ENAME을 대문자, 소문자, 첫글자만 대문자로 조회하시오.
select ename, upper(ename), lower(ename), initcap(ename) from emp;

--Q002
--EMP 테이블에서 UPPER를 이용하여 ENAME이 KING인 데이터를 조회하시오.
select ename from emp where upper(ename) = upper('king');
--Q002-1. 소문자 버전
select ename from emp where lower(ename) = lower('king');

--Q003 
-- EMP 테이블에서 UPPER를 이용하여 ENAME에 KING인 포함된 데이터를 조회하시오.
-- 대소문자 상관없이 KING인 사람을 조회하는 것이 가능해짐.
select ename from emp where ename = 'king'; -- = 같다
select ename from emp where upper(ename) like upper('%king%'); -- 정답
select ename from emp where upper(ename) like upper('%a%'); -- 포함되는

--Q004 
-- EMP 테이블에서 LENGTH를 이용하여 ENAME의 문자열 길이를 조회하시오.
select ename, length(ename) from emp;

--Q005 
-- EMP 테이블에서 ENAME의 문자열 길이가 5이상인 데이터를 조회하시오.
select ename, length(ename) from emp where length(ename)>=5;

--Q006 
--LENGTH('한글'), LENGTHB('한글')
--문자열길이반환, 문자열 바이트 수 반환
select lenght('한글'), lengthb('한글') from dual;
--------------------------------
--Q007 
-- 문자열 일부분을 추출
-- SUBSTR( 문자열 , 시작위치, 추출길이)
select job, substr(job, 1,2) ,  substr(job, 3,2) , substr(job,5) from emp;
--Q008 
select job, substr(job, -length(job)), substr(job, -length(job),2), substr(job,-3) from emp;
--Q009 
select instr('HELLO, ORACLE!', 'L',1,1), instr('HELLO, ORACLE!', 'L',1,3), instr('HELLO, ORACLE!', 'L',1,2) from dual;
-- H(1)E(2)L(3)L(4)O(5),(6) (7)O(8)R(9)A(10)C(11)L(12)E(13)!(14)
-- select 'HELLO, ORACLE!', 
-- instr('HELLO, ORACLE!', 'L') as instr_1,
-- instr('HELLO, ORACLE!', 'L',5) as instr_2, 
-- instr('HELLO, ORACLE!', 'L',2,2) as instr_3 from dual;
--Q010
select * from emp where instr(ename, 'S')>0; -- instr 못 찾으면 0
--Q011
select * from emp where ename like '%S%';
--Q012
select '010=1234-5678' as before 
, replace( '010-1234-5678' ,'-',' ') replace1
, replace( '010-1234-5678' ,'-') replace2
from dual;
--Q013 
select 'oracle', 
lpad('oracle' , 10 , '#'),
rpad('oracle' , 10 , '*'),
lpad('oracle' , 10 , ' '),
rpad('oracle' , 10 , ' ') from dual;

--Q014 
select
rpad('911225-' , 14 , '*') rpad_jmno
, rpad('010-1234-' , 13 , '*') rpad_phone
from dual;
--Q015
select 
concat(empno,ename),
concat(empno , concat(':' ,ename)) from emp where ename = upper('scott');
--Q016 
select '['|| trim(' * *oracle* * ') || ']' trim, -- 양쪽 공백 제거
'['|| ltrim(' * *oracle* * ') || ']' trim_leaging, -- 왼쪽 공백 제거
'['|| rtrim(' * *oracle* * ') || ']' trim_traling, -- 오른쪽 공백 제거
'['|| trim(' * *oracle* * ') || ']' trim_both -- 양쪽 공백 제거
from dual;

select '['|| trim(' * *oracle* * ') || ']' trim, -- 양쪽 공백 제거
'['|| trim(leading from ' * *oracle* * ') || ']' trim_leaging, -- 앞쪽 공백 제거
'['|| trim(trailing from ' * *oracle* * ') || ']' trim_traling, -- 뒤쪽 공백 제거
'['|| trim(both from ' * *oracle* * ') || ']' trim_both -- 양쪽 공백 제거
from dual;
--Q017 
select '['|| trim(' * *oracle* * ') || ']' trim, -- 양쪽 공백 제거
'['|| trim(leading '*' from '* *oracle* *') || ']' trim_leaging, -- 앞쪽 공백 제거
'['|| trim(trailing '*' from '* *oracle* *') || ']' trim_traling, -- 뒤쪽 공백 제거
'['|| trim(both '*' from '* *oracle* *') || ']' trim_both -- 양쪽 공백 제거
from dual;

--Q018
select '['|| trim(' * *oracle* * ') || ']' trim, -- 양쪽 공백 제거
'['|| ltrim(' * *oracle* * ') || ']' ltrim, -- 왼쪽 공백 제거
'['|| ltrim('*-oracle-*', '*') || ']' ltrim_2, -- 왼쪽 공백 제거 (''안에 있는 해당 문자열 삭제)
'['|| rtrim(' * *oracle* * ') || ']' rtrim, -- 오른쪽 공백 제거
'['|| rtrim('*-oracle-*', '*') || ']' rtrim_2, -- 오른쪽 공백 제거 (''안에 있는 해당 문자열 삭제)
'['|| trim(' * *oracle* * ') || ']' trim_both -- 양쪽 공백 제거
from dual;

-------------------------------------------------------------------------------------
-- 003_select_function.sql
-- 1. 문자열
-- 2. 숫자   :   round / trunc(반올림/버림) , ceil( 올림 ) , floor ( 내림) , mod  (나머지)
-- 3. 날짜   :   sysdate (시스템날짜), add_months(몇달뒤에) , next_day, last_day
-- 4. 변환   :   to_char (날짜형식변환), to_date
-- 5. 조건   :   nvl, nvl2 ( null) , decode, case ( 조건분기 ) 
-------------------------------------------------------------------------------------
-- 2. 숫자   :   round / trunc(반올림/버림) , ceil( 올림 ) , floor ( 내림) , mod  (나머지)
select   round(  1234.5678   )   , round(  1234.5678  , 2  ) , trunc(  1234.5678  , 2  ) , ceil(1.1) , floor(4.8)  , mod(10,3)
from dual;     -- 1235              1234.57                       1234.56                      2          4            1

-------------------------------------------------------------------------------------
-- 3. 날짜   :   sysdate (시스템날짜,시간반환), add_months(몇달뒤에) , next_day, last_day
select   SYSDATE  , add_months(  SYSDATE, 1) ,    months_between(  '25-12-1'  , '24-12-1' )
from     dual;

select  NEXT_DAY(SYSDATE,  '월요일')  "다음주 월요일" ,   LAST_DAY(SYSDATE)  "해당월의 마지막 날짜"
from dual;

select  NEXT_DAY(SYSDATE,  1)  "다음주 월요일" ,   LAST_DAY(SYSDATE)  "해당월의 마지막 날짜"
from dual;

-------------------------------------------------------------------------------------
-- 4. 변환   :   to_char (날짜형식변환), to_date
--                날짜를     문자로                         문자를         날짜로
select   TO_CHAR( SYSDATE , 'YYYY-MM-DD' ) ,  TO_DATE(  '2025-10-16' , 'YYYY-MM-DD'  )
from     dual;

--        숫자1234를 문자열로 변환한 다음 +1   ( 자동변환해서 오류가 안날수 있음. )
select    TO_CHAR(1234)               + 1       ,   TO_NUMBER('5678') + 1 
from     dual;

select    TO_CHAR('일이삼사')               + 1   ,   TO_NUMBER('5678') + 1   -- 오류
from     dual;

select           "1234"   + 1  , 1+"1234"       --  자료형이 안맞으면 오류남.
from     dual;

-------------------------------------------------------------------------------------
-- 5. 조건   :   nvl, nvl2 ( null) , decode, case ( 조건분기 ) 

select   nvl(  NULL , '대체값' )             from      dual; -- null 이면 대체값    / null  value  logic( replacement )
select   nvl(          comm  , '입력안됨.')   from     emp;   -- X 오류
select   nvl(  to_char(comm) , '입력안됨.')   from     emp;   -- O 자료형을 맞춰야함.

select  nvl2( NULL, 'A' , 'B'  )     from dual;    -- null 일때 b, 아니면 a
-----
select  nvl2( mgr,          mgr , '--'  )     from emp;   -- 오류나는이유는? 
select  nvl2( mgr, to_char(mgr) , '상위관리자 x'  )     from emp;   -- 해결방안    ( nvl, nvl2  null일때 값 반환 / 자료형맞추기)
-----
select decode( deptno, 10 , '부서10' , 20, '부서20' , 30, '부서30' )
from   emp;
-----
select case  
            when deptno=10 then  '부서10'  
            when deptno=20 then  '부서20'   
            when deptno=30 then  '부서30'  
            else                 '부서x'
       end
from   emp;
-----
select case deptno 
            when 10 then  '부서10'  
            when 20 then  '부서20'   
            when 30 then  '부서30'  
            else          '부서x'
       end
from   emp;
-------------------------------------------------------------------------------------
-- ##1. 문자열 연습문제   (45~49)   ~17:00
-- https://sally03915.github.io/stackventure_250825/004_oracle/oracle004_select_fn#61

-- Q045  EMP테이블에서 NVL 함수를 사용하여 다음과 같이 출력하시오   ( nvl 이용 comm 이 null 이면 0 )  - nvl( NULL, '반환값')
select empno, ename, sal, comm,  sal + comm  , nvl( comm , 0) , sal + nvl(comm, 0)
from   emp;

-- Q046  EMP테이블에서 NVL2 함수를 사용하여 다음과 같이 출력하시오. (nvl2 이용  comm이  null 이면 'X')- nvl2( NULL, 'NULL아님','반환값')
select empno, ename,  comm,   nvl2( comm , 'O' , 'X') , sal*12 + nvl2( comm , comm , 0)
from   emp;

-- Q047  EMP테이블에서 DECODE 함수를 사용하여 다음과 같이 출력하시오.  (decode)
--JOB이 MANAGER 는 급여의 10% 인상한 급여       SAL*1.1
--SALESMAN 는 급여의 5% 인상한 급여             SAL*0.5
--ANALYST 는 그대로                            SAL 
--나머지는 3% 인상된 급여         SAL*0.3
select  empno, ename, job, sal , 
        decode(  job 
            , 'MANAGER'  ,  SAL*1.1    -- when   then
            , 'SALESMAN' ,  SAL*1.05   -- when   then
            , 'ANALYST'  ,  SAL
            , SAL*1.03  -- else
        ) upsal
from    emp;
-- Q048
--EMP테이블에서 CASE 함수를 사용하여 다음과 같이 출력하시오.  (case when  then   else  end)
select  empno, ename, job, sal , 
        case 
            when  job='MANAGER'   then SAL*1.1 
            when  job='SALESMAN'  then SAL*1.05 
            when  job='ANALYST'   then SAL
            else  SAL*1.03  
        end   upsal
from    emp;

select  empno, ename, job, sal , 
        case  job
            when  'MANAGER'   then SAL*1.1 
            when  'SALESMAN'  then SAL*1.05 
            when  'ANALYST'   then SAL
            else  SAL*1.03  
        end   upsal
from    emp;

-- Q049
--기준데이터 없이 조건식으로만 CASE 사용가능    case when  then   else  end)
--COMM 값이 NULL 이면 해당사항 없음
--0 이면 수당없음
--0 초과시 초과한 수당을 출력
select  empno, ename, comm
        , case   
            when   comm is null  then   '해당사항 없음'
            when   comm = 0      then   '수당없음'           
            when   comm > 0      then   '수당 : ' || comm
          end   comm_text
from    emp;


-------------------------------------------------------------------------------------
-- ##1. 문자열 연습문제   (19~44)
-- https://sally03915.github.io/stackventure_250825/004_oracle/oracle004_select_fn#14
select
round(1234.5678) r1,
round(1234.5678, 0) r2,
round(1234.5678, 1) r3,
round(1234.5678, -1) r4, -- 숫자 제거
round(1234.5678, 2) r5,
round(1234.5678, -2) r6
from dual;

select
trunc(1234.5678) r1, -- 버리기
trunc(1234.5678, 0) r2,
trunc(1234.5678, 1) r3,
trunc(1234.5678, -1) r4, -- 숫자 제거
trunc(1234.5678, 2) r5,
trunc(1234.5678, -2) r6
from dual;

-- ceil(올림), floor(버림)
select
ceil(3.14), floor(3.96), ceil(-3.14), floor(-3.96)
from dual;

-- mod 나머지
select
mod(10,3),mod(10,2),mod(10,4)
from dual;

select sysdate 오늘, sysdate-1 어제, sysdate+1 내일
from dual;

select add_months(sysdate,3)
from dual;

select empno, ename, hiredate,
add_months(hiredate, 12*10) as WORK10YEAR
from emp;

select empno, ename, hiredate,
add_months(hiredate, 12*42) as "42년"
from emp
where add_months(hiredate, 504)>sysdate;

select empno, ename, hiredate, to_date('2024-12-21','YYYY-MM-DD'),
months_between(hiredate, to_date('2024-12-21','YYYY-MM-DD')) months1,
months_between(to_date('2024-12-21','YYYY-MM-DD'),hiredate) months2,
trunc(months_between(to_date('2024-12-21','YYYY-MM-DD'),hiredate)) months3
from emp;

select sysdate, next_day(sysdate,'월요일'), last_day(sysdate)
from dual;

select sysdate, 
round(sysdate, 'CC' ) format_cc, -- 세기 
round(sysdate, 'yyyy' ) format_yyyy, -- ★ 년도
round(sysdate, 'q' ) format_q, -- 분기
round(sysdate, 'ddd' ) format_ddd, -- 연중일수
round(sysdate, 'hh' ) format_hh -- 시간
from dual;

select sysdate, 
trunc(sysdate, 'CC' ) format_cc, -- 세기 
trunc(sysdate, 'yyyy' ) format_yyyy, -- ★ 년도
trunc(sysdate, 'q' ) format_q, -- 분기
trunc(sysdate, 'ddd' ) format_ddd, -- 연중일수
trunc(sysdate, 'hh' ) format_hh -- 시간
from dual;

select empno, ename, empno+'500'
from emp
where ename ='SCOTT';

select empno, ename, to_number(empno+'500')
from emp
where ename ='SCOTT';

-- 문자 포함 시 자동 변환 불가능
select empno, ename, empno+'500A'
from emp
where ename ='SCOTT';

select
sysdate, to_char(sysdate, 'yyyy/mm/dd hh24:mi:ss')
from dual;

SELECT SYSDATE,
       TO_CHAR(SYSDATE, 'MM') AS MM,
       TO_CHAR(SYSDATE, 'MON') AS MON,
       TO_CHAR(SYSDATE, 'MONTH') AS MONTH,
       TO_CHAR(SYSDATE, 'DD') AS DD,
       TO_CHAR(SYSDATE, 'DY') AS DY,
       TO_CHAR(SYSDATE, 'DAY') AS DAY
  FROM DUAL;

-- Q6-35
SELECT SYSDATE,
       TO_CHAR(SYSDATE, 'MM') AS MM,
       TO_CHAR(SYSDATE, 'MON', 'NLS_DATE_LANGUAGE = KOREAN' ) AS MON_KOR,
       TO_CHAR(SYSDATE, 'MON', 'NLS_DATE_LANGUAGE = JAPANESE') AS MON_JPN,
       TO_CHAR(SYSDATE, 'MON', 'NLS_DATE_LANGUAGE = ENGLISH' ) AS MON_ENG,
       TO_CHAR(SYSDATE, 'MONTH', 'NLS_DATE_LANGUAGE = KOREAN' ) AS MONTH_KOR,
       TO_CHAR(SYSDATE, 'MONTH', 'NLS_DATE_LANGUAGE = JAPANESE') AS MONTH_JPN,
       TO_CHAR(SYSDATE, 'MONTH', 'NLS_DATE_LANGUAGE = ENGLISH' ) AS MONTH_ENG
  FROM DUAL;

-- Q6-36
SELECT SYSDATE,
       TO_CHAR(SYSDATE, 'MM') AS MM,
       TO_CHAR(SYSDATE, 'DD') AS DD,
       TO_CHAR(SYSDATE, 'DY', 'NLS_DATE_LANGUAGE = KOREAN' ) AS DY_KOR,
       TO_CHAR(SYSDATE, 'DY', 'NLS_DATE_LANGUAGE = JAPANESE') AS DY_JPN,
       TO_CHAR(SYSDATE, 'DY', 'NLS_DATE_LANGUAGE = ENGLISH' ) AS DY_ENG,
       TO_CHAR(SYSDATE, 'DAY', 'NLS_DATE_LANGUAGE = KOREAN' ) AS DAY_KOR,
       TO_CHAR(SYSDATE, 'DAY', 'NLS_DATE_LANGUAGE = JAPANESE') AS DAY_JPN,
       TO_CHAR(SYSDATE, 'DAY', 'NLS_DATE_LANGUAGE = ENGLISH' ) AS DAY_ENG
  FROM DUAL;

-- Q6-37
SELECT SYSDATE,
       TO_CHAR(SYSDATE, 'HH24:MI:SS') AS HH24MISS,
       TO_CHAR(SYSDATE, 'HH12:MI:SS AM') AS HHMISS_AM,
       TO_CHAR(SYSDATE, 'HH:MI:SS P.M.') AS HHMISS_PM
  FROM DUAL;

-- Q6-38
SELECT SAL,
       TO_CHAR(SAL, '$999,999') AS SAL_$,
       TO_CHAR(SAL, 'L999,999') AS SAL_L,
       TO_CHAR(SAL, '999,999.00') AS SAL_1,
       TO_CHAR(SAL, '000,999,999.00') AS SAL_2,
       TO_CHAR(SAL, '000999999.99') AS SAL_3,
       TO_CHAR(SAL, '999,999,00') AS SAL_4
  FROM EMP;

select 1300-'1500', '1300'+1500
from dual;

select '1500' - '1300'
from dual;

select '1,500' - '1,300'
from dual; -- X

select to_number('1,500','999,999') - to_number('1,300', '999,999')
from dual;

select to_date('20251017', 'yyyy-mm-dd')
from dual;

-- Q6-43
SELECT *
  FROM EMP
 WHERE HIREDATE > TO_DATE('1981/06/01', 'YYYY/MM/DD');

-- Q6-44
SELECT TO_DATE('49/12/10', 'YY/MM/DD') AS YY_YEAR_49,
       TO_DATE('49/12/10', 'RR/MM/DD') AS RR_YEAR_49,
       TO_DATE('50/12/10', 'YY/MM/DD') AS YY_YEAR_50,
       TO_DATE('50/12/10', 'RR/MM/DD') AS RR_YEAR_50,
       TO_DATE('51/12/10', 'YY/MM/DD') AS YY_YEAR_51,
       TO_DATE('51/12/10', 'RR/MM/DD') AS RR_YEAR_51
  FROM DUAL;
  
  
  
-- EX001~004
SELECT 
    EMPNO,
    RPAD(SUBSTR(EMPNO, 1, 2), 4, '*') AS MASKING_EMPNO,
    ENAME,
    RPAD(SUBSTR(ENAME, 1, 1), 6, '*') AS MASKING_ENAME
FROM 
    EMP
WHERE 
    LENGTH(ENAME) >= 5 AND LENGTH(ENAME) < 6;
    
select empno, ename, sal,
TRUNC(sal/21.5, 2) as DAY_PAY,
ROUND((sal/21.5)/8, 1) as TIME_PAY
from emp;

select empno, ename, hiredate,
TO_CHAR(NEXT_DAY(ADD_MONTHS(HIREDATE, 3), '월요일'), 'YYYY-MM-DD') as R_JOB,
NVL(  TO_CHAR(COMM)  , 'N/A'  ) as COMM
from emp;

select empno, ename, mgr,
case when mgr is null then '0000'
     when substr(mgr,1,2) = 75 then '5555'
     when substr(mgr,1,2) = 76 then '6666'
     when substr(mgr,1,2) = 77 then '7777'
     when substr(mgr,1,2) = 78 then '8888'
     else to_char(mgr)
     end CHG_MGR
from emp;

