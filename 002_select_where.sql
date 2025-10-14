--  조건에 맞는 데이터 조회
--  #1. where      
--  #2. 비교연산자 : (같다) = , (다르다) != , <>  ,  ^=   
--  #3. 논리연산자 : AND / BETWEEN      AND  (범위지정) , OR / IN , NOT    
--  #4. like     : 패턴검색
--  #5. null 처리 : null 여부확인 
--  #6. 집합연산자 : union (중복제거하고 합집합) ,  union all (중복 포함하고 합집합) , minus(차집합) , intersect(교집합)


-- #1. 전체데이터 조회 ( emp 테이블에서 )
select * from emp;

-- #2. where  조건조회
select * from emp  where  empno =7839;   -- 같다 =
select * from emp  where  empno!=7839;   -- 다르다 !=
select * from emp  where  empno<>7839;   -- 다르다 <>
select * from emp  where  empno^=7839;   -- 다르다 ^=

select * from emp where ename='KING';

select * from emp  where  empno=7839 and  ename='KING';  -- and 두가지다 조건이 맞아야함.
select * from emp  where  empno=7839 and  ename='SCOTT'; -- x
select * from emp  where  empno=7839 or   ename='SCOTT'; -- or 둘중에 하나

select * from emp  where  sal*12 = 36000;
select * from emp  where  sal >= 3000;

select * from emp where  ename >='S';
select * from emp where  ename <='SOR';

select * from emp  where deptno>=20  and  deptno<=30;   -- >= , <=
select * from emp  where deptno  between  20  and   30; -- between and는 이상과 이하

select * from emp  where deptno=10  or  deptno=30; 
select * from emp  where deptno  in(10,30);

select * from emp  where ename =     'KING';  -- 이름이 알때
select * from emp  where ename LIKE  'A%';    -- 이름이 A로 시작할때
select * from emp  where ename LIKE  '%A%';   -- 이름이 A가 중간
select * from emp  where ename LIKE  '%G';    -- G로 끝나는
select * from emp  where ename LIKE  '_I%';   -- _(첫글자) 두번째글자가 I

select * from emp  where comm =  null;  --  X  null (데이터 없어 - 상태)
select * from emp  where comm is null; 
select * from emp  where comm is not null; 


-- 연습문제  (1~29)
-- https://sally03915.github.io/stackventure_250825/004_oracle/oracle003_select_where#11
























