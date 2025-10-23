select * from emp;

-- 2. 집계 함수 sum, max, min, avg
select sum(sal) from emp;

-- 3. 부서별 급여의 평균 group by > deptno, job
select deptno, job, avg(sal) from emp group by deptno, job;

-- 4. where vs having - [굽여의 평균]에서 2000 이상
select deptno, job, avg(sal)
from emp               -- 1
where sal >=1500       -- 2 전체 데이터에서 필터
group by deptno, job;  -- 3 [부서의 직업별], 급여의 평균
having avg(sal)> 2000; -- 4 3번에서 나온 급여의 평균으로 having

-- 5. rollup, cube, grouping sets / pivot, unpivot

-- rollup: 10 부서의 급여의 평균, 20 부서의 급여의 평균, 30 부서의 급여의 평균 = 전체 총계
select deptno, job, count(*), round(avg(sal),1)
from emp
group by rollup(deptno, job);

-- cube: deptno + job 전체 총계, job 총계, deptno 총계, deptno + job 세부 내용
select deptno, job, count(*), round(avg(sal),1)
from emp
group by cube(deptno, job);

-- grouping: 해당 그룹화되었나? 0 그룹화 포함 / 1 그룹화 미포함
select deptno, job, grouping(deptno), grouping(job)
from emp
group by cube(deptno, job);

-- pivot
select *
from ( select 컬럼 1, 컬럼 2, 집계 대상 컬럼 from 테이블 명 )  -- 원본 데이터: pivot 적용 대상 
pivot ( 집계 함수(집계 대상) for 컬럼 기준 in (값 1, 값 2, 값 3)) -- 집계 함수: 어떤 컬럼 기준으로 할 것인지

select *
from ( select deptno, job, sal from emp ) 
pivot ( max(sal) for deptno in (10, 20, 30)); -- job 별 부서 10,20,30의 최대 급여

select *
from ( select deptno, job, empno from emp ) 
pivot ( count(empno) for deptno in (10, 20, 30)); -- job 별 부서 10,20,30의 사원 수

select *
from ( select deptno, job, sal from emp ) 
pivot ( avg(sal) for job in ('CLERK','SALESMAN','PRESIDENT','MANAGER', 'ANALYST')); -- 부서별 직무 평균 급여

-- unpivot 열 데이터 행으로
select *
from (select deptno, 
max(decode(job,'CLERK',sal)) CLERK, 
max(decode(job,'MANAGER',sal)) MANAGER 
from emp 
group by deptno)     -- 원본 데이터: unpivot 적용 대상(열 형태로 집계된 데이터)
unpivot (sal for job in (CLERK,MANAGER)); -- unpivot: 열을 행으로 변환, 기준 컬럼 열 이름이었던 것을 행 값으로 전환
-- deptno, CLERK(열), MANAGER(열)
-- deptno, job, sal, CLERK, MANAGER

-- 25
select deptno, job, count(*), max(sal), sum(sal),avg(sal)
from emp
group by rollup(deptno, job);

-- 26
select deptno, job, count(*), max(sal), sum(sal),avg(sal)
from emp
group by cube(deptno, job);

--27
select deptno, job, count(*)
from emp
group by deptno, rollup(job) ;

--28
select deptno, job, count(*)
from emp
group by job, rollup(deptno) ;

-- 29
select deptno, job, count(*)
from emp
group by grouping sets(deptno, job) ;

-- 30
select deptno, job, count(*), max(sal), sum(sal), avg(sal), grouping(deptno), grouping(job)
from emp
group by rollup (deptno, job);

-- 31
select 
decode(grouping(deptno),1, 'all_dept', deptno) as deptno, 
decode(grouping(job), 1, 'all_job', job) as job, count(*), 
max(sal), sum(sal), avg(sal) 
from emp
group by rollup (deptno, job)
order by deptno, job;

-- 32
select deptno, job, count(*), 
max(sal), sum(sal), grouping(deptno), grouping(job), grouping_id(deptno,job)
from emp
group by rollup (deptno, job);

--1) deptno(O), job(0)            grouping_id(0)
--2) deptno(O), job(1:null)       grouping_id(0) deptno 실제 값, job null 
-- 이진법 사용

-- 33
select deptno, ename
from emp
group by deptno, ename;

-- 34
select deptno, listagg(ename, ', ') within group (order by sal desc) enames
from emp
group by deptno;

-- 36
select *
from (select deptno, job, sal from emp)
pivot (max(sal) for deptno in(10,20,30));

-- 37
select *
from (select deptno, job, sal from emp)
pivot (max(sal) for job in('CLERK','SALESMAN','PRESIDENT','MANAGER', 'ANALYST'));

-- 38
select deptno,
max(decode(job,'CLERK', sal)) CLERK,
max(decode(job,'SALESMAN', sal)) SALESMAN,
max(decode(job,'PRESIDENT', sal)) PRESIDENT,
max(decode(job,'MANAGER', sal)) MANAGER,
max(decode(job,'ANALYST', sal)) ANALYST
from emp
group by deptno;


--39
select *
from (select deptno,
max(decode(job,'CLERK', sal)) CLERK,
max(decode(job,'SALESMAN', sal)) SALESMAN,
max(decode(job,'PRESIDENT', sal)) PRESIDENT,
max(decode(job,'MANAGER', sal)) MANAGER,
max(decode(job,'ANALYST', sal)) ANALYST
from emp
group by deptno)
unpivot (sal for job in(CLERK,SALESMAN,PRESIDENT,MANAGER, ANALYST))
order by deptno, sal;


--ex001
select deptno, trunc(avg(sal)) as avg_sal,
max(sal) max_sal,
min(sal) min_sal,
count(*) cnt
from emp
group by deptno;

-- ex002
select job, count(*)
from emp
group by job
having count(*)>=3;

-- ex003
select 
to_char(hiredate, 'yyyy') as hire_year,
deptno,
count(*) cnt
from emp
group by deptno, to_char(hiredate, 'yyyy');

-- ex004
select 
decode(comm, null, 'X', 'O') as exist_comm,
count(*) as cnt
from emp
group by decode(comm, null, 'X', 'O');

-- ex005
select deptno,
to_char(hiredate, 'yyyy') as hire_year,
count(to_char(hiredate, 'yyyy')) as cnt,
max(sal) as max_sal,
sum(sal) as sum_sal,
avg(sal) as avg_sal
from emp
group by rollup (deptno, to_char(hiredate, 'yyyy'));