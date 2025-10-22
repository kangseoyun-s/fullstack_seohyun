-- 1
select * from emp;

-- 2. 집계 함수 sum, max, min, avg

select sum(sal) from emp; -- 급여 합계

select sum(comm) from emp; -- null 값 있어도 계산 가능

-- select sal, sum(sal), max(sal), min(sal), avg(sal), count(sal) from emp;
-- error

select sum(sal) 합, max(sal) 최대, min(sal) 최소, round(avg(sal),2) 평균, count(sal) 갯수 from emp;

-- 3. group by 
--select --5
--from --1
--where --2
--group by --3 그룹핑
--having --4 그룹핑 안에서의 조건
--order by --6
-- 부서별 급여의 합
select deptno, sum(sal)
from emp
group by deptno;

-- 4. having (합계를 구했을 때 9000이상인 그룹)
select deptno, sum(sal), count(*)
from emp
group by deptno
having sum(sal)>=9000;



--1~24
-- 1
select sum(sal) from emp;
-- 2
select ename, sum(sal) from emp;
select ename, sum(sal) from emp group by ename;
-- : ename과 sum(sal)의 줄수가 맞지 않아서
-- 3
select sum(comm) from emp;
-- 4 -- 중복 다 처리
select 
sum(distinct sal),
sum(all sal),
sum(sal)
from emp;
--5 
select count(*) from emp;
--6
select count(*) from emp where deptno=30;
--7
select 
count(distinct sal),
count(all sal),
count(sal)
from emp;
--8 
select count(comm) from emp;
--9
select count(comm) from emp where comm is not null;
--10
select max(sal) from emp where deptno=10;
--11
select min(sal) from emp where deptno=10;
--12
select max(hiredate) from emp where deptno=20;
--13
select min(hiredate) from emp where deptno=20;
--14
select avg(sal) from emp where deptno=30;
--15
select avg(distinct sal) from emp where deptno=30;
-- 16
select avg(sal), deptno from emp where deptno=10 group by deptno union all
select avg(sal), deptno from emp where deptno=20 group by deptno union all
select avg(sal), deptno from emp where deptno=30 group by deptno ;
-- 17
select avg(sal), deptno from emp group by deptno;
-- 18
select deptno, job, avg(sal) from emp group by deptno, job order by deptno asc, job asc, avg(sal) asc;
--19
SELECT ENAME, DEPTNO, AVG(SAL)
  FROM EMP
GROUP BY DEPTNO;
-- ENAME GROUP BY에도 없고, 집계 함수도 아니라서
--20
select deptno, job, avg(sal)
from emp
group by deptno, job
having avg(sal)>=2000;
--21
SELECT DEPTNO, JOB, AVG(SAL)
  FROM EMP
 WHERE AVG(SAL) >= 2000
GROUP BY DEPTNO, JOB
ORDER BY DEPTNO, JOB;
-- where에서는 집계 함수 사용 안 됨
--22
select deptno, job, avg(sal)
from emp
group by deptno, job
having avg(sal)>=2000;
--23
select deptno, job, avg(sal)
from emp
where sal
group by deptno, job
having avg(sal)>=2000;
--24
select
deptno,
job,
count(*),
max(sal),
sum(sal),
avg(sal)
from emp
group by deptno, job
order by deptno, job;


